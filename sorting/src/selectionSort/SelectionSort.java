// package selectionSort;

public class SelectionSort {

    private static void swap(int[] array, int a, int b){
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int[] selectionSort(int[] array){
        int min;
        for(var i=0; i<array.length-1; i++){
            min = i;
            for(var j=i+1; j<array.length; j++)
                if(array[min] > array[j]) min=j;
            if(min != i) swap(array, min, i);
        }
        return array;
    }

    public static void main(String[] args){
        int[] array = {9,8,7,6,5,4,3,2,1,0};
        array = new SelectionSort().selectionSort(array);
        for(var e : array)  System.out.println(e);
    } 
    
}
