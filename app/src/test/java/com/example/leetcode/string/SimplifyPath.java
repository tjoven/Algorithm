package com.example.leetcode.string;

import java.util.ArrayList;

/**
 * 简化路径
 * https://leetcode-cn.com/problems/simplify-path/
 *
 */
public class SimplifyPath {

    public static void main(String[] args) {
        String s  ="/../";
//        System.out.println(s);
        SimplifyPath path = new SimplifyPath();
        String result = path.simplifyPath(s);
        System.out.println(result);
    }
    public String simplifyPath(String path) {
        String[] strings = path.split("/");
        StringBuilder builder = new StringBuilder("/");
        for (String s: strings) {
            if(".".equals(s) || "/".equals(s) || "".equals(s)){
                continue;
            }

            if(!"..".equals(s)){
                builder.append("/").append(s);
            }else if("..".equals(s) && builder.lastIndexOf("/") > 0){
                builder.delete(builder.lastIndexOf("/"),builder.length());
            }else{
                //空处理
            }
        }


        if(builder.length() > 1){
            builder.delete(0,1);
        }
        return builder.toString();
    }
}
