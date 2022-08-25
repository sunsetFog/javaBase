package com.IO.inputstream_;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
    读取文件：
    字节流》字节输入流FileInputStream
*/
public class FileInputStream_ {
    public static void main(String[] args) {
        readFile01();
        readFile02();
    }

    /**
     * 演示读取文件...
     * 单个字节的读取，效率比较低
     * -> 使用 read(byte[] b)
     */

    public static void readFile01() {
        String filePath = "D:\\upload\\a.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。 如果没有输入可用，此方法将阻止。
            //如果返回-1 , 表示读取完毕
            while ((readData = fileInputStream.read()) != -1) {
                System.out.print("--111--"+(char)readData);//转成char显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    /**
     * 使用 read(byte[] b) 读取文件，提高效率
     */

    public static void readFile02() {
        String filePath = "D:\\upload\\a.txt";
        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字节.
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象，用于读取 文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。 此方法将阻塞，直到某些输入可用。
            //如果返回-1 , 表示读取完毕
            //如果读取正常, 返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print("--222--"+new String(buf, 0, readLen));//显示
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源.
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
