package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 *
 */
public class _350_Intersection {
    public static void main(String[] args) {

    }

    /**
     * 排序
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int len = Math.min(nums1.length,nums2.length);
        int[] res = new int[len];
        int a = 0;
        int b = 0;
        int index = 0;
        while (a < nums1.length && b < nums2.length){
            if(nums1[a] == nums2[b]){
                res[index++] = nums1[a];
                a++;
                b++;
            }else if(nums1[a] < nums2[b]){
                a++;
            }else {
                b++;
            }
        }
        return Arrays.copyOfRange(res,0,index);
    }

    /**
     * hash解法
     */
//    public int[] intersect(int[] nums1, int[] nums2) {
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for (int i =0;i <nums1.length;i++){
//            if(map.containsKey(nums1[i])){
//                int count = map.get(nums1[i]);
//                map.put(nums1[i],count+1);
//            }else {
//                map.put(nums1[i],1);
//            }
//
//        }
//
//        ArrayList<Integer> list = new ArrayList();
//        for (int i = 0;i <nums2.length;i++){
//            int count = 0;
//            if( map.containsKey(nums2[i]) &&  (count =  map.get(nums2[i]))> 0){
//                list.add(nums2[i]);
//                map.put(nums2[i],count-1);
//            }
//
//        }
//
//        int[] res = new int[list.size()];
//        for (int i = 0;i < res.length;i++){
//            res[i] = list.get(i);
//        }
//
//        return res;
//
//    }


    /**
     * 原始 粗暴方法
     * @param nums1
     * @param nums2
     * @return
     */
//    public int[] intersect(int[] nums1, int[] nums2) {
//        HashMap map = new HashMap();
//
//        for(int i = 0;i < nums1.length;i++){
//            int a = nums1[i];
//            for(int j = 0;j< nums2.length;j++){
//                if(a == nums2[j] && !map.containsKey(j)){
//                    map.put(j,nums2[j]);
//                    break;
//                }
//            }
//        }
//
//        Iterator it = map.values().iterator();
//        int size = map.values().size();
//        int[] res = new int[size];
//        int i = 0;
//        while (it.hasNext()) {
//            int value = (int) it.next();
//            res[i] = value;
//            i++;
//            System.out.println("value:" + value);
//        }
//
//        return res;
//
//    }
}
