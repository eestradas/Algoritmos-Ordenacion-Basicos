public class SelectionSort {

    public static void sortBySelection(int[] array) {
        for (int i = 0; i < array.length; i++){
            int k = i;
            for(int j = i+1; j< array.length;j++) {
                if(array[j]<array[k]) k = j;
            }
            int aux = array[i]; array[i] = array[k]; array[k] = aux;
        }
    }
}
