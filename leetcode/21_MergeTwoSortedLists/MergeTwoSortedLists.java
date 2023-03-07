class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       var mergeList = new ListNode();
       var pointer = mergeList;
        while(list1 != null && list2 != null){
            if (list1.val <= list2.val) {
                pointer.next = list1;
                list1 = list1.next;
            }else{
                pointer.next = list2;
                list2 = list2.next;
            }
            pointer = pointer.next;
        }
        if(list1 != null) pointer.next = list1;
        if(list2 != null) pointer.next = list2;
       return mergeList.next;
    }

    public static void main(String[] args) {
        
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
