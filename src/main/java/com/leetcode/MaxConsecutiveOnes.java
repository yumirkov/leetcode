package com.leetcode;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */
public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, current = 0;
        for (int num : nums) {
            if (num == 1) {
                max = Math.max(++current, max);
            } else {
                current = 0;
            }
        }
        return max;
    }

}
