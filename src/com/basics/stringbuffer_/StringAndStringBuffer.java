package com.basics.stringbuffer_;




/**
 * @author 韩顺平
 * @version 1.0
 */
public class StringAndStringBuffer {
    public static void main(String[] args) {

        //看 String——>StringBuffer
        String str = "hello tom";
        //方式1 使用构造器
        //注意： 返回的才是StringBuffer对象，对str 本身没有影响
        StringBuffer stringBuffer = new StringBuffer(str);
        System.out.println("--构造器--"+stringBuffer);
        //方式2 使用的是append方法
        StringBuffer stringBuffer1 = new StringBuffer();
        stringBuffer1 = stringBuffer1.append(str);
        System.out.println("--append--"+stringBuffer1);

        //看看 StringBuffer ->String
        StringBuffer stringBuffer3 = new StringBuffer("韩顺平教育");
        //方式1 使用StringBuffer提供的 toString方法
        String s = stringBuffer3.toString();
        System.out.println("--toString--"+s);
        //方式2: 使用构造器来搞定
        String s1 = new String(stringBuffer3);
        System.out.println("--String--"+s1);

    }
}
