package com.leetcode.linkedlist;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;

        ListNode mergedList = new ListNode();
        ListNode mergedListHead = mergedList;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    mergedList.val = list1.val;
                    list1 = list1.next;
                } else {
                    mergedList.val = list2.val;
                    list2 = list2.next;
                }

            } else if (list1 != null) {
                mergedList.val = list1.val;
                list1 = list1.next;
            } else {
                mergedList.val = list2.val;
                list2 = list2.next;
            }

            if (list1 != null || list2 != null) {
                mergedList.next = new ListNode();
                mergedList = mergedList.next;
            }

        }

        return mergedListHead;
    }
}
