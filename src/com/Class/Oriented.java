package com.Class;
// 面向对象
public class Oriented {
    public static void main(String[] args){// args参数来自：运行命令java Oriented can1 can2
        String[] cat9 = { "小白", "23", "白色" };
        String[] cat7 = { "小花", "83", "花色" };

        Cat cat1 = new Cat("小白", 8);// 实例化一个猫（创建一个猫）    新建堆   通过构造器指定名字和年龄
        cat1.name = "小白";
        cat1.age = 32;
        cat1.color = "白色";
        cat1.count++;


        Cat cat2 = new Cat("小白", 8);// 创建第二只猫
        cat2.name = "小花";
        cat2.age = 71;
        cat2.color = "花色";
        cat2.count++;
        System.out.println("第一只猫：" + cat1.name + "---" + cat1.age + "---" + cat1.color);
        System.out.println("第二只猫：" + cat2.name + "---" + cat2.age + "---" + cat2.color);
        // 静态变量从类加载就创建了，所以用类访问静态变量
        System.out.println("用类访问静态变量：" + Cat.count );// 私有就报错了 Cat.age报错--普通属性不能用类访问
        System.out.println("实例化第一只猫，访问静态变量：" + cat1.count );// 2
        System.out.println("实例化第二只猫，访问静态变量：" + cat2.count );// 2

        cat1.speak(7);

        MyTools jsjhs = new MyTools();
        Cat cat6 = jsjhs.copyCat(cat1);
        System.out.println("复制的猫：" + cat6.name + "---" + cat6.age + "---" + cat6.color);

        cat1.recursion(5);
		/*
			方法重载：
			方法名相同，形参列表不同（形参类型，个数，顺序的不同）
		*/
        cat1.sum(15,35,50);

        System.out.println("哈希值：" + cat1.hashCode());


    }
}

class Cat {
    String name;
    int age;
    String color;// 普通属性/普通成员变量
    public static int count = 0;// 类变量/静态变量/静态属性  Cat类实例的所有对象共享   调用：类.静态变量    实例类.静态变量
    public static void payFee(double fee) {// 静态方法  调用：类.方法()    实例类.方法()
        Cat.count += fee;
        // 静态方法中，只能访问静态成员
        // 普通方法中，既能访问静态成员，也能访问非静态成员
    }
    // final关键字 final修饰的属性又叫常量 使用：不想被继承，被修改就用
    // 类继承不能用final，但可以实例化对象可以用final
    // 不能修饰构造方法
    public final double tax_rate1  = 0.08;
    public static final double tax_rate2  = 0.1;// 赋值：定义时必须赋值，构造器中（静态不行），代码块中

    // 方法调用机制     main方法新建一个栈---调用方法---又新建独立空间的栈---返回main栈调用方法的点----main方法(栈)执行完毕，退出程序
    // 传参机制   1.形参的改变不影响实参---因为两个栈中，变量独立互不影响      2.实参是数组或对象，变量存放在堆里，此时实参是地址，形参改变，实参随变
    // 栈：存放基本数据类型（局部变量）
    // 堆：存放对象
    // 方法区: 常量池，类加载信息
    public void speak(int hnh) {// public表示方法公开     speak方法名 ()形参列表  {}方法体
        System.out.println("成员方法，没有return" + hnh);
        // 同一个类中，可以直接调用方法
        apple(54,6);// (54,6)实参和形参：相同类型或兼容类型（double转int、byte转int）， 个数和顺序要一致
        // 不同类，实例调用方法
        Dog dog86 = new Dog();
        dog86.sky();
    }
    public int apple(int num1, int num2) {// public表示方法公开(访问修饰符)   int表示方法执行后，return返回一个int值   apple方法名  {}方法体  (int num1, int num2)形参
        System.out.println("成员方法,有reture" + (num1 + num2));
        return 87;
    }
    public void recursion(int n) {
        if(n > 2){
            recursion(n - 1);
        }
        System.out.println("递归n=" + n);
    }
    public int sum(int... nums) {// 可变参数，nums当数组使用    只能一个可变参数   (String nums1, int... nums2)这写法，可变参数要放最后
        System.out.println("接受的参数个数" + nums.length);
        int sums = 0;
        for (int i = 0; i < nums.length; i++){
            sums += nums[i];
        }
        System.out.println("可变参数求和" + sums);
        return sums;
    }
    // 构造器没有返回值，也不能写void   方法名和类名一致   完成对象的初始化   在实例化类时触发  可以多个构造器，既是重载
    public Cat(String kName, int kAge) {
        this(11.2, "jdjj");// 访问同类构造器
        System.out.println("构造器触发，完成对象的初始化");
        // this指向: 哪个对象用this，this就指向那个对象   可以访问属性，方法this.sum()，构造器(只能在构造器内调用,而且是第一条语句)
        this.name = kName;
        this.age = kAge;
    }
    public Cat(double hjd, String sName) {
        System.out.println("第二个构造器" + hjd + "---" + sName);
    }
}

class Dog {
    public void sky() {
        System.out.println("Dog类---被执行");
    }
}

class MyTools {
    public Cat copyCat(Cat uj) { // 克隆对象
        Cat cat3 = new Cat("小白", 8);// cat3和cat6在堆里是同一个对象
        cat3.name = uj.name;
        cat3.age = uj.age;
        cat3.color = uj.color;
        return cat3;
    }
}
// 抽象类-不确定的方法  抽象类：abstract修饰的类、抽象方法：abstract修饰方法   不能修饰属性和其他
// 不能被实例化
// 继承时，父类所有方法改成抽象方法，或子类变抽象类
// 抽象方法不能使用private,final,static来修饰
abstract class ChouXiang {
//    public abstract void eat() {
//
//    }
}
