package com.basics;
// 四种进制
public class jinzhi {
    public static void main(String[] args){
        int n1 = 0b1010;// 二进制   0，1表示  满2进1   以0B(0b)开头
        int n2 = 1010;// 十进制   0~9表示  满10进1
        int n3 = 01010;// 八进制   0~7表示  满8进1   以0开头
        int n4 = 0x10101;// 十六进制   0~9及A~F(10~15)表示 满16进1  以0X(0x)开头

        // 进制转换
        // 2、8、16进制转十进制    位上的数*2的(位数-1) 然后求和
        // 十进制转2、8、16进制         不断除以2，取倒余数

        // 二进制转八进制   每三位，按二进制转十进制
        // 二进制转十六进制   每四位，按二进制转十进制

        // 八进制转二进制   每一位，按十进制转3位的二进制
        // 十六进制转二进制   每一位，按十进制转4位的二进制
        System.out.println("n1=" + n1);
        System.out.println("n2=" + n2);
        System.out.println("n3=" + n3);
        System.out.println("n4=" + n4);
	   	/*
				原码、反码、补码
				二进制最高位是符号位：0是正数，1是负数
				正数的原码、反码、补码都一样的
				负数的反码=原码符号位不变，其他位取反
				负数的补码=反码+1， 负数的反码 = 负数的补码-1
				0是反码，补码都是0
				java中的数都是有符号的
				计算机运行，都是以补码的方式运算的
				看运算结果，看的是原码
	   	*/

    }
}
