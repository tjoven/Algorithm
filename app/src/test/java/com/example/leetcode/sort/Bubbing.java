package com.example.leetcode.sort;

/**
 * 冒泡排序
 */
public class Bubbing {

    public int[] sortArray(int[] nums) {
        int length = nums.length;
        int curr;

        for(int i = 0; i < length;i++){
            for(int j = 0;j < length - i -1;j++){

                if(nums[j] > nums[j + 1]){
                    curr = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = curr;
                }

            }
        }
        return nums;
    }


}
