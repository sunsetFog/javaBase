package com.interfaces;

public class ai1 {
    public static void main(String[] args) {

        System.out.println("----"+ IB.n1);
        JiCheng hyyu = new JiCheng("小艾");
        hyyu.Pashu();
        hyyu.Swimming();
        hyyu.flying();
    }
}

// 接口属性都是final
interface IB {
    int n1 = 166;// 等价于：public static final int n1 = 166;
    void Swimming();
}

// 接口的修饰符是默认和public
interface IC {
    void flying();
}

// 接口不能继承其他的类，但是可以继承多个别的接口
interface ID extends IB,IC {

}
// 一个类可以实现多个接口
class Pig implements IB,IC {
    public void Swimming() {
        System.out.println("--会游泳--");
    }
    public void flying() {
        System.out.println("--会飞--");
    }
}

class Monkey {
    public String name;
    public Monkey(String name) {
        this.name = name;
    }
    public void Pashu() {
        System.out.println("--会爬树--");
    }
}
// 实现接口和继承类--对java单继承机制的一种补充
class JiCheng extends Monkey implements IB,IC {
    public JiCheng(String name) {
        super(name);
    }
    public void Swimming() {
        System.out.println("--会游泳--");
    }
    public void flying() {
        System.out.println("--会飞--");
    }
}