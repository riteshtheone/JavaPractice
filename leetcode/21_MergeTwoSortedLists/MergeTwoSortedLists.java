class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        var listNode = new ListNode();
        return listNode;
    }
    
    public static void main(String[] args) {
        var sc = new java.util.Scanner(System.in);
        // System.out.println("hello");
        var l = new ListNode(6);
        System.out.println(l.val);

        sc.close();
    }
}

class ListNode {
   int val;
   ListNode next;
   ListNode() {}
   ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
