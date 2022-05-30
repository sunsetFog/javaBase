package com.toClass.toExtends.toAbstract;
/*
抽象类不能被实例化，所以抽象类必须被继承，才能被使用
抽象方法的类必定是抽象类
抽象方法不能是static和构造器
抽象方法只是声明，不包含方法体
抽象类的子类必须给出抽象类中的抽象方法的具体实现，除非该子类也是抽象类
*/
public abstract class Parent {
    private String address;
    public abstract double computePay();
}
