package com.leetcode;

import java.util.HashSet;

/**
 * Given an array arr of integers,
 * check if there exist two indices i and j such that:
 * i != j
 * 0 <= i, j < arr.length
 * arr[i] == 2 * arr[j]
 */
public class CheckIfNAndItsDoubleExist {

    public boolean checkIfExist(int[] arr) {
        var integers = new HashSet<Integer>();
        for (int j : arr) {
            if (integers.contains(j * 2) || (j % 2 == 0 && integers.contains(j / 2))) return true;
            integers.add(j);
        }
        return false;
    }

}
