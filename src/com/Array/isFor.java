package com.Array;

public class isFor {
    public static void main(String[] args) {
        /*
            定义一个数组  int[] shuzu 等价于 int shuzu[]
            int[] shuzu = new int[4]; 定义一个数组，数组长度为4
            数组长度：shuzu.length

        */
        int[] shuzu = { 2, 5, 1, 8 };
        int total = 0;
        for( int i = 0; i < shuzu.length; i++) {
            System.out.println("数组项" + i + " : " + shuzu[i]);
            total += shuzu[i];
        }
        System.out.println("总和：" + total);
        // 二维数组
        int[][] erArr = {{1,6,2},{8,2,4}};
        System.out.println("二维数组："+erArr[0][1]);
    }
}
