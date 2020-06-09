package com.example.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 无重复字符的最长子串
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 */
public class MaxLengthSubstring {

    static String string = "abcabcbb";

    public static void main(String[] args) {
        MaxLengthSubstring test = new MaxLengthSubstring();
        int length = test.lengthOfLongestSubstring(string);
        System.out.println(length);
    }

    public int lengthOfLongestSubstring(String s) {
        //不重复子串 的容器
       StringBuilder builder = new StringBuilder();
       int lengthRe = 0;
       for(int i =0 ,length = s.length();i < length;i++){
           char c = s.charAt(i);
           int index = builder.indexOf(String.valueOf(c));
           if(index == -1){
               //没有重复
               builder.append(c);
           }else {
               //有重复
               lengthRe = Math.max(lengthRe,builder.length());
               builder.delete(0,index+1);
               builder.append(c);
           }
       }
       return lengthRe;
    }
}
