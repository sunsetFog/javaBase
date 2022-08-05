package com.IO.file;



import java.io.*;

/**
 * @author 韩顺平
 * @version 1.0
 * 演示创建文件
 */
public class FileCreate {
    public static void main(String[] args) {
        create01();
        create02();
    }

    //方式1 new File(String pathname)
    public static void create01() {
        String filePath = "D:\\upload\\news1.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //方式2 new File(File parent,String child) //根据父目录文件+子路径构建
    public static void create02() {
        File parentFile = new File("D:\\upload");
        String fileName = "news2.txt";
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile 方法，才会真正的，在磁盘创建该文件
        File file = new File(parentFile, fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功~");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //下面四个都是抽象类
    //
    //InputStream
    //OutputStream
    //Reader //字符输入流
    //Writer  //字符输出流
}
