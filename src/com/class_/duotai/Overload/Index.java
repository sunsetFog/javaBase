package com.class_.duotai.Overload;
/*
方法重载：参数列表必须修改，返回类型和抛出异常可以修改
*/
public class Index {
    public int test(){
        System.out.println("test1");
        return 1;
    }
    // 返回类型和参数列表变了
    public void test(int a, String b){
        System.out.println("test2");
    }
    // 参数顺序不同
    public void test(String b, int a){
        System.out.println("test2");
    }
}
