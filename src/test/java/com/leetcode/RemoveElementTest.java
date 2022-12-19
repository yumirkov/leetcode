package com.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class RemoveElementTest {

    RemoveElement solution = new RemoveElement();

    /**
     * Input: nums = [3,2,2,3], val = 3
     * Output: 2, nums = [2,2,_,_]
     * Explanation: Your function should return k = 2,
     * with the first two elements of nums being 2.
     * It does not matter what you leave beyond the returned k
     * (hence they are underscores).
     */
    @Test
    void example1() {
        // given
        var nums = new int[]{3, 2, 2, 3};
        var val = 3;
        var expectedVal = 2;
        var expectedNums = new int[]{2, 2};
        // when
        int actualVal = solution.removeElement(nums, val);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }

    /**
     * Input: nums = [0,1,2,2,3,0,4,2], val = 2
     * Output: 5, nums = [0,1,4,0,3,_,_,_]
     * Explanation: Your function should return k = 5,
     * with the first five elements of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k
     * (hence they are underscores).
     */
    @Test
    void example2() {
        // given
        var nums = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
        var val = 2;
        var expectedVal = 5;
        var expectedNums = new int[]{0, 1, 4, 0, 3};
        // when
        int actualVal = solution.removeElement(nums, val);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }

    /**
     * Input: nums = [3,3,3,3], val = 3
     * Output: 0, nums = [_,_,_,_]
     * Explanation: Your function should return k = 5,
     * with the first five elements of nums containing 0, 0, 1, 3, and 4.
     * Note that the five elements can be returned in any order.
     * It does not matter what you leave beyond the returned k
     * (hence they are underscores).
     */
    @Test
    void ownCase1() {
        // given
        var nums = new int[]{3, 3, 3, 3};
        var val = 3;
        var expectedVal = 0;
        var expectedNums = new int[]{};
        // when
        int actualVal = solution.removeElement(nums, val);
        // then
        assertEquals(expectedVal, actualVal);
        List<Integer> actual = Arrays.stream(nums).limit(expectedVal).boxed().toList();
        List<Integer> expected = Arrays.stream(expectedNums).boxed().toList();
        assertTrue(actual.containsAll(expected));
    }
}