package com.class_.codeblock_;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        // 仔细看执行顺序
        A a = new A();
    }
}

class A {
    /*
        普通代码块，在创建对象实例时，会被隐式的调用，被创建一次，就会调用一次

        当三个构造器都有重复代码，可以用普通代码块，而静态代码块只执行一次，不合适
        可以这样简单的，理解 普通代码块是构造器的补充

        加载时，普通代码块和普通成员执行顺序，由放置上下位置决定的
        普通代码块，可以使用任意成员
    */
    {
        System.out.println("普通代码块");
    }
    private int n2 = getN2();

    /*
        静态代码块，类加载时执行,只执行一次
        加载时，静态代码块和静态成员执行顺序，由放置上下位置决定的
        静态代码块，只能调用静态成员
    */
    static {
        System.out.println("静态代码块");
    }

    private static  int n1 = getN1();

    public static int getN1() {
        System.out.println("静态成员加载...");
        return 100;
    }
    public int getN2() { //普通方法/非静态方法
        System.out.println("普通成员加载...");
        return 200;
    }

    //无参构造器
    public A() {
        System.out.println("构造器被调用");
    }

}
