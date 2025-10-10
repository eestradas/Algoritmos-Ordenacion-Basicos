public class BubbleSort {

    public static void sortByBubble(int[] array){
        for(int j = array.length-1;j>=0;j--)
            for(int i = 0; i< j; i++){
                if(array[i]>array[i+1]){
                    int aux = array[i];array[i] = array[i+1]; array[i+1] = aux;
                }
            }
    }

    public static void sortByBubbleOptimized(int[] array){
        boolean sorted = false;
        int j = array.length-1;
        while (!sorted){
            sorted = true;
            for(int i = 0; i<j; i++){
                if(array[i]>array[i+1]) {
                    int aux = array[i]; array[i] = array[i+1]; array[i+1] = aux;
                    sorted = false;
                }
            }
            j--;
        }
    }
}
