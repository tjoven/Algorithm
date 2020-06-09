package com.example.leetcode.link;

public class DecimalVal {

    int length = 0;
    public int getDecimalValue(ListNode head) {
        if(head == null){
            return 0;
        }
        int value = getDecimalValue(head.next);
        length ++;
        return (value + (int)Math.pow(2,length - 1));
    }
}
