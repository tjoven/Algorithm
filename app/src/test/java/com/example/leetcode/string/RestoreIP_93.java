package com.example.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 给定一个只包含数字的字符串，复原它并返回所有可能的 IP 地址格式。
 * 有效的 IP 地址正好由四个整数（每个整数位于 0 到 255 之间组成），整数之间用 '.' 分隔
 *

 * https://leetcode-cn.com/problems/restore-ip-addresses/submissions/
 *
 */
public class RestoreIP_93 {


    public static void main(String[] args) {
        String s = "0279245587303" ;
        ArrayList<String> list = (ArrayList<String>) restoreIpAddresses(s);
        System.out.println(list);
    }
    public static List<String> restoreIpAddresses(String s) {
        ArrayList<String> list = new ArrayList<>();

        for(int i = 1; i < 4;i++){
            for(int j = 1;j < 4;j++){
                for(int k = 1;k < 4;k++){
                    if((i + j + k) < s.length()
                    && (s.length() - (i + j + k) ) < 4) {

                        String s1 = s.substring(0, i);
                        String s2 = s.substring(i, i + j);
                        String s3 = s.substring(i + j, i + j + k);
                        String s4 = s.substring(i + j + k, s.length());
                        if (vaild(s1)
                                & vaild(s2)
                                & vaild(s3)
                                & vaild(s4)) {
                            StringBuilder builder = new StringBuilder();
                            builder.append(s1).append(".")
                                    .append(s2).append(".")
                                    .append(s3).append(".")
                                    .append(s4);

                            list.add(builder.toString());
                        }
                    }
                }
            }
        }

        return list;
    }

    private static boolean vaild(String substring) {
        int num = Integer.parseInt(substring);
        if(substring.length() == 1){
            return true;
        }

        if(!substring.substring(0,1).equals("0")
        && num >= 0 && num <= 255){

            return true;
        }
        return false;
    }
}
