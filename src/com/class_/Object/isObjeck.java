package com.class_.Object;
//import java.util.Scanner; //表示只会引入java.util 包下的 Scanner
//import java.util.*;//表示将java.util 包下的所有类都引入(导入)
/*
    类就是对象：
    Object类是所有类的父类
    类可以显式继承，也可以隐式继承
    显式继承: public class isObjeck extends Object{}
    隐式继承: public class isObjeck {}




     方法调用机制     main方法新建一个栈---调用方法---又新建独立空间的栈---返回main栈调用方法的点----main方法(栈)执行完毕，退出程序
     传参机制   1.形参的改变不影响实参---因为两个栈中，变量独立互不影响      2.实参是数组或对象，变量存放在堆里，此时实参是地址，形参改变，实参随变
     栈：存放基本数据类型（局部变量）
     堆：存放对象
     方法区: 常量池，类加载信息



     向上转型：父类的引用指向子类的对象    语法：父类 引用名 = new 子类();   调用不了子类的成员方法
     向下转型： 语法：子类 引用名 = (子类) 父类引用名;

     多肽数组: value值就是实例类
     找属性时:  先找本类---找父类---没有再往上找父类---直到Object类
*/
public class isObjeck {
    /*
        运行的main方法
        args参数来自：运行命令java Oriented can1 can2
    */
    public static void main(String[] args) {
        /*
            类与对象
            jvm内存 》 对象的存在形式：栈（存基本数据类型）---堆（存引用类型，数组与对象）---方法区（常量池，比如字符串）
        */

        // 静态变量是类加载时就创建好,所以没创建对象实例，也能访问（类名.静态成员）
        System.out.println("类名.静态成员"+ Person.cabbage());
        Person p01 = new Person("小明", 12, "篮球");// 创建对象实例，才能访问普通成员
        Person p02 = new Person("小花", 14, "男");
        // 静态变量最大的特点: 该类所有对象实例是共享的
        System.out.println("-实例化p01访问-"+p01.cabbage());
        System.out.println("-实例化p02访问-"+p02.cabbage());



        /*
            快捷：右键 + 生成 + 选需要的
            需要重写toString方法，否则打印出com.class_.Object.Person@7c16905e
        */
        System.out.println("--打印类--"+p01);

        p01.name = "晓晓";
        p01.age = 18;
        p01.hobby = "女";
        System.out.println("--打印类--" + p01);

    }
}

class Person {
    /*
        普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量
    */
    String name;
    int age;
    String hobby;
    /*
        类变量/静态变量/静态属性/静态成员
    */
    public static int count = 0;
    /*
        静态方法中，只能访问静态成员
        静态方法中，不允许使用和对象有关的关键字，比如this和super，普通方法可以。
    */
    public static int cabbage() {
        count++;
        return count;
    }
    /*
        void：可以用return，但不能return返回值
        普通方法中，可访问任何成员
        方法名 (形参列表) {}方法体
        不确定多少形参：方法名(int... nums) {}
    */
    public void speak() {
        System.out.println("普通方法");
    }
    /*
        不是void: 必须要有reture 修饰方法类型的值;
    */
    public String apple(int isAge) {
        this.age  = isAge;
        return "OKOK";
    }
    /*
        有参构造器
        要与类名一致
        创建对象实例，就会触发
    */
    public Person(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", hobby='" + hobby + '\'' +
                '}';
    }
}
