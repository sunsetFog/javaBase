package com.class_.xiushifu.tongbao;

// 同包
public class Index2 {
    public static void main(String[] args) {
        Index1 index1 = new Index1();
        System.out.println("--同包访问public--"+index1.restrict1);
        System.out.println("--同包访问protected--"+index1.restrict2);
        System.out.println("--同包访问默认--"+index1.restrict3);
//        System.out.println("--同包访问private--"+index1.restrict4);// 报错
    }
}
