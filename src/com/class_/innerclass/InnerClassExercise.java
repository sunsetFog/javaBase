package com.class_.innerclass;
// ---成员内部类---
public class InnerClassExercise {// 外部其他类
    public static void main(String[] args) {

    }
}

class Test {//外部类

    public Test() {//构造器
        Inner s1 = new Inner();
        s1.a = 10;
        System.out.println("--111--"+s1.a);
    }

    class Inner { //内部类，成员内部类
        public int a = 5;
    }

    public static void main(String[] args) {
        Test t = new Test();
        Inner r = t.new Inner();//5
        System.out.println("--222--"+r.a);//5
    }
}
