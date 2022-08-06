package com.basics.arrays_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/*
集合
*/
public class isList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(100);
        arrayList.add(160);
        arrayList.add(190);
        arrayList.add("小小");
        arrayList.add(1,80);// 在下标插入一项
        System.out.println("--添加--" + arrayList);

        arrayList.remove(0);// 参数是索引，也就是下标
        arrayList.remove("小小");// 删除指定某个元素
        System.out.println("--删除--" + arrayList);

        arrayList.set(0, "小龙女");
        System.out.println("--修改--" + arrayList);

        System.out.println("--获取--" + arrayList.get(0));

        int index1 = arrayList.indexOf("小龙女");
        int index2 = arrayList.lastIndexOf("小龙女");
        System.out.println("--返回第一次出现的下标--" + index1);
        System.out.println("--返回最后一次出现的下标--" + index2);

        System.out.println("--截取-留首不留尾--" + arrayList.subList(0, 1));

        System.out.println("--List长度--"+arrayList.size());
        System.out.println("--是否空数组--"+arrayList.isEmpty());// 返回true或false
//        arrayList.clear(); // 清空数组
        System.out.println("--元素是否存在--"+arrayList.contains("小龙女"));// 返回true或false

        ArrayList shuzu = new ArrayList();
        shuzu.add("季节");
        shuzu.add("月季");
        arrayList.addAll(shuzu);
        System.out.println("--添加多个元素--"+arrayList);
        arrayList.removeAll(shuzu);// 删除多个


        // 遍历
        for (int i = 0; i < arrayList.size(); i++) {
            Object xiang = arrayList.get(i);
            System.out.println("--for数组项--" + arrayList.get(i) + "---" + xiang);
        }
        for(Object item:arrayList) {// 模板快捷键 I
            System.out.println("--增强for数组项--" + item);
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()){ // 模板快捷键 itit
            Object next = iterator.next();
            System.out.println("--迭代器--"+next);
        }


    }
}
