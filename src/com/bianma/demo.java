package com.bianma;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class demo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        /*
            对应前端decodeURI、encodeURI
        */
        String filename = "商品信息统计报表.xls";
        String encode = URLEncoder.encode(filename, "UTF-8");
        System.out.println("-用UTF-8字符集进行编码-"+encode);
        String keyWord = URLDecoder.decode(encode, "UTF-8");
        System.out.println("-用UTF-8字符集进行解码-"+keyWord);
        // 编码
        byte[] bytes = filename.getBytes("UTF-8");
        System.out.println("字符串以“UTF-8”的方式转换为字节数组"+bytes);
        String jksk = new String(bytes, "iso-8859-1");
        System.out.println("-每1字节组装成一个“?”-"+jksk);
        // 解码
        byte[] bytes1 = jksk.getBytes("iso-8859-1");
        String hh = new String(bytes1, "UTF-8");// 等于 new String(bytes1)
        System.out.println("精神境界"+hh);

    }
}
