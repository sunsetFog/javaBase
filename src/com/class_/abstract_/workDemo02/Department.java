package com.class_.abstract_.workDemo02;

abstract public class Department {
    private String deptName;

    public Department(String deptName) {
        this.deptName = deptName;
    }
    //将work做成一个抽象方法
    public abstract void work();

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
}
