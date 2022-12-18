package com.leetcode;

/**
 * Given a fixed-length integer array arr,
 * duplicate each occurrence of zero, shifting the remaining elements to the right.
 * Note that elements beyond the length of the original array are not written.
 * Do the above modifications to the input array in place and do not return anything.
 */
public class DuplicateZeros {

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                if (i + 1 < arr.length - 1) {
                    System.arraycopy(arr, i + 1, arr, i + 2, arr.length - i - 2);
                }
                arr[i++ + 1] = 0;
            }
        }
    }

}
