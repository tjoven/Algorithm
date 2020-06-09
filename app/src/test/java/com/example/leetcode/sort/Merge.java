package com.example.leetcode.sort;

import java.util.Arrays;

/**
 * 归并排序
 */
public class Merge {

    public static void main(String[] args) {
        int[] nums = {3,5,2,1};
        int[] res = sortMerge(nums);
        System.out.println(Arrays.toString(res));
    }
    private static int[] sortMerge(int[] nums){
        int length = nums.length;

        if(length <= 1){
            return nums;
        }

        int[] left = new int[length/2];
        System.arraycopy(nums,0,left,0,left.length);

        int[] right = new int[length - (length/2)];
        System.arraycopy(nums,left.length,right,0,right.length);

        int[] leftRes = sortMerge(left);
        int[] rightRes =sortMerge(right);

        return merge(leftRes,rightRes);

    }

    private static int[] merge(int[] leftRes, int[] rightRes) {
        int[] result = new int[leftRes.length + rightRes.length];
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        while(count1 < leftRes.length&& count2< rightRes.length){
            if(leftRes[count1] > rightRes[count2]){
                result[count3] = rightRes[count2];
                count2 ++;
            }else {
                result[count3] = leftRes[count1];
                count1 ++;
            }

            count3++;
        }

        if(count1 < leftRes.length){
            System.arraycopy(leftRes,count1,result,count3,result.length-count3);
        }

        if(count2 < rightRes.length){
            System.arraycopy(rightRes,count2,result,count3,result.length-count3);
        }

        return result;
    }
}
