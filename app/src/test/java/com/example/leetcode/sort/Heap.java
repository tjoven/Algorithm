package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 堆排序
 * 1，构建一个大顶堆
 * 2，顶部元素和最后的元素 互换位置
 * 3，其他元素 构建大顶堆
 * 循环
 *
 * 最大值
 * 2 * index + 2 = length - 1
 */
public class Heap {

    public static void main(String[] args) {
        int[] nums = {0};
        sortHeap(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void sortHeap(int[] nums){
        int length = nums.length;

        //构建第一个最大堆 从最后一个非叶子节点开始
        //为什么是length/2 - 1? 完全二叉树的性质
        for(int i = length/2 - 1;i >= 0;i--){
            adjustHeap(nums,i,length - 1);
        }

        for(int i = length - 1;i > 0;i--){
            swap(nums,0,i);
            adjustHeap(nums,0,i-1);
        }



    }

    /**
     * 构建最大堆 往下查找
     * @param nums
     * @param index 堆开始的位置
     * @param end    堆结束的位置
     */
    public static void adjustHeap(int[] nums,int index,int end){
        while (index * 2 + 1 <= end ){
            int left = (2 * index )+1 ;
            int right =(2 * index )+2;
            int maxIndex = left;
            if(right<=end && nums[left] < nums[right]){
                maxIndex= right;
            }

            if(nums[index] < nums[maxIndex]){
                swap(nums,index,maxIndex);
            }
            index =  maxIndex;
        }

    }

    private static void swap(int[] nums, int num, int num1) {
        int temp = nums[num];
        nums[num] = nums[num1];
        nums[num1] = temp;
    }
}
