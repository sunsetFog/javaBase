package com.class_.super_;

public class Parent {
    private String IsName;
    // 父默认构造器,可以不写
    public Parent() {
        System.out.println("--父类默认构造器--");
    }
    // 父有参构造器
    public Parent(String BeName) {
        IsName = BeName;
        System.out.println("--父类有参构造器--"+this);
    }
    void eat() {
        System.out.println("--父类默认方法--");
    }
}
