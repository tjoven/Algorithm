package com.example.leetcode;

import java.util.Arrays;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *
 */
public class _167_twoSum {
    public static void main(String[] args) {

    }

    public int[] twoSum(int[] numbers, int target) {
        int lIndex = 1;
        int rIndex = numbers.length;
        int[] res  = new int[2];
        while (lIndex < rIndex){
            int left = numbers[lIndex - 1];
            int right = numbers[rIndex - 1];
            if( left + right == target){
                res[0] = lIndex ;
                res[1] = rIndex ;
                return res;
            }else if(left + right < target){
                lIndex++;
            }else {
                rIndex--;
            }
        }
        return res;
    }
}
