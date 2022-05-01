package com.basics;

public class denghao {
    public static void main(String[] args){
        int num1 = 10;
        double num2 = 10.0;
        System.out.println("比较运算符==：" + (num1 == num2));// 基本数据类型，判断值是否相等；若是引用类型，判断地址是否相等，既是是否同一个对象

        Lei1 aa = new Lei1();
        Lei1 bb = aa;
        Lei1 cc = new Lei1();
        System.out.println("比较运算符==:" + (aa == bb) + "--aa和cc会新建不同的对象--" +(aa == cc));// 引用类型，判断地址是否相等
        // 查看源码    选好equals，右键---go to---D or U      进入后想看所有，点左边的Structure

        System.out.println("equals:" + (bb.equals(cc)));// equals只能判断引用类型    若是子类重写equals方法，判断值是否相等，比如Integer,String
        String ksa1 = new String("ew");
        String ksa2 = new String("ew");
        System.out.println("equals:" + (ksa1.equals(ksa2)));// 判断值是否相等
        // 引用类型，同一对象，哈希值相同；不同对象，哈希值不同   (哈希值是十六进制)
        System.out.println("hashCode:" + aa.hashCode() + "---" + bb.hashCode() + "---" + cc.hashCode());
        // 返回全类名+@+哈希值   若是子类重写toString方法,返回对象的属性信息 比如String
        System.out.println("toString:" + aa.toString());
        System.out.println("toString:" + ksa1.toString());
        // 当某个对象没有任何引用时，触发垃圾回收机制
//        cc = null;// 系统自动垃圾回收机制
        System.gc();// 主动触发垃圾回收机制

    }
}

class Lei1 {
    int age = 15;
    public Lei1(){

    }

    // 重写toString方法    敲toString就出现，不用写
    public String toString() {
        return "Lei1{" +
                "age=" + age +
                '}';
    }

    // 重写finalize方法
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("垃圾回收机制");
    }
}
class Lei2 extends Lei1 {
    int age = 16;
}
class Lei3 extends Lei1 {
    int age = 17;
}