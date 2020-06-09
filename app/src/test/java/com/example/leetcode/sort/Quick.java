package com.example.leetcode.sort;

import java.util.Arrays;

public class Quick {

    public static void sort(int[] nums){
        sortArrayQuick(nums,0,nums.length - 1);
        System.out.print(Arrays.toString(nums));
    }
    public static void sortArrayQuick(int[] nums,int l,int r) {
        if(l >= r){
           return;
        }
       int midIndex = getMid(nums,l,r);
       sortArrayQuick(nums,l,midIndex - 1);
       sortArrayQuick(nums,midIndex + 1,r);


    }

    private static int getMid(int[] nums, int l, int r) {
        int X = nums[l];//基准
        while (l < r){
            while (l < r && nums[r] > X){
                r--;
            }
            if(l < r){
                nums[l] = nums[r];
                l++;
            }
            while (l < r && nums[l] < X){
                l++;
            }
            if(l < r){
                nums[r] = nums[l];
                r--;
            }
        }

        nums[l] = X;
        return l;

    }

}
