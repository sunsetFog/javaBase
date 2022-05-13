package com.basics;
import java.util.*;

public class Debugs {
    public static void main(String[] args){
        /*
        断点调试

        提示:Java HotSpot(TM) 64-Bit Server VM warning: Sharing is only supported for boot loader classes because bootstrap classpath has been appended
        因为要设置：File --- Settings --- build>Debugger>async  去掉勾选intr

        添加断点：点左边序号与线中间
        跑断点：文件右键 --- Deger

        F8 逐行执行
        正方形是停止断点 Ctrl + F2

        查看源码
        File --- Settings --- build>Debugger>stepping    去掉勾选java.*和javax.*
        跑断点后   F7进入方法---继续F7  而Shift+F8则是F7的返回，直到返回main方法

        F9跳到下一个断点

        */
        int sum = 0;
        int[] arr = { 19, 29, 10 };
        Arrays.sort(arr);// 要查看源码处，添加断点
        for(int i = 0; i <= arr.length; i++) {// 这里i <= arr应该是i < arr
            sum += i;
            System.out.println("i=" + i);
            System.out.println("数组项" + arr[i]);// arr[3]时报异常 arr最大下标是2   调试点到最后，控制台看见报错行
        }
        System.out.println("退出for...");
    }
}
