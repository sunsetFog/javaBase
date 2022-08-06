package com.basics.date_;

import java.time.Instant;
import java.util.Date;

/**
 * @author 韩顺平
 * @version 1.0
 */
public class Instant_ {
    public static void main(String[] args) {

        //1.通过 静态方法 now() 获取表示当前时间戳的对象
        Instant now = Instant.now();
        System.out.println("--1--"+now);
        //2. 通过 from 可以把 Instant转成 Date
        Date date = Date.from(now);
        System.out.println("--2--"+date);
        //3. 通过 date的toInstant() 可以把 date 转成Instant对象
        Instant instant = date.toInstant();
        System.out.println("--3--"+instant);

    }
}
