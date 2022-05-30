package com.toEnum;
/*
枚举：
    枚举是一个特殊的类，一般表示一组常量
    枚举跟普通类一样可以用自己的变量、方法和构造函数
    内部类实现：所有的枚举值都是 public static final 的

    values() 枚举类中所有的值
    ordinal() 索引
*/

public enum StatusEnum {
    SUCCESS("200", "请求成功"),// 各个常量使用逗号 , 来分割
    ERROR("1111", "请求失败");// 分号结束枚举值

    private String code;
    private String msg;
    StatusEnum(String code, String msg) {
        System.out.println("--枚举有参构造器--"+code+"---"+msg);
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        System.out.println("--getCode--"+code);
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
