package com.generic_.junit_;


import org.junit.jupiter.api.Test;

/*
junit单元测试框架
 */
public class JUnit_ {
    public static void main(String[] args) {
        //传统方式  执行方法
        //new JUnit_().m1();
        //new JUnit_().m2();

    }

    @Test// 加了test，右边有个三角，点运行，m1方法执行
    public void m1() {
        System.out.println("m1方法被调用");
    }

    public void m2() {
        System.out.println("m2方法被调用");
    }

    public void m3() {
        System.out.println("m3方法被调用");
    }
}
