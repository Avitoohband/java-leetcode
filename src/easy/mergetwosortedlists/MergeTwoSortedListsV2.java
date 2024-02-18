package src.easy.mergetwosortedlists;

import src.util.ListNode;

public class MergeTwoSortedListsV2 {
    public static void main(String[] args) {
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (list1 == null || list2 == null) {
                return list1 == null ? list2 : list1;
            }

            ListNode mergedHead = new ListNode(0);
            ListNode mergedPointer = mergedHead;

            while (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    mergedPointer.next = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    mergedPointer.next = new ListNode(list2.val);
                    list2 = list2.next;
                }
                mergedPointer = mergedPointer.next;
            }
            while (list1 != null) {
                mergedPointer.next = new ListNode(list1.val);
                list1 = list1.next;
                mergedPointer = mergedPointer.next;
            }
            while (list2 != null) {
                mergedPointer.next = new ListNode(list2.val);
                list2 = list2.next;
                mergedPointer = mergedPointer.next;
            }
            return mergedHead.next;
        }
    }
}
