package com.basics;
import java.util.Scanner;// 导入Scanner(扫描器)
// 键盘输入语句
public class Input {
    public static void main(String[] args){
        Scanner sjdjk = new Scanner(System.in);// 创建Scanner对象
        System.out.println("请输入名字");
        String namek = sjdjk.next();// 接收用户输入

        System.out.println("请输入年龄");
        int age = sjdjk.nextInt();// 接收用户输入

        System.out.println("人的信息：" + namek + "---" + age);
    }
}
