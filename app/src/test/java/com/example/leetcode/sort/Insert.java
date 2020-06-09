package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 插入排序
 */
public class Insert {

    static int[] nums = {5,2,3,1};
    public static void main(String[] args) {
        sort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sort(int[] nums){
        if(nums.length <= 1){
            return;
        }
        int temp;
        for (int i = 1,length = nums.length;i < length ; i ++){
            for (int j = i - 1;j >=0;j--){
              if(nums[j] > nums[j+1]){
                  temp = nums[j];
                  nums[j] = nums[j+1];
                  nums[j+1] = temp;

              }
            }
        }
    }
}
