public class CombSort {

    public static void sortByCombSort(int[] array){
        boolean sorted = false;
        int gap = array.length-1;
        if(array[0]>array[gap]){
            int aux = array[0]; array[0] = array[gap]; array[gap] = aux;
        }
        while (!sorted || gap>1){
            if(gap>1) gap = (int)(Math.floor(gap/1.3));
            sorted = true;
            int i = 0;
            while (i+gap < array.length){
                if(array[i]>array[i+gap]){
                    int aux = array[i]; array[i] = array[i+gap]; array[i+gap] = aux;
                    sorted = false;
                }
                i++;
            }
        }
    }
}
