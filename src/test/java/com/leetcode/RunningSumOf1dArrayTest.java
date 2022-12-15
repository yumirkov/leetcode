package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RunningSumOf1dArrayTest {

    RunningSumOf1dArray solution = new RunningSumOf1dArray();

    /**
     * Input: nums = [1,2,3,4]
     * Output: [1,3,6,10]
     * Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
     */
    @Test
    void example1() {
        // given
        var nums = new int[]{1, 2, 3, 4};
        var expected = new int[]{1, 3, 6, 10};
        // when
        int[] actual = solution.runningSum(nums);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: nums = [1,1,1,1,1]
     * Output: [1,2,3,4,5]
     * Explanation: Running sum is obtained as follows:
     * [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
     */
    @Test
    void example2() {
        // given
        var nums = new int[]{1, 1, 1, 1, 1};
        var expected = new int[]{1, 2, 3, 4, 5};
        // when
        int[] actual = solution.runningSum(nums);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: nums = [3,1,2,10,1]
     * Output: [3,4,6,16,17]
     */
    @Test
    void example3() {
        // given
        var nums = new int[]{3, 1, 2, 10, 1};
        var expected = new int[]{3, 4, 6, 16, 17};
        // when
        int[] actual = solution.runningSum(nums);
        // then
        assertArrayEquals(expected, actual);
    }

}