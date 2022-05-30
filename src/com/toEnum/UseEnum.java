package com.toEnum;

public class UseEnum {
    public static void main(String[] args) {
        System.out.println("--枚举--"+StatusEnum.SUCCESS.getCode());
        StatusEnum[] values = StatusEnum.values();
        for (StatusEnum item : values) {
            System.out.println("--枚举遍历--"+item);
        }
    }
}
