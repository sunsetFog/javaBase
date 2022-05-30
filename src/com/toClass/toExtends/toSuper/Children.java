package com.toClass.toExtends.toSuper;
/*
    extends关键字，类的继承：构造器与super关键字
    extends一个子类只能拥有一个父类
*/
public class Children extends Parent {
    public static void main(String[] args) {
        // 实例化，子父构造器都会触发
//        Children children = new Children();
        Children children = new Children("广州");
    }
    // 子默认构造器,可以不写
    public Children() {
        /*
            super用于访问父类成员
            super必须第一个语句
            super()默认就有，不必写
            super(传参) 调用父类有参构造器
        */
    }
    // 子有参构造器
    public Children(String city) {
        super("小爱同学");
        this.eat();// this关键字 调用自己的方法
        super.eat();// super 调用父类方法
        eat();
        System.out.println("--所在城市--"+city);
    }
    void eat() {
        System.out.println("--子类默认方法--");
    }
}
