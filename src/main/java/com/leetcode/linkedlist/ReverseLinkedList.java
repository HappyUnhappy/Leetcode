package com.leetcode.linkedlist;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return null;

        ListNode currentListNodeLink = head;
        ListNode nextListNodeLink = head.next;
        ListNode switchToLink = null;

        while(nextListNodeLink != null) {
            currentListNodeLink.next = switchToLink;
            switchToLink = currentListNodeLink;
            currentListNodeLink = nextListNodeLink;
            nextListNodeLink = currentListNodeLink.next;
        }

        currentListNodeLink.next = switchToLink;
        return currentListNodeLink;
    }
}
