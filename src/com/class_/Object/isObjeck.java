package com.class_.Object;
/*
    Object类是所有类的父类
    类可以显式继承，也可以隐式继承
    显式继承: public class isObjeck extends Object{}
    隐式继承: public class isObjeck {}

    静态方法中，只能访问静态成员
    普通方法中，既能访问静态成员，也能访问非静态成员

     方法调用机制     main方法新建一个栈---调用方法---又新建独立空间的栈---返回main栈调用方法的点----main方法(栈)执行完毕，退出程序
     传参机制   1.形参的改变不影响实参---因为两个栈中，变量独立互不影响      2.实参是数组或对象，变量存放在堆里，此时实参是地址，形参改变，实参随变
     栈：存放基本数据类型（局部变量）
     堆：存放对象
     方法区: 常量池，类加载信息

     方法名 (形参列表) {}方法体

     向上转型：父类的引用指向子类的对象    语法：父类 引用名 = new 子类();   调用不了子类的成员方法
     向下转型： 语法：子类 引用名 = (子类) 父类引用名;

     多肽数组: value值就是实例类
     找属性时:  先找本类---找父类---没有再往上找父类---直到Object类
*/
public class isObjeck {
    public static void main(String[] args) {// args参数来自：运行命令java Oriented can1 can2
        /*
            类与对象
            jvm内存 》 对象的存在形式：栈（存基本数据类型）---堆（存引用类型，数组与对象）---方法区（常量池，比如字符串）
        */
        Person person = new Person();// 实例化，声明和创建
        System.out.println("--对象--"+person);
        // 成员属性、字段
        person.age = 18;
        person.name = "晓晓";
        person.hobby = "女";
        // 访问对象的属性
        System.out.println("类与对象：" + person.name);

    }
}

class Person {
    int age;// 普通属性/普通成员变量
    String name;
    String hobby;
    public static int count = 0;// 类变量/静态变量/静态属性
    /*
        void：可以return，但不能返回值
    */
    public void speak() {

    }
    /*
        return的类型（必须要有） = 修饰方法的类型
        接收变量类型 =  形参类型
    */
    public String apple(int isAge) {// (int... nums) 不确定多少形参
        this.age  = isAge;
        return "OKOK";
    }
}
