package src.easy.reverselinkedlist;

import src.util.ListNode;

import java.awt.event.KeyListener;
import java.util.List;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }
    public static ListNode reverseList(ListNode head){
        ListNode prev = null;
        ListNode temp;


        while(head != null){
            temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }
}
