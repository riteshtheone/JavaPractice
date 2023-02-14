// package mergeSort;

public class MergeSort {

    private static void mergeArray(int[] array, int si, int mi, int ei){
        int[] tempArray = new int[ei-si+1];
        var tempArrayPointer = 0;
        var tsi = si;
        var tmi = mi+1;
        while(tsi <= mi && tmi <= ei)
            tempArray[tempArrayPointer++] = (array[tsi] <= array[tmi]) ? array[tsi++] : array[tmi++] ;
        while(tsi <= mi)
            tempArray[tempArrayPointer++] = array[tsi++];
        while(tmi <= ei)
            tempArray[tempArrayPointer++] = array[tmi++];
        tempArrayPointer=0;
        while(si <= ei) array[si++] = tempArray[tempArrayPointer++];
    }
    private static void sort(int[] array, int si, int ei){
        if(si < ei){
            var mi = si + (ei-si)/2;
            sort(array, si, mi);
            sort(array, (mi+1), ei);
            mergeArray(array, si, mi, ei);
        }
	}
    public int[] mergeSort(int[] array){ 
        sort(array, 0, array.length-1);
	    return array;
    }

    public static void main(String[] args){
        int[] array = {3,2,1,9,8,7};
        array = new MergeSort().mergeSort(array);
        for(var e : array) System.out.print(e + " ");
        System.out.println();
    }
    
}
