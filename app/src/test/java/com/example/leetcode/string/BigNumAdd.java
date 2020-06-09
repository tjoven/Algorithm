package com.example.leetcode.string;

import org.junit.Test;

/**
 * 两个大数相加。
 * String numA = "5135156864146198510515713546981304...";
 * String numB = "14105283157813257031975091759832782750923...";
 * 两个字符串长度不一定相等，都可能特别长，甚至超过long的范围。求numA 和 numB的和。
 */
public class BigNumAdd {

    @Test
    public  void test() {
        String a = "56051";
        String b = "110581";

        StringBuilder aBuilder = new StringBuilder(a);
        StringBuilder bBuilder = new StringBuilder(b);

        StringBuilder aa = aBuilder.reverse();
        StringBuilder bb = bBuilder.reverse();

        StringBuilder result = new StringBuilder();

        int length = aa.length() > bb.length() ? bb.length():aa.length();
        int carry = 0;
        for(int i = 0;i < length;i++){
            int re = aa.charAt(i) + bb.charAt(i) - 2 *'0' + carry;
            int re1 = re%10;
            carry = re/10;
            result.append(re1);
        }

        if(aa.length() > bb.length()){
            for(int i = length;i < aa.length();i++){
                int re = aa.charAt(i)  - '0' + carry;
                int re1 = re%10;
                carry = re/10;
                result.append(re1);
            }
        }else {
            for(int i = length;i < bb.length();i++){
                int re = bb.charAt(i) - '0' + carry;
                int re1 = re%10;
                carry = re/10;
                result.append(re1);
            }
        }
        Long cc  =Long.parseLong(a) + Long.parseLong(b);
        System.out.println(cc);
        System.out.println(result.reverse().toString());
    }
}
