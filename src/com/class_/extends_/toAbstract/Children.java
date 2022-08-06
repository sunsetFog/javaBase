package com.class_.extends_.toAbstract;

public class Children extends Parent {
    public double computePay() {
        System.out.println("Computing salary pay for ");
        return 52;
    }

    public static void main(String[] args) {
        Children children = new Children();
        children.computePay();
    }
}
