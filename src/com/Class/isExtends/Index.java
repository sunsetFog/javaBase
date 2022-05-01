package com.Class.isExtends;

public class Index {
    public static void main(String[] args){
        Parent hua2 = new Parent();
        hua2.restrict5();
//        System.out.println("不同包" + hua2.restrict1 + "---" + hua2.restrict2 + "---" + hua2.restrict3 + "---" + hua2.restrict4);
        System.out.println("同包" + hua2.restrict1 + "---" + hua2.restrict2 + "---" + hua2.restrict3);
    }
}
