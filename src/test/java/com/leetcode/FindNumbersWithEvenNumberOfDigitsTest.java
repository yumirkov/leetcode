package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumbersWithEvenNumberOfDigitsTest {

    FindNumbersWithEvenNumberOfDigits solution = new FindNumbersWithEvenNumberOfDigits();

    /**
     * Input: nums = [12,345,2,6,7896]
     * Output: 2
     * Explanation:
     * 12 contains 2 digits (even number of digits).
     * 345 contains 3 digits (odd number of digits).
     * 2 contains 1 digit (odd number of digits).
     * 6 contains 1 digit (odd number of digits).
     * 7896 contains 4 digits (even number of digits).
     * Therefore only 12 and 7896 contain an even number of digits.
     */
    @Test
    void example1() {
        // given
        var nums = new int[]{12, 345, 2, 6, 7896};
        var expected = 2;
        // when
        int actual = solution.findNumbers(nums);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     */
    @Test
    void example2() {
        // given
        var nums = new int[]{555, 901, 482, 1771};
        var expected = 1;
        // when
        int actual = solution.findNumbers(nums);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: nums = [555,901,482,1771]
     * Output: 1
     * Explanation:
     * Only 1771 contains an even number of digits.
     */
    @Test
    void ownExample1() {
        // given
        var nums = new int[]{1, 10, 100, 1000, 10000, 100000};
        var expected = 3;
        // when
        int actual = solution.findNumbers(nums);
        // then
        assertEquals(expected, actual);
    }

}