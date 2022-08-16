package com.class_.codeblock_;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        // 仔细看执行顺序
        new B02();
    }
}

class A02 { //父类
    private static int n1 = getVal01();
    static {
        System.out.println("A02静态代码块..");//(2)
    }
    {
        System.out.println("A02普通代码块..");//(5)
    }
    public int n3 = getVal02();
    public static int getVal01() {
        System.out.println("A02静态成员");//(1)
        return 10;
    }

    public int getVal02() {
        System.out.println("A02普通成员");//(6)
        return 10;
    }

    public A02() {//构造器
        System.out.println("A02构造器");//(7)
    }

}

class B02 extends A02 {

    private static int n3 = getVal03();

    static {
        System.out.println("B02静态代码块..");//(4)
    }
    public int n5 = getVal04();
    {
        System.out.println("B02普通代码块..");//(9)
    }

    public static int getVal03() {
        System.out.println("B02静态成员");//(3)
        return 10;
    }

    public int getVal04() {
        System.out.println("B02普通成员");//(8)
        return 10;
    }
    public B02() {//构造器
        System.out.println("B02构造器");
    }
}
