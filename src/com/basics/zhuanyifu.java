package com.basics;

/*
    演示转义字符的使用
    \t 制表位，实现对齐的功能
    \n 换行符
    \\  一个\
    \' 一个'
    \" 一个"
    \r   回车
*/
public class zhuanyifu {
    public static void main(String[] args){
        System.out.println("书名\t作者\t价格\n大海\t小鹿\t900");
        System.out.println("C:\\window");
        System.out.println("老子说:\"你很棒！\"");
        System.out.println("橘子说:\'你很6！\'");
        System.out.println("替换呀\r您好");
    }
}
