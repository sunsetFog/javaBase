package com.basics.arrays_;

public class isFor {
    public static void main(String[] args) {
        /*
            定义一个数组  int[] shuzu 等价于 int shuzu[]
            int[] shuzu = new int[4]; 定义一个数组，数组长度为4
            数组长度：shuzu.length

        */
        int[] shuzu = { 2, 5, 1};
        int total = 0;
        // 打印数组
        for( int i = 0; i < shuzu.length; i++) {
            System.out.println("数组项" + i + " : " + shuzu[i]);
            total += shuzu[i];
        }
        System.out.println("总和：" + total);
        // 二维数组  三种写法：int[][] erArr、int erArr[][]、int[] erArr[]
        int[][] erArr = {{1,6,2},{8,2,4}};
        System.out.println("二维数组："+erArr[0][1]);

        // ------向后添加一个元素------
        int[] arrNew = new int[shuzu.length+1];
        // 实现数组拷贝（引用类型一致，使两个数组的值一起变，和前端需要拷贝一样）
        for (int i = 0; i < shuzu.length; i++) {
            arrNew[i] = shuzu[i];
        }
        // 最后元素赋值
        arrNew[arrNew.length - 1] = 4;
        // 数组扩容：shuzu 指向 arrNew，原来shuzu数组销毁
        shuzu = arrNew;
        // 打印数组
        for( int i = 0; i < shuzu.length; i++) {
            System.out.println("数组项" + i + " : " + shuzu[i]);
        }
        // ------数组最大值------
        int maxValue = shuzu[0];
        int maxIndex = 0;
        for (int i = 0; i < shuzu.length; i++) {
            if(maxValue < shuzu[i]) {
                maxValue = shuzu[i];
                maxIndex = i;
            }
        }
        System.out.println("最大值："+maxValue+"--下标是--"+maxIndex);
        // ------数组反转------
        int[] htry = new int[shuzu.length];
        int temp = 0;
        for (int i = shuzu.length - 1, j = 0; i >= 0; i--, j++) {
            htry[j] = shuzu[i];
        }
        shuzu = htry;
        for( int i = 0; i < shuzu.length; i++) {
            System.out.println("数组项" + i + " : " + shuzu[i]);
        }
        // ------在下标下插入一个元素------
        int insertValue = 100;
        int index5 = 3;
        int[] arr2 = new int[shuzu.length + 1];
        for( int i = 0, j = 0; i < arr2.length; i++) {
            if(i != index5) {
                arr2[i] = shuzu[j];// shuzu数组按照顺序赋值
                j++;
            } else {
                arr2[i] = insertValue;
            }
        }
        shuzu = arr2;
        for( int i = 0; i < shuzu.length; i++) {
            System.out.println("++数组项" + i + " : " + shuzu[i]);
        }
        // ------查找数组中是否有100------
        int findIndex = -1;
        for( int i = 0; i < shuzu.length; i++) {
            if(insertValue == shuzu[i]) {
                System.out.println("找到数"+ insertValue + " 下标是" + i);
                findIndex = i;
            }
        }
        if(findIndex == -1) {
            System.out.println("没有找到数"+insertValue);
        }

    }

}
