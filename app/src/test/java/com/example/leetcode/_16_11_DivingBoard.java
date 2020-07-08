package com.example.leetcode;

import java.util.Arrays;

public class _16_11_DivingBoard {

    public static void main(String[] args) {
        _16_11_DivingBoard divingBoard = new _16_11_DivingBoard();
        System.out.println(
                Arrays.toString(
                        divingBoard.divingBoard(1,1,3)
                )
        );
    }

    public int[] divingBoard(int shorter, int longer, int k) {

        if(k <= 0){
            return  new int[0];
        }

        if(shorter == longer){
            int length = shorter * k;
            int[] result =  {length};
            return result;
        }

        int[] result = new int[k + 1];

        //i: shorter 的数量
        //j: longer  的数量
        for(int i = k;i >= 0;i--){
            int j = k - i;
            int length  = shorter * i + longer * j;
            result[j] = length;
        }
        return result;
    }
}
