package com.example.leetcode.sort;

import java.util.Arrays;

public class Merge2 {
    public static void main(String[] args) {
        int[] nums = {3,5,2,1};
        sortMerge2(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    private static void sortMerge2(int[] nums,int left,int right){

        if(left >= right){
            return;
        }
        int mid = (left + right)/2;

        sortMerge2(nums,left,mid);
        sortMerge2(nums,mid+1,right);

        merge2(nums,left,mid,right);

    }

    private static void merge2(int[] nums, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int[] temp = new int[right - left +1];
        int t = 0;
        while (i <= mid && j <= right){
            if(nums[i] > nums[j]){
                temp[t] = nums[j];
                j++;
            }else {
                temp[t] = nums[i];
                i++;
            }
            t++;
        }

        if(i <= mid){
            System.arraycopy(nums,i,temp,t,mid - i +1);
        }

        if(j <= right){
            System.arraycopy(nums,j,temp,t,right - j +1);
        }

        System.arraycopy(temp,0,nums,left,temp.length);
    }
}
