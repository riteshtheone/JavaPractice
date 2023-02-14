// package bubbleSort;

public class BubbleSort {

    private static void swap(int[] array, int a, int b){
        var temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public int[] bubbleSort(int[] array){
        for(var i=0; i<array.length-1; i++)
            for(var j=0; j<array.length-1-i; j++)
                if(array[j] > array[j+1])
                    swap(array, j, j+1);
        return array;
    }

    public static void main(String[] args){
        int[] array = {7,8,4,2,3,1,0};
        array = new BubbleSort().bubbleSort(array);
        for(var e : array) System.out.println(e);
    }
    
}
