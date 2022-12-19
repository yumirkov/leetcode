package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayTest {

    RemoveDuplicatesFromSortedArray solution = new RemoveDuplicatesFromSortedArray();

    /**
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2,_]
     * Explanation: Your function should return k = 2,
     * with the first two elements of nums being 1 and 2 respectively.
     * It does not matter what you leave beyond the returned k
     * (hence they are underscores).
     */
    @Test
    void example1() {
        // given
        var nums = new int[] {1,1,2};
        var expectedNums = new int[] {1,2};
        var expectedVal = 2;
        // when
        int actualVal = solution.removeDuplicates(nums);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }

    /**
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
     * Explanation: Your function should return k = 5,
     * with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
     * It does not matter what you leave beyond the returned k
     * (hence they are underscores).
     */
    @Test
    void example2() {
        // given
        var nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        var expectedNums = new int[] {0,1,2,3,4};
        var expectedVal = 5;
        // when
        int actualVal = solution.removeDuplicates(nums);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }

    /**
     * Input: nums = [1,2,2]
     * Output: 2, nums = [1,2,_]
     */
    @Test
    void testExample236() {
        // given
        var nums = new int[] {1,2, 2};
        var expectedNums = new int[] {1,2};
        var expectedVal = 2;
        // when
        int actualVal = solution.removeDuplicates(nums);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }

}