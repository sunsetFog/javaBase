package com.class_.abstract_.workDemo01;

abstract public class Employee {
    public static void main(String[] args) {
        //抽象类，不能被实例化
//        Employee employee = new Employee();
    }

    //抽象类的本质还是类，所以可以有类的各种成员
    private String name;
    private double salary;
    // abstract 只能修饰类和方法，不能修饰属性和其它的
    // public abstract int n1 = 1;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
    /*
        将work做成一个抽象方法
        抽象方法的类必定是抽象类
        所谓抽象方法就是没有实现的方法，既是没有方法体
        抽象方法不能使用private、final 和 static来修饰，因为这些关键字都是和重写相违背的
    */
    public abstract void work();
    // 抽象类不一定要包含abstract方法，还可以有实现的方法。
    public void hi() {
        //得到开始的时间
        long start = System.currentTimeMillis();
        work();// 动态绑定机制
        //得的结束的时间
        long end = System.currentTimeMillis();
        System.out.println("任务执行时间 " + (end - start));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
