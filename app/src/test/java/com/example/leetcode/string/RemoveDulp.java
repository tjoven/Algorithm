package com.example.leetcode.string;

import org.junit.Test;

import java.util.HashSet;

/**
 * 对字符串进行去重处理，并且保持原来的输入顺序。举例：
 * 输入的字符串 String  s = "ADABEFFFDCBGH发货价啦AFG"；
 * 经过处理之后结果应该是："ADBEFCGH发货价啦"
 */
public class RemoveDulp {

     String strings = "ADABEFFFDCBGH发货价啦AFG";
     StringBuilder stringBuilder = new StringBuilder();
     HashSet<Character> set = new HashSet<>();

    @Test
    public  void test() {
        for (int i = 0 ,len = strings.length();i < len;i++){
            char c = strings.charAt(i);
            if(!set.contains(c)){
                set.add(c);
                stringBuilder.append(c);
            }
        }

        System.out.println(stringBuilder.toString());

    }
}