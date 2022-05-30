package com.toClass.duotai.Override;
/*
    类的继承，子类重写父类方法
    重写方法不能变：方法名，参数列表，返回类型，不能抛出新的异常
*/
public class Children extends Parent {
    public void move(String toName){
        System.out.println("狗可以跑和走"+toName);
    }

    public static void main(String[] args) {
        Children children = new Children();
        children.move("Bingo");
    }
}
