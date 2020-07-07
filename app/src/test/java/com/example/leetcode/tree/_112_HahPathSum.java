package com.example.leetcode.tree;

import java.util.ArrayList;

public class _112_HahPathSum {

    ArrayList<Integer> list = new ArrayList<>();
    int count = 0;
    public static void main(String[] args) {
        _112_HahPathSum demo = new _112_HahPathSum();
        boolean result = demo.hasPathSum(Utils.createTree(),5);
        System.out.println(result);



    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){
            return false;
        }
        if(root.left == null
            && root.right == null
             &&root.val == sum){
            return true;
        }

        return hasPathSum(root.left,sum - root.val)
                ||  hasPathSum(root.right,sum - root.val);
    }

//    public boolean hasPathSum(TreeNode root, int sum) {
//        pathSum(root,count);
//        if(list.contains(sum)){
//            return true;
//        }
//        return false;
//    }
//
//    private void pathSum(TreeNode root,int count) {
//        if(root.left == null && root.right == null){
//            int sum =  count + root.val;
//            list.add(sum);
//        }
//        count = count + root.val;
//        if(root.left != null){
//            pathSum(root.left,count);
//        }
//        if(root.right != null){
//            pathSum(root.right,count);
//        }
//    }


}
