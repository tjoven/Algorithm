package com.example.leetcode.link;

public class Palindrome {

    public static boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = null;
        while(slow != null && fast != null && fast.next != null){
            ListNode slowNext = slow.next;
            ListNode fastNext = fast.next.next;

            slow.next = pre;
            pre = slow;

            slow = slowNext;
            fast  = fastNext;
        }

        ListNode p1 = null;
        ListNode p2 = null;
        if(fast == null){
            //偶数 第二段 第一个 slow
            p1 = pre;
            p2 = slow;
        }else if(fast.next == null){
            //奇数 中间位置  slow
            p1 = pre;
            p2 = slow.next;
        }

        while(p1 != null && p2 != null){
            if(p1.val != p2.val){
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        return true;
    }
}
