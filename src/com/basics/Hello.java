package com.basics;
// 表示Hello是一个类，一个public公有的类，Hello要与文件名一致
public class Hello {
    // main方法
    public static void main(String[] args){
        // 定义变量
        // 数据的基本类型
        int a = 23;//整数类型 字节  4字节(占用空间)
        byte s = 29;//整数类型 整型  1字节   1byte = 8bit
        short j = 97;//整数类型 短整型 2字节
        long k = 78L;//整数类型 长整型 8字节        --- L结尾

        double score1 = 88.2;//单精度 浮点(小数)  8字节
        double score2 = 8.1 / 3;// 不是2.7,是以精度返回2.6999999
        float kj = 24.7F;//双精度 浮点(小数)  4字节   --- F结尾，因为浮点型默认为double类型


        boolean jh = true;// 布尔型  1字节

        char gender = '男';// 字符型  单引号  2字节

        String namek = "king";// 字符串  双引号  不是基本数据类型    --- 双引号

        // 引用数据类型：类、接口interface、数组
        a = 90;// 赋值
        // 输出到屏幕，分号表示语句结束 l是L，不是i
        System.out.println("hello,world~" + a + "\n" + score2);
        System.out.println("char:" + gender + "---转数字码值---" +(int)gender);

        // (btye,short)和char 不会自动转换，计算先转int类型
        // if判断一样
        // 数据类型转换
        // boolean不参与转换
        int jdj = 'a';//97 char转int
        double score3 = 82;//82.0 int转double
        System.out.println("自动转换:" + jdj + "---" + score3);

        // float和double能自动转换
        // float ddkj = a + 24.7;// 错，结果double类型，因为计算先转换容量最大的类型
        float ddkj = a + 24.7F;//对 结果浮点类型
        System.out.println("float转换计算:" + ddkj);
        // byte不能转char
        // 强制转换
        int hhd = (int)1.9;// 造成精度缺失
        int hsg = 982;
        byte kjxjs = (byte)hsg;// 造成数据溢出
        System.out.println("强制转换:" + hhd + "---" + kjxjs);
        // int dkhdh = (int)10*3.5;// 错误 double不能转int
        int dkhdh = (int)(10*3.5);// 对 小括号提升优先级
        System.out.println("double不能转int:" + dkhdh);

        char jshj = 100;// 对 char类型可以保存int常量值
        int jsjsj = 100;
        // char llsl = jsjsj;// 错 char类型不可以保存int变量值

        // 基本数据类型转String
        int lkdk = 983;
        String kskdk = lkdk + "";

        String kdkksd = "03249";
        int slkk = Integer.parseInt(kdkksd);// String转int 若kdkksd是hello就会运行报错，编译正常
        double llsjn = Double.parseDouble(kdkksd);// String转Double   以此类推
        boolean dsisj = Boolean.parseBoolean("true");
        System.out.println("得到String第一个字符" + kdkksd.charAt(1));

        char dofs = '男';
        char kdi = '女';
        System.out.println("字符码值相加" + (dofs + kdi));// String相加是字符串拼接，double是加法

        int[] kkjsj = { 92, 203, 053 };
        int[] lsdllw = new int[5];
        String[] lsdw = { "ka", "sdl" };
        System.out.println("数组1" + kkjsj);
        System.out.println("数组2" + lsdw);
        int[][] lsjs = { { 923, 032 }, { 312, 12, 230 } };
        System.out.println("二维数组" + lsjs);
        for(int i = 0; i < lsdllw.length; i++){
            System.out.println("数组" + lsdllw.length + "---" + lsdllw[i] + "---" + lsdllw);
        }

    }
}


// 区分大小写
// 一个源文件只能一个public，类数量不限
class Pig {
    public static void main(String[] args){
        System.out.println("hello,小猫~");
    }
}