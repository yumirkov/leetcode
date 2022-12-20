package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CheckIfNAndItsDoubleExistTest {

    CheckIfNAndItsDoubleExist solution = new CheckIfNAndItsDoubleExist();

    /**
     * Input: arr = [10,2,5,3]
     * Output: true
     * Explanation: For i = 0 and j = 2,
     * arr[i] == 10 == 2 * 5 == 2 * arr[j]
     */
    @Test
    void example1() {
        // given
        var arr = new int[]{10, 2, 5, 3};
        var expected = true;
        // when
        boolean actual = solution.checkIfExist(arr);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: arr = [3,1,7,11]
     * Output: false
     * Explanation: There is no i and j that satisfy the conditions.
     */
    @Test
    void example2() {
        // given
        var arr = new int[]{3, 1, 7, 11};
        var expected = false;
        // when
        boolean actual = solution.checkIfExist(arr);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: arr = [-20,8,-6,-14,0,-19,14,4]
     * Output: true
     */
    @Test
    void example3() {
        // given
        var arr = new int[]{-20,8,-6,-14,0,-19,14,4};
        var expected = true;
        // when
        boolean actual = solution.checkIfExist(arr);
        // then
        assertEquals(expected, actual);
    }

}