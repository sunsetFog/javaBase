package com.class_.abstract_.workDemo01;

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非该子类也是抽象类
public class Manager extends Employee {
    // 实现抽象类
    @Override
    public void work() {
        System.out.println("经理 " + getName() + " 工作中...");
    }

    public Manager(String name, double salary) {
        super(name, salary);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("小花", 6000);
        manager.hi();
        Employee yhh = new Manager("小画", 7000);
        yhh.hi();
    }
}
