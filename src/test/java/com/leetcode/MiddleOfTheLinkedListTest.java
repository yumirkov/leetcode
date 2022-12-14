package com.leetcode;

import com.leetcode.MiddleOfTheLinkedList.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiddleOfTheLinkedListTest {

    MiddleOfTheLinkedList solution = new MiddleOfTheLinkedList();

    /**
     * Input: head = [1,2,3,4,5]
     * Output: [3,4,5]
     * Explanation: The middle node of the list is node 3.
     */
    @Test
    void example1() {
        // given
        var expected = new ListNode(3, new ListNode(4, new ListNode(5)));
        var head = new ListNode(1, new ListNode(2, expected));
        // when
        ListNode actual = solution.middleNode(head);
        // then
        assertEquals(expected.val, actual.val);
    }

    /**
     * Input: head = [1,2,3,4,5,6]
     * Output: [4,5,6]
     * Explanation: Since the list has two middle nodes with values 3 and 4,
     * we return the second one.
     */
    @Test
    void example2() {
        // given
        var expected = new ListNode(4, new ListNode(5, new ListNode(6)));
        var head = new ListNode(1, new ListNode(2, new ListNode(3, expected)));
        // when
        ListNode actual = solution.middleNode(head);
        // then
        assertEquals(expected.val, actual.val);
    }
}