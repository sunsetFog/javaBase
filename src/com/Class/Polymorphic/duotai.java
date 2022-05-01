package com.Class.Polymorphic;// 引入包

public class duotai {
    public static void main(String[] args){
        A1 a1 = new A1();
        B1 b1 = new B1();
        // 多肽-方法重载：参数不同，调用方法不同
        System.out.println("A1类的sum方法:" + a1.sums(10,20));
        System.out.println("A1类的sum方法:" + a1.sums(10,20,30));
        // 多肽-方法重写
        a1.say("say方法");
        b1.say("say方法");
        // 多肽-实例对象
        // 向上转型：父类的引用指向子类的对象    语法：父类 引用名 = new 子类();   调用不了子类的成员方法
        A1 a2 = new B1();// 等号前A1是编译类型，等号后的A1是运行类型    编译类型是固定的，运行类型是可变的
        a2.apples1("apples1方法---向上转型");
//        a2 = new C1();// 改变运行类型   调用不了C1类方法
        // 向下转型： 语法：子类 引用名 = (子类) 父类引用名;
        B1 b2 = (B1) a2;// 能调用不了子类的成员方法
        b2.apples2("apples1方法---向下转型");
        // 多肽数组
        A1[] jhArr = new A1[3];
        jhArr[0] = new A1("小姐",16);
        jhArr[1] = new B1("小可",12);
        jhArr[2] = new C1();
        System.out.println("多肽数组：" + jhArr[0].apples1("apples1方法"));
        for(int i = 0;i < jhArr.length;i++){
            if(jhArr[i] instanceof B1) {// 判断jhArr[i]的运行类型是不是B1
                B1 s1 = (B1) jhArr[i]; // 向下转型
                System.out.println("多肽数组：" + s1.apples2("apples2方法"));
            } else if(jhArr[i] instanceof C1) {
                C1 s2 = (C1) jhArr[i];
                System.out.println("多肽数组：" + s2.apples3("apples3方法"));
            }
        }
        // 多肽参数
        a1.mini(b1);
    }
}

class A1 {
    private String name;
    private int age;
    public A1() {}
    public A1(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void say(String value){
        System.out.println("A1类的" + value);
    }
    public int sums(int n1, int n2){
        return n1 + n2;
    }
    public int sums(int value1, int value2, int value3){
        return value1 + value2 + value3;
    }
    public String apples1(String value){
        return "A1类的" + value;
    }
    public void mini(A1 value){// 形参是父类类型，实参是子类类型
        if(value instanceof B1) {
            System.out.println("多肽参数--" + ((B1) value).apples2("多肽的参数,apples2方法"));
        }
    }
}

class B1 extends A1 {// 继承属性
    private String name;
    private int age;
    public B1() {}
    public B1(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public void say(String value){
        System.out.println("B1类的" + value);
    }
    public String apples2(String value){
        return "B1类的" + value;
    }
}

class C1 extends A1 {
    public String apples3(String value){
        return "C1类的" + value;
    }
}
