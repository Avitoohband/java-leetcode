package src.easy.mergetwosortedlists;

import src.util.ListNode;

public class MergeTwoSortedListsV3 {
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
                    mergedPointer.next = list1;
                    list1 = list1.next;
                } else {
                    mergedPointer.next = list2;
                    list2 = list2.next;
                }
                mergedPointer = mergedPointer.next;
            }
            mergedPointer.next = list1 == null ? list2 : list1;
            return mergedHead.next;
        }
    }
}
