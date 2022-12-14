package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {

    FizzBuzz solution = new FizzBuzz();

    /**
     * Input: n = 3
     * Output: ["1","2","Fizz"]
     */
    @Test
    void example1() {
        // given
        var n = 3;
        var expected = Arrays.asList("1", "2", "Fizz");
        // when
        List<String> actual = solution.fizzBuzz(n);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: n = 5
     * Output: ["1","2","Fizz","4","Buzz"]
     */
    @Test
    void example2() {
        // given
        var n = 5;
        var expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz");
        // when
        List<String> actual = solution.fizzBuzz(n);
        // then
        assertEquals(expected, actual);
    }

    /**
     * Input: n = 15
     * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
     */
    @Test
    void example3() {
        // given
        var n = 15;
        var expected = Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz");
        // when
        List<String> actual = solution.fizzBuzz(n);
        // then
        assertEquals(expected, actual);
    }

}