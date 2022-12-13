package com.leetcode;

import com.leetcode.RootEqualsSumOfChildren.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RootEqualsSumOfChildrenTest {

    RootEqualsSumOfChildren solution = new RootEqualsSumOfChildren();

    @Test
    void example1() {
        // given
        // root = [10,4,6]
        TreeNode left = new TreeNode(4);
        TreeNode right = new TreeNode(6);
        TreeNode root = new TreeNode(10, left, right);
        boolean expected = true;
        // when
        boolean actual = solution.checkTree(root);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void example2() {
        // given
        // root = [5,3,1]
        TreeNode left = new TreeNode(5, null, null);
        TreeNode right = new TreeNode(3, null, null);
        TreeNode root = new TreeNode(1, left, right);
        boolean expected = false;
        // when
        boolean actual = solution.checkTree(root);
        // then
        assertEquals(expected, actual);
    }
}