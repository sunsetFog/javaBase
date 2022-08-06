package com.class_.xiushifu.tongbao;

/*
    修饰符：

     访问级别  访问控制修饰符  同类  同包  子类  不同包
     公开      public       Y    Y     Y     Y
     受保护    protected     Y    Y     Y     N
     默认      没有修饰符      Y    Y     N     N
     私有      private       Y    N     N     N
     访问控制修饰符可以修饰属性，成员方法以及类
     只有默认和public才能修饰类
*/

//     同类
public class Index1 {
    public static void main(String[] args) {
        /*
            这里static静态才能访问      java: 无法从静态上下文中引用非静态 变量
            static静态同类才能访问
            static静态方法里只能访问：static静态变量、static静态方法
        */
        System.out.println("--访问static静态变量--"+restrict1);
        Index1 index1 = new Index1();
        System.out.println("--同类访问public--"+index1.restrict1);
        System.out.println("--同类访问protected--"+index1.restrict2);
        System.out.println("--同类访问默认--"+index1.restrict3);
        System.out.println("--同类访问private--"+index1.restrict4);
    }
    public static int restrict1 = 100;
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
    public Index1(){
        System.out.println("父-无参构造器");
    }
    public Index1(String kName, int kAge){
        System.out.println("父-有参构造器" + kName + "---" + kAge);
    }
}

