package com.IO.file;

import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Directory_ {
    public static void main(String[] args) {
        m1();
        m2();
        m3();
    }

    //判断文件是否存在，如果存在就删除
    public static void m1() {

        String filePath = "D:\\upload\\10.txt";
        File file = new File(filePath);
        if (file.exists()) {// 文件是否存在
            if (file.delete()) {// 删除文件
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在...");
        }

    }

    //判断目录是否存在，存在就删除，否则提示不存在
    //这里我们需要体会到，在java编程中，目录也被当做文件
    public static void m2() {

        String filePath = "D:\\demo02";
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该目录不存在...");
        }

    }

    //判断目录是否存在，如果存在就提示已经存在，否则就创建
    public static void m3() {
        String directoryPath = "D:\\upload\\xin\\10.txt";
        File file = new File(directoryPath);
        if (file.exists()) {
            System.out.println(directoryPath + "存在..");
        } else {
            if (file.mkdirs()) { //创建一级目录使用mkdir() ，创建多级目录使用mkdirs()
                System.out.println(directoryPath + "创建成功..");
            } else {
                System.out.println(directoryPath + "创建失败...");
            }
        }



    }
}
