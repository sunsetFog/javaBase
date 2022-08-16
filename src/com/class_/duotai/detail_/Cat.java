package com.class_.duotai.detail_;

public class Cat extends Animal {
    // 重写父类方法
    public void eat(){//方法重写
        System.out.println("猫吃鱼");
    }
    public void catchMouse(){//Cat特有方法
        System.out.println("该子类特有方法，编译类型是该类才能调用");
    }
}
