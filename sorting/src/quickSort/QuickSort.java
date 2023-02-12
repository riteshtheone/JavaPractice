package quickSort;

public class QuickSort {

    private void swap(int[] array, int i, int j){
        var temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int partition(int[] array, int li, int hi){
        var pp = hi;    //  pp -> Pivot Pointer
        var pi = --li;  //  pi -> Partition Index
        while(++li < hi)
            if(array[li] < array[pp])
                swap(array, ++pi, li);
        swap(array, ++pi, pp);
        return pi;
    }

    private void sort(int[] array, int li, int hi){
        if(li < hi){
            var pi = partition(array, li, hi);
            sort(array, li, pi-1);
            sort(array, pi+1, hi);
        }
    }

    public int[] quickSort(int[] array){
        sort(array, 0, array.length-1);
        return array;
    }

    public static void main(String[] args){
        int[] array = {9,7,5,3,1,7,0};
        array = new QuickSort().quickSort(array);
        for(var e : array) System.out.print(e + " ");
        System.out.println();
    }
}
