package com.IO.transformation;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author 韩顺平
 * @version 1.0
 * 演示 PrintWriter 使用方式
 */
public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        //PrintWriter printWriter = new PrintWriter(System.out);// 标准输出流 传 打印流
        PrintWriter printWriter = new PrintWriter(new FileWriter("D:\\upload\\f1.txt"));
        printWriter.print("hi, 北京你好~~~~");
        printWriter.close();//flush + 关闭流, 才会将数据写入到文件..

    }
}
