package com.example.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    String s = "pwwkew";

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
        int length = lengthOfLongestSubstring(s);
        System.out.println("length  " + length);
    }

    public int lengthOfLongestSubstring(String s) {
        StringBuffer sb = new StringBuffer();
        int length = 0;
        for(int i = 0;i< s.length();i++){
            char c = s.charAt(i);
            int index = sb.indexOf(String.valueOf(c));
            if(index == -1){
                //没有重复
                sb.append(c);
            }else {
                //有重复
                length = Math.max(length,sb.length());
                sb.delete(0,index +1);
                sb.append(c);
            }
        }
        return  Math.max(length,sb.length());
    }

//    public int lengthOfLongestSubstring(String s) {
//        HashMap<Character, Integer> map = new HashMap<>();
//        int length = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c = s.charAt(i);
//            int j = 0;
//            if (map.containsKey(c)) {
//                j = map.get(c);
//
//            }
//            length = i - j + 1;
//            map.put(c, i);
//        }
//
//        return length;
//    }

//    public int lengthOfLongestSubstring(String s) {
//        ArrayList<Integer> lengths = new ArrayList();
//
//        for(int i = 0;i<s.length();i++){
//            ArrayList<Character> list = new ArrayList();
//            list.add(s.charAt(i));
//
//            for(int j = i+1;j<s.length();j++){
//                Character c = s.charAt(j);
//                if(!list.contains(c)){
//                    list.add(c);
//                }else{
//                    lengths.add(list.size());
//                    list.clear();
//                    break;
//                }
//
//            }
//            lengths.add(list.size());
//        }
//
//
//        int lengthRes = 0;
//        for(int i = 0;i < lengths.size();i++){
//            lengthRes = Math.max(lengthRes,lengths.get(i));
//        }
//        return lengthRes;
//    }
}

