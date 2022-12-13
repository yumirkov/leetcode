package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RichestCustomerWealthTest {

    RichestCustomerWealth solution = new RichestCustomerWealth();

    /**
     * Input: accounts = [[1,2,3],[3,2,1]]
     * Output: 6
     * Explanation:
     * 1st customer has wealth = 1 + 2 + 3 = 6
     * 2nd customer has wealth = 3 + 2 + 1 = 6
     * Both customers are considered the richest with a wealth of 6 each, so return 6.
     */
    @Test
    void example1() {
        // given
        var accounts = new int[][] {{1,2,3},{3,2,1}};
        var expected = 6;
        // when
        int actual = solution.maximumWealth(accounts);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: accounts = [[1,5],[7,3],[3,5]]
     * Output: 10
     * Explanation:
     * 1st customer has wealth = 6
     * 2nd customer has wealth = 10
     * 3rd customer has wealth = 8
     * The 2nd customer is the richest with a wealth of 10.
     */
    @Test
    void example2() {
        // given
        var accounts = new int[][] {{1,5},{7,3}, {3,5}};
        var expected = 10;
        // when
        int actual = solution.maximumWealth(accounts);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
     * Output: 17
     */
    @Test
    void example3() {
        // given
        var accounts = new int[][] {{2,8,7},{7,1,3}, {1,9,5}};
        var expected = 17;
        // when
        int actual = solution.maximumWealth(accounts);
        // then
        assertEquals(expected, actual);
    }

}