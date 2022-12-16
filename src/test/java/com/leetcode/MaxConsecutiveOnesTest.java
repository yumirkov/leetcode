package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes solution = new MaxConsecutiveOnes();

    /**
     * Input: nums = [1,1,0,1,1,1]
     * Output: 3
     * Explanation: The first two digits or the last three digits are consecutive 1s.
     * The maximum number of consecutive 1s is 3.
     */
    @Test
    void example1() {
        // given
        var nums = new int[]{1, 1, 0, 1, 1, 1};
        var expected = 3;
        // when
        int actual = solution.findMaxConsecutiveOnes(nums);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: nums = [1,0,1,1,0,1]
     * Output: 2
     */
    @Test
    void example2() {
        // given
        var nums = new int[]{1, 0, 1, 1, 0, 1};
        var expected = 2;
        // when
        int actual = solution.findMaxConsecutiveOnes(nums);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: nums = [0]
     * Output: 0
     */
    @Test
    void testExample1() {
        // given
        var nums = new int[]{0};
        var expected = 0;
        // when
        int actual = solution.findMaxConsecutiveOnes(nums);
        // then
        assertEquals(expected, actual);
    }

}