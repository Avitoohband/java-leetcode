package src.easy.hascycle;

import src.util.ListNode;

public class HasCycle {
    public boolean hasCycle(ListNode head) {
        if(head != null){
            ListNode fast = head.next;
            while(fast != null && fast.next != null){
                if(head == fast) return true;
                head = head.next;
                fast = fast.next.next;
            }
        }
        return false;
    }
}
