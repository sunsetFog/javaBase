package com.basics;
/*
类名区分大小写
类名要与文件名一致
一个源文件只能一个public，类数量不限class Pig {}
*/
public class zhuanhuan {
    // main方法
    public static void main(String[] args){
        /*
            自动转换
                boolean不参与转换
                byte不能转char
                // String相加是字符串拼接

        */
        int k1 = 'a';
        System.out.println("--自动转换:char转int，得出char的编码值--"+k1);// 97

        double k2 = 82;
        System.out.println("--自动转换:int转double--"+k2);// 82.0

        byte s1 = 1;
        short s2 = 1;
        int s3 = s1 + s2;
        System.out.println("--btye,short和char可以计算，但要先自动转int类型--"+ s3);// 2


        float y1 = 12.1F;
        double y2 = y1;
        System.out.println("--自动转换:float转double，小数点精确度有误差--"+y2);// 12.100000381469727

        /*
            强制转换
         */
        double h1 = 3.14;
        float h2 = (float)h1;
        System.out.println("--强制转换:double转float，小数点精确度没影响--"+h2);// 3.14

        int a = 90;
        float ddkj = a + 10.7F;
        System.out.println("--float转换计算--" + ddkj);// 100.7

        int j1 = (int)1.9;
        System.out.println("--强制转换:浮点数转int,小数点精确度缺失--"+j1);// 1


        int hsg = 982;
        byte kjxjs = (byte)hsg;
        System.out.println("--强制转换:int转byte，造成数据溢出--"+kjxjs);// 42

        // int dkhdh = (int)10*3.5;// 错误 double不能转int
        int dkhdh = (int)(10*3.5);// 对 小括号提升优先级
        System.out.println("--double不能转int--" + dkhdh);

        char jshj = 100;// 对 char类型可以保存int常量值
        int jsjsj = 100;
        // char llsl = jsjsj;// 错 char类型不可以保存int变量值

        int lkdk = 983;
        String kskdk = lkdk + "";
        System.out.println("--int转String--"+kskdk);

        String kdkksd = "03249";
        int slkk = Integer.parseInt(kdkksd);// String转int 若kdkksd是hello就会运行报错，编译正常
        double llsjn = Double.parseDouble(kdkksd);// String转Double   以此类推
        boolean dsisj = Boolean.parseBoolean("true");
        System.out.println("得到String第一个字符" + kdkksd.charAt(1));
        System.out.println("--String转int--"+slkk);
        System.out.println("--String转Double--"+llsjn);
        System.out.println("--String转boolean--"+dsisj);

        char dofs = '男';
        char kdi = '女';
        System.out.println("--字符码值相加--" + (dofs + kdi));
    }
}
