package com.Class.Polymorphic;
// 包  src---New---package
import com.Class.isExtends.Children;
import com.Class.isExtends.Parent;

public class Ming {
    public static void main(String[] args){
        Parent hua2 = new Parent();//等同com.xiaohua.Hua hua2 = new com.Class.xiaohua.Hua()
        hua2.restrict5();
        Children haizi2 = new Children();
        haizi2.xianhua();
//        System.out.println("不同包" + hua2.restrict1 + "---" + hua2.restrict2 + "---" + hua2.restrict3 + "---" + hua2.restrict4);
        System.out.println("不同包" + hua2.restrict1);
    }
}
