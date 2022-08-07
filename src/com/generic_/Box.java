package com.generic_;

import java.io.Serializable;

/*
泛型: 数据类型被指定为一个参数
对象序列化的机制：类继承Serializable接口,实现字母排序

泛型标记符：
E数组项的修饰
T类型
K - Key（键）
V - Value（值）
N - Number（数值类型）
？ - 表示不确定的 java 类型
*/
public class Box<T> implements Serializable {// 泛型类 + 序列化接口
    private String code;
    private String msg;
    // 泛型变量
    private T data;
    // 构造器里添加泛型变量值
    public Box(String code, String msg, T it) {
        System.out.println("--构造器--"+code+"---"+msg+"---"+it);
        this.code = code;
        this.msg = msg;
        this.data = it;
    }

    // 泛型方法：public static <T>
    public static <T> Box printArray(T it) {
        Box<T> integerBox = new Box<T>("200", "请求成功", it);
        System.out.println("--泛型类--"+integerBox);
        return integerBox;
//        System.out.printf("整型值为 :%d\n\n", integerBox.get());
    }
    public static void main(String[] args) {
        printArray("OK");

    }
}
