package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/3sum/
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * 注意：答案中不可以包含重复的三元组。
 *

 */
public class ThreeSum_15 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        ThreeSum_15 demo = new ThreeSum_15();
        List<List<Integer>> result = demo.threeSum(nums);
        System.out.println(result);
    }

    /**
     * 数组排序
     * 双指针
     * @param nums
     * @return
     */
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i = 0,length = nums.length;i <= length - 3;i++){
            int first = nums[i];

            if(i  > 0 && nums[i - 1] == first){
                continue;
            }

            int leftIndex = i + 1;
            int rightIndex = length - 1;


            while (leftIndex < rightIndex){
                int left = nums[leftIndex];
                int right  =nums[rightIndex];

                if(leftIndex - 1 > i && nums[leftIndex - 1] == left){
                    leftIndex ++;
                    continue;
                }

                if(rightIndex  < length -1 && nums[rightIndex + 1] == right){
                    rightIndex --;
                    continue;
                }

                if(first + left + right > 0){
                    rightIndex --;
                }else if(first + left + right < 0){
                    leftIndex ++;
                }else {
                    List<Integer> list = new ArrayList<>();
                    list.add(first);
                    list.add(left);
                    list.add(right);

                    result.add(list);

                    leftIndex ++;
                }
            }

        }

        return result;
    }

    /**
     * 三层for循环 复杂度有点高
     *
     * 步骤：
     * 1,穷举
     * 2，字符串滤重
     * 2，符合条件的 内部排序 拼成字符串
     * 3，加入过滤池
     */
    public List<List<Integer>> threeSum01(int[] nums) {

        ArrayList<String> filterList = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        for (int i = 0;i<=nums.length -3;i++){
            for (int j = i+1;j <= nums.length - 2;j++){
                for(int k = j + 1;k <= nums.length - 1;k++){

                    if(nums[i] + nums[j] +nums[k] == 0){
                        String tag = getTag(nums[i],nums[j],nums[k]);
                        if(!filterList.contains(tag)){
                            filterList.add(tag);
                            ArrayList<Integer> three = new ArrayList<>();
                            three.add(nums[i]);
                            three.add(nums[j]);
                            three.add(nums[k]);
                            list.add(three);
                        }
                    }
                }
            }
        }

        return list;
    }

    private String getTag(int num, int num1, int num2) {
        int max = Math.max(Math.max(num,num1),num2);
        int min = Math.min(Math.min(num,num1),num2);

        return min + "_" +max;
    }
}
