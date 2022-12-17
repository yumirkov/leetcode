package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SquaresOfASortedArrayTest {

    SquaresOfASortedArray solution = new SquaresOfASortedArray();

    /**
     * Input: nums = [-4,-1,0,3,10]
     * Output: [0,1,9,16,100]
     * Explanation: After squaring, the array becomes [16,1,0,9,100].
     * After sorting, it becomes [0,1,9,16,100].
     */
    @Test
    void example1() {
        // given
        var nums = new int[]{-4, -1, 0, 3, 10};
        var expected = new int[]{0, 1, 9, 16, 100};
        // when
        int[] actual = solution.sortedSquares(nums);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: nums = [-7,-3,2,3,11]
     * Output: [4,9,9,49,121]
     */
    @Test
    void example2() {
        // given
        var nums = new int[]{-7, -3, 2, 3, 11};
        var expected = new int[]{4, 9, 9, 49, 121};
        // when
        int[] actual = solution.sortedSquares(nums);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: nums = [-5, -3, -2, -1]
     * Output: [1, 4, 9, 25]
     */
    @Test
    void testCase49() {
        // given
        var nums = new int[]{-5, -3, -2, -1};
        var expected = new int[]{1, 4, 9, 25};
        // when
        int[] actual = solution.sortedSquares(nums);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: nums = [-10000, -9999, -7, -5, 0, 0, 10000]
     * Output: [0, 0, 25, 49, 99980001, 100000000, 100000000]
     */
    @Test
    void testCase51() {
        // given
        var nums = new int[]{-10000, -9999, -7, -5, 0, 0, 10000};
        var expected = new int[]{0, 0, 25, 49, 99980001, 100000000, 100000000};
        // when
        int[] actual = solution.sortedSquares(nums);
        // then
        assertArrayEquals(expected, actual);
    }

}