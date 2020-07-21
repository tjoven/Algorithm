package com.example.leetcode;
import com.example.leetcode.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class _95_SearchTree {

    public List<TreeNode> generateTrees(int n) {

        if( n == 0){
            return new ArrayList<>();
        }
        return generateTrees(1,n);

    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> nodes = new ArrayList<>();
        if(start > end){
            nodes.add(null);
            return nodes;
        }

        for (int i = start;i <= end;i++ ){
            List<TreeNode> left = generateTrees(start,i-1);
            List<TreeNode> right = generateTrees(i+1,end);

            for ( TreeNode nodeL:left) {
                for (TreeNode nodeR: right) {
                    TreeNode node = new TreeNode(i);

                    node.left = nodeL;
                    node.right = nodeR;

                    nodes.add(node);
                }
            }
        }

        return nodes;

    }


}
