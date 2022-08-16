package com.class_.super_;
/*
    extends关键字，类的继承：构造器与super关键字
    extends一个子类只能拥有一个父类
    继承的本质：找属性从子类找，没就找父类，没就找爷类
*/
public class Children extends Parent {
    public static void main(String[] args) {
        // 实例化，子父构造器都会触发
//        Children children = new Children();
        Children children = new Children("广州");
        children.drink();
        // 向上转型，编译类型是Parent，运行类型是Children，因此只能调用父类方法，不能调用字类特有方法
        Parent yaya = new Children("佛山");
//        yaya.drink();
    }
    // 子默认构造器,不需要可以不写
    public Children() {
        /*
            super(*)调用父类构造器必须第一个语句
            调用父类默认构造器
            super()默认就有，不必写
            调用父类有参构造器
            super(传参)

            super.**() 用于访问父类成员
        */
    }
    // 子有参构造器
    public Children(String city) {
        super("小爱同学");// 等于 this("小爱同学");
        this.eat();// this关键字 调用自己的方法
        super.eat();// super 调用父类方法
        eat();
        System.out.println("--所在城市--"+city);
    }
    /*
        重写父类方法

        这里如果没有写 @Override 还是重写了父类方法
        如果你写了@Override注解，编译器就会去检查该方法是否真的重写了父类的
        方法，如果的确重写了，则编译通过，如果没有构成重写，则编译错误

        重写方法不能变：方法名，参数列表，返回类型，不能抛出新的异常
    */
    @Override
    void eat() {
        System.out.println("--子类默认方法--");
    }
    void drink() {
        System.out.println("--子类特有方法，要编译类型是这个类，才能调用--");
    }
}
