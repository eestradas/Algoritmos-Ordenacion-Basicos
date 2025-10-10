public class InsertionSort {

    public static void sortByInsertion(int[] array){
        for(int i = 1; i < array.length; i++) {
            int aux = array[i];
            int k = i;
            while (k>0 && array[k-1]>aux){
                array[k] = array[k-1];
                k--;
            }
            array[k] = aux;
        }
    }
}
