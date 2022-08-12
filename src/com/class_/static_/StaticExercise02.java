package com.class_.static_;

public class StaticExercise02 {
}
class customer {  //StaticExercise02.java 2min 时间
    private int id;
    private static int total = 0;
    public static int getTotalPerson() {
        //id++;//错误, 注销

        return total;
    }
    public customer() {//构造器
        total++;  //total = 1
        id = total;//id = 1
    }
}
class TestCustomer {
    public static void main(String[] args) {
        System.out.println("Number of total is " +customer.getTotalPerson()); //0
        customer p1 = new customer();
        System.out.println( "Number of total is "+ customer.getTotalPerson()); //1
    }
}
