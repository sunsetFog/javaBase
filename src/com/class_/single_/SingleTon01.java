package com.class_.single_;

public class SingleTon01 {

    public static void main(String[] args) {
//        GirlFriend xh = new GirlFriend("小红");
//        GirlFriend xb = new GirlFriend("小白");

        //通过方法可以获取对象
        GirlFriend instance = GirlFriend.getInstance();
        System.out.println("-实例对象1-"+instance);

        GirlFriend instance2 = GirlFriend.getInstance();
        System.out.println("-实例对象2-"+instance2);

        System.out.println("-判断引用类型的哈希值是否相等-"+(instance == instance2));//T
        //System.out.println(GirlFriend.n1);

        //...


    }

}

//有一个类， GirlFriend
//只能有一个女朋友
class GirlFriend {

    private String name;
    //public static  int n1 = 100;
    //为了能够在静态方法中，返回 gf对象，需要将其修饰为static
    //對象，通常是重量級的對象, 餓漢式可能造成創建了對象，但是沒有使用.
    private static GirlFriend gf = new GirlFriend("小红红");
    // 可以先定义，默认值为null
//    private static GirlFriend gf;

    //如何保障我们只能创建一个 GirlFriend 对象
    //步骤[单例模式-饿汉式]
    //1. 将构造器私有化
    //2. 在类的内部直接创建对象(该对象是static)
    //3. 提供一个公共的static方法，返回 gf对象
    private GirlFriend(String name) {
        System.out.println("構造器被調用.");
        this.name = name;
    }

    public static GirlFriend getInstance() {

//        if(gf == null) {//如果還沒有創建cat對象
//            gf = new GirlFriend("小红红");
//        }
//        return gf;

        return gf;

    }

    @Override
    public String toString() {
        return "GirlFriend{" +
                "name='" + name + '\'' +
                '}';
    }
}
