package com.leetcode;

/**
 * Given an integer num, return the number of steps to reduce it to zero.
 * In one step, if the current number is even, you have to divide it by 2,
 * otherwise, you have to subtract 1 from it.
 */
public class NumberOfStepsToReduceANumberToZero {

    public int numberOfSteps(int num) {
        return num == 0
                ? 0
                : 1 + (num % 2 == 0
                        ? numberOfSteps(num / 2)
                        : numberOfSteps(num - 1)
                );
    }

}
