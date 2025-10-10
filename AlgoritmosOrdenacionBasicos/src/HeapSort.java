public class HeapSort {

    public static void sortByHeapSort(int[] array){
        createMaxHeap(array);
        for(int i = array.length-1;i>0;i--){
            int aux=array[i]; array[i]=array[0]; array[0]=aux;
            keepHeap(array,i-1);
        }
    }

    private static void createMaxHeap(int[] array) {
        int n = array.length;
        for(int i = (n/2)-1; i >= 0; i--){
            keepHeap(array,n-1,i);
        }
    }

    private static void keepHeap(int[] array, int end) {
        keepHeap(array,end,0);
    }

    private static void keepHeap(int[] array, int end, int i) {
        int bigger = i;
        int left = 2 * i+1;
        int right = 2 * i+2;

        if (left<=end && array[left]>array[bigger]) bigger = left;
        if(right<=end && array[right]>array[bigger]) bigger = right;
        if(bigger!=i){
            int aux = array[i]; array[i] = array[bigger]; array[bigger] = aux;
            keepHeap(array,end,bigger);
        }
    }
}
