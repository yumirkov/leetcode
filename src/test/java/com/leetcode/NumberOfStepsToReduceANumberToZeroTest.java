package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStepsToReduceANumberToZeroTest {

    NumberOfStepsToReduceANumberToZero solution = new NumberOfStepsToReduceANumberToZero();

    /**
     * Input: num = 14
     * Output: 6
     * Explanation:
     * Step 1) 14 is even; divide by 2 and obtain 7.
     * Step 2) 7 is odd; subtract 1 and obtain 6.
     * Step 3) 6 is even; divide by 2 and obtain 3.
     * Step 4) 3 is odd; subtract 1 and obtain 2.
     * Step 5) 2 is even; divide by 2 and obtain 1.
     * Step 6) 1 is odd; subtract 1 and obtain 0.
     */
    @Test
    void example1() {
        // given
        var num = 14;
        var expected = 6;
        // when
        int actual = solution.numberOfSteps(num);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: num = 8
     * Output: 4
     * Explanation:
     * Step 1) 8 is even; divide by 2 and obtain 4.
     * Step 2) 4 is even; divide by 2 and obtain 2.
     * Step 3) 2 is even; divide by 2 and obtain 1.
     * Step 4) 1 is odd; subtract 1 and obtain 0.
     */
    @Test
    void example2() {
        // given
        var num = 8;
        var expected = 4;
        // when
        int actual = solution.numberOfSteps(num);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: num = 123
     * Output: 12
     */
    @Test
    void example3() {
        // given
        var num = 123;
        var expected = 12;
        // when
        int actual = solution.numberOfSteps(num);
        // then
        assertEquals(expected, actual);
    }

}