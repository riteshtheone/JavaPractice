// package insertionSort;

public class InsertionSort {

    public int[] insertionSort(int[] array){
        for(var i = 1; i < array.length; i++){
            var current = array[i];
            var j = i-1;
            while(j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {5,8,3,9,2,9,6,5,4,3};
        array = new InsertionSort().insertionSort(array);
        for(var e : array) System.out.print(e + " ");
        System.out.println();
    }
    
}
