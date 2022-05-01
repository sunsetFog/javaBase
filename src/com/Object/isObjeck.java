package com.Object;

public class isObjeck {
    public static void main(String[] args) {
        /*
            类与对象
            jvm内存 》 对象的存在形式：栈（存基本数据类型）---堆（存引用类型，数组与对象）---方法区（常量池，比如字符串）
        */
        Person person = new Person();// 声明与创建
        // 成员属性、字段
        person.age = 18;
        person.name = "晓晓";
        person.hobby = "女";
        // 访问对象的属性
        System.out.println("类与对象：" + person.name);

    }
}

class Person {
    int age;
    String name;
    String hobby;
    public void speak() {

    }
}
