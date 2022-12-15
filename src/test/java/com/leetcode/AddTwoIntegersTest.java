package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoIntegersTest {

    AddTwoIntegers solution = new AddTwoIntegers();

    /**
     * Input: num1 = 12, num2 = 5
     * Output: 17
     * Explanation: num1 is 12, num2 is 5,
     * and their sum is 12 + 5 = 17, so 17 is returned.
     */
    @Test
    void example1() {
        // given
        var num1 = 12;
        var num2 = 5;
        var expected = 17;
        // when
        int actual = solution.sum(num1, num2);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: num1 = -10, num2 = 4
     * Output: -6
     * Explanation: num1 + num2 = -6, so -6 is returned.
     */
    @Test
    void example2() {
        // given
        var num1 = -10;
        var num2 = 4;
        var expected = -6;
        // when
        int actual = solution.sum(num1, num2);
        // then
        assertEquals(expected, actual);
    }
}