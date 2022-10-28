package com.class_.Object;
//import java.util.Scanner; //表示只会引入java.util 包下的 Scanner
//import java.util.*;//表示将java.util 包下的所有类都引入(导入)
/*
    类就是对象：
    Object类是所有类的父类
    类可以显式继承，也可以隐式继承
    显式继承: public class isObjeck extends Object{}
    隐式继承: public class isObjeck {}



     方法：
     方法调用机制     main方法新建一个栈---调用方法---又新建独立空间的栈---返回main栈调用方法的点----main方法(栈)执行完毕，退出程序
     传参机制   1.形参的改变不影响实参---因为两个栈中，变量独立互不影响      2.实参是数组或对象，变量存放在堆里，此时实参是地址，形参改变，实参随变
     栈：存放基本数据类型（局部变量）
     堆：存放对象
     方法区: 常量池，类加载信息

    Integer i = 10;  //装箱   引用类型包装基本类型
    int n = i;   //拆箱   引用类型转换为基本数据类型



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
        Person p01 = new Person("小明", 12, "篮球");// 创建对象实例，才能访问普通成员
        Person p02 = new Person("小花", 14, "男");
        /*
            局部变量：方法中定义的变量
            作用域：代码块内有效
            周期：随方法执行而创建，随方法执行结束而销毁
        */
        int a01 = 10;

        // 静态变量是类加载时就创建好,所以没创建对象实例，也能访问（类名.静态成员）
        System.out.println("类名.静态成员"+ Person.cabbage(p01, a01));

        // 静态变量最大的特点: 该类所有对象实例是共享的
        System.out.println("-count变化-"+p01.cabbage(p01, a01));
        System.out.println("-count变化受p01影响了-"+p02.cabbage(p02, a01));


        System.out.println("--方法修改a01，这不会变，因为是局部变量--"+a01);//10
        System.out.println("--方法修改name，这变了，因为引用类型在堆指向相同--"+p01.name);// 九九九



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
        全局变量：普通属性/普通成员变量/非静态属性/非静态成员变量/实例变量/字段
        作用域：类中有效
        全局变量与局部变量同名时，访问就近原则
        周期：随类创建而创建，随类销毁而销毁
    */
    String name;// 默认值null
    int age;// 全局变量没赋值，也有默认值0；局部变量没有默认值
    public String hobby;// 全局变量可以有修饰符，局部变量没有
    /*
        类变量/静态变量/静态属性/静态成员
    */
    public static int count = 0;
    /*
        静态方法中，只能访问静态成员
        静态方法中，不允许使用和对象有关的关键字，比如this和super，普通方法可以。
    */
    public static int cabbage(Person p01, int a01) {
        a01 = 99;
        System.out.println("局部变量"+a01);
        p01.name = "九九九";
        //p01 = null;在堆里，指向别的引用类型了
        count++;
        return count;
    }
    /*
        void：可以用return，但不能return返回值
        普通方法中，可访问任何成员
        方法名 (形参列表) {}方法体
        可变参数（形参个数不确定）：
            访问修饰符 返回类型 方法名(String hg, int... nums) {}
            nums是数组
            可变参数必须放最后
            只能一个可变参数
    */
    public void speak(int... nums) {
        System.out.println("普通方法");
    }
    /*
        不是void: 必须要有return 返回类型的值;
        访问修饰符 返回类型 方法名() {
            return 返回类型的值;
        }
    */
    public String apple(int isAge) {
        this.age  = isAge;
        return "OKOK";
    }
    /*
        无参构造器（默认构造器）默认就有，可以不写
        有参构造器会覆盖默认构造器，此时需要无参构造器就必须写上
        方法名要与类名一致
        创建对象实例，就会触发
        构造器的修饰符可以默认不写
        构造器没有返回值
        构造器重载：一个类定义多个构造器，形参类型、个数、顺序，至少有一样不同
    */
    public Person() {

    }
    /*
        关键字this
        this在堆里指向引用类型，是自己的对象实例
        this能访问属性、方法、构造器
        访问构造器，只能构造器中调用，必须放置第一条语句：this(形参列表);
        this用于区分当前类属性和局部变量
    */
    public Person(String name, int age, String hobby) {
        System.out.println("--this--"+this.hashCode());
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
