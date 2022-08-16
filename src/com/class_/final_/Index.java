package com.class_.final_;
/*
final 可以用来修饰变量（包括类属性、对象属性、局部变量和形参）、类方法和类。
final修饰类，该类不能被继承，也就没必要final修饰方法了
*/
public final class Index {
    /*
        final修饰属性，值不能被修改了
        final 和 static 往往搭配使用，效率更高
    */
    public final static double TAX_RATE = 0.08;
    /*
        final修饰方法，该方法就不能被子类重写
    */
    public final void bean() {

    }
}
