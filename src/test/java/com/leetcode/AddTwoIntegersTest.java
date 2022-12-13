package com.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTwoIntegersTest {

    AddTwoIntegers solution = new AddTwoIntegers();

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