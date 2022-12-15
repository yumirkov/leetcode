package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RomanToIntegerTest {

    RomanToInteger solution = new RomanToInteger();

    /**
     * Input: s = "III"
     * Output: 3
     * Explanation: III = 3.
     */
    @Test
    void example1() {
        // given
        var input = "MCMXCIV";
        var expected = 1994;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: s = "LVIII"
     * Output: 58
     * Explanation: L = 50, V= 5, III = 3.
     */
    @Test
    void example2() {
        // given
        var input = "LVIII";
        var expected = 58;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: s = "MCMXCIV"
     * Output: 1994
     * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
     */
    @Test
    void example3() {
        // given
        var input = "III";
        var expected = 3;
        // when
        var actual = solution.romanToInt(input);
        // then
        assertEquals(expected, actual);
    }
}