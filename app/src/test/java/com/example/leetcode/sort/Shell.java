package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 希尔排序
 * 插入排序的优化
 */
public class Shell {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1};
        sortShell(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortShell(int[] nums){
        int length = nums.length;

        //增量 每次是上次的一半
        for (int gap = length/2;gap>0;gap = gap/2){//确定分组
            for(int i = gap;i < length;i++){
                //每个组内 插入
                insert(nums,i,gap);
            }

        }
    }

    private static void insert(int[] nums, int i, int gap) {
        while ((i - gap) >= 0){
            if(nums[i] < nums[i - gap]){
                int temp = nums[i];
                nums[i] = nums[i - gap];
                nums[i - gap] = temp;

                i = i - gap;
            }else {
                break;
            }

        }
    }


}
