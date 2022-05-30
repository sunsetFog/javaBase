package com.toClass.toImplements;

import org.springframework.stereotype.Service;

/*
    implements类继承，一个类可继承多个接口
    extends和implements一起用，是java单继承机制的一种补充
    public class toAsk extends *** implements Ask1,Ask2
    接口继承接口，接口不能继承类
    interface 接口3 extends 接口1,接口2 {

    接口不能用于实例化对象
    接口没有构造方法
    接口中所有的方法必须是抽象方法
    接口不能包含成员变量，除了 static 和 final 变量

    接口特性
    接口中每一个方法也是隐式抽象的,接口中的方法会被隐式的指定为 public abstract
    接口中可以含有变量，但是接口中的变量会被隐式的指定为 public static final 变量
*/
//@Service
public class toAsk implements Ask1,Ask2 {
//    @Override
    public String eat(String toName){
        System.out.println("--吃饭了吗--");
        return "OKOK";
    }
    @Override
    public void sleep(){
        System.out.println("--睡了吗--");
    }

    public static void main(String[] args) {
        toAsk toAsk = new toAsk();
        toAsk.eat("九十九");
        toAsk.sleep();
    }
}
