package com.class_.abstract_.workDemo02;

//如果一个类继承了抽象类，则它必须实现抽象类的所有抽象方法，除非该子类也是抽象类
abstract public class Employee extends Department {
    private String name;
    private double salary;

    public Employee(String deptName, String name, double salary) {
        super(deptName);
        this.name = name;
        this.salary = salary;
    }

    //将work做成一个抽象方法
    public abstract void work();

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
