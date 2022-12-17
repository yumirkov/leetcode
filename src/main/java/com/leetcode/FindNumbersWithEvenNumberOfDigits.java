package com.leetcode;

/**
 * Given an array nums of integers,
 * return how many of them contain an even number of digits.
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        var result = 0;
        for (int number : nums) {
            int currentDigits = 0;
            while (number > 0) {
                currentDigits++;
                if (number > 9) currentDigits++;
                number /= 100;
            }
            if (currentDigits % 2 == 0) result++;
        }
        return result;
    }

}
