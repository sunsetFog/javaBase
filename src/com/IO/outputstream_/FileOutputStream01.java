package com.IO.outputstream_;



import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    字节流》字节输出流FileOutputStream
    演示使用FileOutputStream 将数据写到文件中
    如果该文件不存在，则创建该文件
 */
public class FileOutputStream01 {
    public static void main(String[] args) {
        writeFile();
    }

    public static void writeFile() {

        //创建 FileOutputStream对象
        String filePath = "D:\\upload\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            //得到 FileOutputStream对象 对象
            //老师说明
            //1. new FileOutputStream(filePath) 创建方式，当写入内容是，会覆盖原来的内容
            //2. new FileOutputStream(filePath, true) 创建方式，当写入内容是，是追加到文件后面  相当于 +=
            fileOutputStream = new FileOutputStream(filePath, true);
            //写入一个字节
            //fileOutputStream.write('H');//
            //写入字符串
            String str = "hsp,world!";
            //str.getBytes() 可以把 字符串-> 字节数组
            //fileOutputStream.write(str.getBytes());
            /*
            write(byte[] b, int off, int len) 将 len字节从位于偏移量 off的指定字节数组写入此文件输出流
            参数2和参数3，相当于截取 substring(0, 10)
             */
            fileOutputStream.write(str.getBytes(), 0, str.length());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

