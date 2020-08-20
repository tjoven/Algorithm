package com.example.leetcode;

/**
 * https://leetcode-cn.com/problems/search-in-rotated-sorted-array/
 *
 * 假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * 你可以假设数组中不存在重复的元素。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 输入: nums = [4,5,6,7,0,1,2], target = 0
 输出: 4
 **/
public class _33_Search {

    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 3;
        System.out.println(search(nums,target));
    }
    public static int search(int[] nums, int target) {
        return search(nums,target,0,nums.length-1);
    }

    private static int search(int[] nums, int target, int left, int right) {
        if(left >= right){
            if(nums[left] == target){
                return left;
            }
            return  -1;
        }

        int mid = (left + right)/2;
        if(nums[mid] == target){
            return mid;
        }

        if(nums[left] < nums[mid ] ){//左边有序
            if(nums[left] <= target && nums[mid ] >= target){
                //target 在有序中
                return  search(nums,target,left,mid-1);
            }else {
                //target 不在有序中
                return search(nums,target,mid+1,right);
            }
        }else {//右边有序
            if(nums[mid +1 ] <= target && nums[right] >= target){
                //target 在有序中
                return search(nums,target,mid+1,right);
            }else {
                //target 不在有序中
                return search(nums,target,left,mid-1);
            }
        }
    }
}
