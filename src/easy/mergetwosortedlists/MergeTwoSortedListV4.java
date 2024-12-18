package src.easy.mergetwosortedlists;

import src.util.ListNode;

public class MergeTwoSortedListV4 {
    public static void main(String[] args) {

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (list1 != null && list2 != null){
            if(list1.val < list2.val){
                current.next = new ListNode(list1.val);
                list1 = list1.next;
            }else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            current = current.next;
        }

//        while(list1 != null){
//            current.next = new ListNode(list1.val);
//            list1 = list1.next;
//        }
//
//        while(list2 != null){
//            current.next = new ListNode(list2.val);
//            list2 = list2.next;
//        }

        current.next = list1 == null ? list2 : list1;

        return dummyHead.next;
    }
}
