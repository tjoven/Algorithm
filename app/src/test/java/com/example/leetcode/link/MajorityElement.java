package com.example.leetcode.link;

import java.util.HashMap;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i < nums.length;i++){
            int count;
            if( map.get(nums[i]) == null){
                count = 1;
            }else{
                count = (int) map.get(nums[i]) + 1;
            }

            map.put(nums[i],count);
            if(count > (nums.length/2)){
                return nums[i];
            }

        }
        return -1;
    }
}
