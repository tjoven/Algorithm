package com.example.leetcode.stack;

import java.util.Stack;

/**
 * https://leetcode-cn.com/problems/valid-parentheses/submissions/
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *

 */
public class LegalString {
    public static void main(String[] args) {
        LegalString demo = new LegalString();
        String string = "";
        demo.isLegal(string);
    }

    private boolean isLegal(String string) {
        Stack<Character> stack = new Stack();
        for (int i = 0;i < string.length();i++){
            char c = string.charAt(i);
            if(isLeft(c)){
                stack.push(c);
            }else if(!stack.isEmpty()){
               char p = stack.pop();
               if( isPairs(p,c)){
                   continue;
               }else {
                   return false;
               }
            }else {
                return false;
            }
        }

        if (!stack.isEmpty()){
            return false;
        }
        return true;
    }

    private boolean isPairs(char left, char curr) {
        if((curr == '}' && left == '{')
            || (curr == ')' && left == '(')
             || (curr == ']' && left == '[')){
            return true;
        }else {
            return false;
        }
    }

    private boolean isLeft(char c) {
        if(c == '{'
           || c == '['
           || c == '(' ){
            return  true;
        }else {
            return false;
        }
    }
}
