package src.easy.mergetwosortedlists;

import src.util.ListNode;

import java.util.Objects;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
    }

    class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            if (Objects.isNull(list1)) return list2;
            if (Objects.isNull(list2)) return list1;

            ListNode tempHead = new ListNode(-1);
            ListNode current = tempHead;

            while (Objects.nonNull(list1) && Objects.nonNull(list2)) {
                ListNode temp;
                if (list1.val < list2.val) {
                    temp = new ListNode(list1.val);
                    list1 = list1.next;
                } else {
                    temp = new ListNode(list2.val);
                    list2 = list2.next;
                }
                current.next = temp;
                current = current.next;
            }
            fillWithRestOfList(current, list1);
            fillWithRestOfList(current, list2);

            return tempHead.next;
        }

        private void fillWithRestOfList(ListNode head, ListNode list) {
            while(Objects.nonNull(list)){
                head.next = new ListNode(list.val);
                list = list.next;
                head = head.next;
            }
        }
    }
}
