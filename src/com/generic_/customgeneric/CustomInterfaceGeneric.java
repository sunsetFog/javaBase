package com.generic_.customgeneric;

// 泛型接口
public class CustomInterfaceGeneric {
    public static void main(String[] args) {

    }
}

/**
 *  泛型接口使用的说明
 *  1. 接口中，静态成员也不能使用泛型
 *  2. 泛型接口的类型, 在继承接口或者实现接口时确定
 *  3. 没有指定类型，默认为Object
 */

//接口继承接口 指定泛型接口的类型
interface IA extends IUsb<String, Double> {

}
//类实现接口
class AA implements IA {

    @Override
    public Double get(String s) {
        return null;
    }
    @Override
    public void hi(Double aDouble) {

    }
    @Override
    public void run(Double r1, Double r2, String u1, String u2) {

    }
}
/*
    类实现泛型接口
    实现接口时，直接指定泛型接口的类型，给U 指定Integer 给 R 指定了 Float
*/
class BB implements IUsb<Integer, Float> {

    @Override
    public Float get(Integer integer) {
        return null;
    }

    @Override
    public void hi(Float aFloat) {

    }

    @Override
    public void run(Float r1, Float r2, Integer u1, Integer u2) {

    }
}
/*
    类实现泛型接口
    没有指定类型，默认为<Object,Object>
    建议直接写成 IUsb<Object,Object>
*/
class CC implements IUsb { // 等价 class CC implements IUsb<Object,Object> {
    @Override
    public Object get(Object o) {
        return null;
    }
    @Override
    public void hi(Object o) {
    }
    @Override
    public void run(Object r1, Object r2, Object u1, Object u2) {

    }

}
// 泛型接口
interface IUsb<U, R> {

    int n = 10;
    //U name; 不能这样使用

    //普通方法中，可以使用接口泛型
    R get(U u);

    void hi(R r);

    void run(R r1, R r2, U u1, U u2);

    //在jdk8 中，可以在接口中，使用默认方法, 也是可以使用泛型
    default R method(U u) {
        return null;
    }
}


