package com.Class.isExtends;

public class Children extends Parent {// 继承   只能继承一个父类  继承多个只能A继承B B继承C
    public Children() {// 无参构造器
        // 默认调用父类的构造器 不写也有   父没有无参构造器，要用super指定父构造器  super和this()只能放第一行，所以不能两个都出现
        super("YV",87);// 访问父类构造器
        // this访问先本类，在找父类
        this.restrict6();
        System.out.println("super访问父类(或爷爷类)的属性、方法、构造器（私有不行）" + super.restrict1 + "---" + super.restrict2 + "---" + super.restrict3);
    }
    public void xianhua(){
        // 找属性时:  先找本类---找父类---没有再往上找父类---直到Object类
        // 方法重写/覆盖：方法名、返回类型，参数一样时，子类方法覆盖父类方法
        System.out.println("子类" + restrict1 + "---" + restrict2 + "---" + restrict3);
    }
}
