package com.leetcode;

/**
 * Given the head of a singly linked list, return the middle node of the linked list.
 * If there are two middle nodes, return the second middle node.
 */
public class MiddleOfTheLinkedList {

    public ListNode middleNode(ListNode head) {
        var middle = head;
        while (head != null && head.next != null) {
            middle = middle.next;
            head = head.next.next;
        }
        return middle;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
