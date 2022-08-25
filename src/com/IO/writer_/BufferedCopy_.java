package com.IO.writer_;

import java.io.*;

/*
字符流
BufferedReader 和 BufferedWriter 是安装字符操作
不要去操作 二进制文件[声音，视频，doc, pdf，图片 ], 可能造成文件损坏
要用BufferedInputStream和BufferedOutputStream 字节流
 */
public class BufferedCopy_ {

    public static void main(String[] args) {
        String srcFilePath = "d:\\upload\\a.txt";
        String destFilePath = "d:\\upload\\b.txt";
//        String srcFilePath = "e:\\0245_韩顺平零基础学Java_引出this.avi";
//        String destFilePath = "e:\\a2韩顺平.avi";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;
        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            //说明: readLine 读取一行内容，但是没有换行
            while ((line = br.readLine()) != null) {
                //每读取一行，就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕...");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if(br != null) {
                    br.close();
                }
                if(bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
