package com.example.leetcode.tree;

public class _129_SumNumbers {

    public static void main(String[] args) {
        int result = sumNumbers(createTree());
        System.out.println(result);
    }

    private static TreeNode createTree() {
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

    public static int sumNumbers(TreeNode root) {

        int  current = 0;
        return  sum(root,current);
    }

    private static int sum(TreeNode root, int current) {
        if(root == null){
            return 0;
        }
        current = current * 10 +root.val;
        if(root.left == null && root.right == null){
            return current;
        }
        int left = 0;
        int right = 0;

        if(root.left != null ){
            left = sum(root.left,current);
        }

        if(root.right != null ){
            right = sum(root.right,current);
        }
        return left + right;
    }
}
