package com.toClass.xiushifu.tongbao;
// 子类
public class Index3 extends Index1 {
    public static void main(String[] args) {
        Index1 index1 = new Index1();
        System.out.println("--子类访问public--"+index1.restrict1);
        System.out.println("--子类访问protected--"+index1.restrict2);
        System.out.println("--子类访问默认--"+index1.restrict3);
//        System.out.println("--子类访问private--"+index1.restrict4);// 报错
    }
}
