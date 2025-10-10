import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] sampleSmall = {5,2,8,3,1};

        int[] sampleLarge = generateRandomArray(10000, 0, 10000);

        System.out.println("=== TESTS WITH SMALL ARRAY ===");
        runAllAlgorithmsOn(sampleSmall, true);

        System.out.println("\n=== LARGE ARRAY PERFORMANCE TESTS (10,000 elements) ===");
        runAllAlgorithmsOn(sampleLarge, false);
    }

    private static void runAllAlgorithmsOn(int[] original, boolean showContents) {
        System.out.println("Original array" + (showContents ? ": " + Arrays.toString(original) : " (not shown)"));

        // Selection

        int[] arr = Arrays.copyOf(original,original.length);
        long t0 = System.nanoTime();
        SelectionSort.sortBySelection(arr);
        long t1 = System.nanoTime();
        printResult("Selection",arr,t0,t1,showContents);

        // Insertion

        arr = Arrays.copyOf(original,original.length);
        t0 = System.nanoTime();
        InsertionSort.sortByInsertion(arr);
        t1 = System.nanoTime();
        printResult("Insertion",arr,t0,t1,showContents);

        // Bubble

        arr = Arrays.copyOf(original,original.length);
        t0 = System.nanoTime();
        BubbleSort.sortByBubble(arr);
        t1 = System.nanoTime();
        printResult("Bubble",arr,t0,t1,showContents);

        // Bubble Optimized

        arr = Arrays.copyOf(original,original.length);
        t0 = System.nanoTime();
        BubbleSort.sortByBubbleOptimized(arr);
        t1 = System.nanoTime();
        printResult("Bubble",arr,t0,t1,showContents);

        // CombSort

        arr = Arrays.copyOf(original,original.length);
        t0 = System.nanoTime();
        CombSort.sortByCombSort(arr);
        t1 = System.nanoTime();
        printResult("CombSort",arr,t0,t1,showContents);

        // HeapSort

        arr = Arrays.copyOf(original,original.length);
        t0 = System.nanoTime();
        HeapSort.sortByHeapSort(arr);
        t1 = System.nanoTime();
        printResult("HeapSort",arr,t0,t1,showContents);
    }

    private static void printResult(String name, int[] arr, long tStart, long tEnd, boolean showContents) {
        long elapsedMs = (tEnd-tStart)/1_000_000;
        if(showContents) {
            System.out.println(name + " -> result: " + Arrays.toString(arr) + " | time: " + elapsedMs + " ms");
        } else {
            System.out.println(name + " -> time: " + elapsedMs + " ms");
        }
    }

    private static int[] generateRandomArray(int size, int minInclusive, int maxExclusive) {
        Random rnd = new Random(12345);
        int[] a = new int[size];
        int bound = Math.max(1,maxExclusive-minInclusive);
        for (int i = 0; i < size; i++){
            a[i] = minInclusive + rnd.nextInt(bound);
        }
        return a;
    }
}