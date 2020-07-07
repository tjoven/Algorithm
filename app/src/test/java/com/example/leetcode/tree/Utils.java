package com.example.leetcode.tree;

public class Utils {

    public static TreeNode createTree() {
        int[]  nums = {1,2,3};
        TreeNode root = new TreeNode(nums[0]);
        for(int i = 0 ;i < nums.length/2 ; i++){

            TreeNode nodeL = new TreeNode(nums[2 * i +1]);
            TreeNode nodeR = new TreeNode(nums[2 * i + 2]);


            root.left = nodeL;
            root.right = nodeR;
        }
        return root;
    }
}
