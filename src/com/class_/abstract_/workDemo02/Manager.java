package com.class_.abstract_.workDemo02;

public class Manager extends Employee {
    @Override
    public void work() {
        System.out.println(getDeptName() + "经理 " + getName() + " 工作中...");
    }

    public Manager(String deptName, String name, double salary) {
        super(deptName, name, salary);
    }

    public static void main(String[] args) {
        Manager manager = new Manager("销售部","小花", 6000);
        manager.work();
    }
}
