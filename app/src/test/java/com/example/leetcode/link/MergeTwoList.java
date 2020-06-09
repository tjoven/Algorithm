package com.example.leetcode.link;

public class MergeTwoList {
    public static ListNode getData(int[] strings){
        ListNode listNode = new ListNode(-1);
        ListNode temp = listNode;
        for (int i = 0;i < strings.length;i++){
            ListNode node = new ListNode(strings[i]);
            temp.next  = node;
            temp = temp.next;
        }
        return listNode.next;

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(-1);
        ListNode temp = result;
        ListNode curr1 = l1;
        ListNode curr2 = l2;
        while(curr1 != null && curr2 != null){
            if(curr1.val < curr2.val){
                temp.next = curr1;
                curr1 = curr1.next;
            }else{
                temp.next = curr2;
                curr2 = curr2.next;
            }
            temp  = temp.next;

        }

        if(curr1 == null){
            temp.next = curr2;
        }else {
            temp.next = curr1;
        }

        return result.next;
    }
}
