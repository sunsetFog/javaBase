package com.class_.duotai;

public class Overload_ {
    public static void main(String[] args) {
        // 方法重载体现多态
        B b = new B();
        //这里我们传入不同的参数，就会调用不同sum方法，就体现多态
        System.out.println(b.sum(10, 20));
        System.out.println(b.sum(10, 20, 30));

        // 方法重写体现多态
        A a = new A();
        b.say();
        a.say();

    }
}
class A { //父类
    public void say() {
        System.out.println("A say() 方法被调用...");
    }
}
class B extends A {//子类
    // 方法重载：多个同名方法，形参数列表必须不同（形参类型、个数、顺序，至少有一样不同），返回类型和抛出异常没要求
    public int sum(int n1, int n2){//和下面sum 构成重载
        return n1 + n2;
    }
    public int sum(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }


    public void say() {
        System.out.println("B say() 方法被调用...");
    }
}
