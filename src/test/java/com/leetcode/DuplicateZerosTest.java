package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class DuplicateZerosTest {

    DuplicateZeros solution = new DuplicateZeros();

    /**
     * Input: arr = [1,0,2,3,0,4,5,0]
     * Output: [1,0,0,2,3,0,0,4]
     * Explanation: After calling your function,
     * the input array is modified to: [1,0,0,2,3,0,0,4]
     */
    @Test
    void example1() {
        // given
        var actual = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        var expected = new int[]{1, 0, 0, 2, 3, 0, 0, 4};
        // when
        solution.duplicateZeros(actual);
        // then
        assertArrayEquals(expected, actual);
    }

    /**
     * Input: arr = [1,2,3]
     * Output: [1,2,3]
     * Explanation: After calling your function,
     * the input array is modified to: [1,2,3]
     */
    @Test
    void example2() {
        // given
        var actual = new int[]{1, 2, 3};
        var expected = new int[]{1, 2, 3};
        // when
        solution.duplicateZeros(actual);
        // then
        assertArrayEquals(expected, actual);
    }

}