package com.example.leetcode.tree;

public class _129_SumNumbers {

    public static void main(String[] args) {
        int result = sumNumbers(Utils.createTree());
        System.out.println(result);
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
