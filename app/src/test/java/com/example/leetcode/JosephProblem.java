package com.example.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * 约瑟夫环问题
 * 已知n个人（以编号1，2，3...n分别表示）围坐在一张圆桌周围，从编号为k的人开始报数，
 * 数到m的那个人出列；他的下一个人又从1开始报数，数到m的那个人又出列；依此规律重复下去，
 * 直到圆桌周围的人只有一个没有出列。假设n=1000,k=5,m=13,问剩下最后一个人编号。
 */
public class JosephProblem {

    private static int N = 10;
    private static int M = 2;
    private static int K = 1;

    public static void main(String[] args) {
        JosephProblem demo = new JosephProblem();
        demo.jose(N,K,M);
    }


    /**
     *
     * @param numberN 人数
     * @param startNumberK  从第几个人开始
     * @param numberM  报数截至
     * @return
     */
    private  void jose(int numberN,int startNumberK,int numberM) {
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 1;i <= numberN;i++){
            list.add(i);
        }

        int k = 1;
        while (k < startNumberK){
            list.add(list.poll());
            k++;
        }

        int m = 1;
        ArrayList<Integer> res = new ArrayList<>();
        while (!list.isEmpty()){
            int p = list.poll();
            if (m >= numberM){
                m = 1;
                res.add(p);
            }else {
                m++;
                list.add(p);
            }
        }
        System.out.println(Arrays.toString(res.toArray()));


    }
}
