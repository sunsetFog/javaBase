package com.toClass.xiushifu.butongbao;

import com.toClass.xiushifu.tongbao.Index1;
//    不同包
public class Index4 {
    public static void main(String[] args) {
        Index1 index1 = new Index1();
        System.out.println("--不同包访问public--"+index1.restrict1);
//        System.out.println("--不同包访问protected--"+index1.restrict2);// 报错
//        System.out.println("--不同包访问默认--"+index1.restrict3);// 报错
//        System.out.println("--不同包访问private--"+index1.restrict4);// 报错
    }
}
