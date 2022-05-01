package com.Class.isExtends;

public class Parent {
    /*
     访问级别  访问控制修饰符  同类  同包  子类  不同包
     公开      public       Y    Y     Y     Y
     受保护    protected     Y    Y     Y     N
     默认      没有修饰符      Y    Y     N     N
     私有      private       Y    N     N     N
     访问控制修饰符可以修饰属性，成员方法以及类
     只有默认和public才能修饰类

    */
    public int restrict1 = 100;
    protected int restrict2 = 200;
    int restrict3 = 300;
    private int restrict4 = 400;
    public int restrict5(){
        System.out.println("同类" + restrict1 + "---" + restrict2 + "---" + restrict3 + "---" + restrict4);
        return restrict4;// 子类不能访问私有，但可以中转实现访问
    }
    public void restrict6(){
        System.out.println("this找父类方法");
    }
    public Parent(){
        System.out.println("父-无参构造器");
    }
    public Parent(String kName, int kAge){
        System.out.println("父-有参构造器" + kName + "---" + kAge);
    }
}
