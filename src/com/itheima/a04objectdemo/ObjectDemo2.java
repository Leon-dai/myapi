package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        //ctrl+B跟进  ctrl+F12可以查看类中所有方法，阅读源码的时候很有用
        String s1 = new String("abc");
        StringBuilder s2 = new StringBuilder("abc");
        System.out.println(s1.equals(s2));//false
        //因为equals方法是被s调用的，而s是字符串
        //所以equals要看String类中的
        //字符串中的equals方法，先判断参数是否为字符串
        //如果是字符串，再比较内部的属性
        //但是如果参数不是字符串，直接返回false
        System.out.println(s2.equals(s1));//false
        //因为equals方法是被sb调用的，而sb是StringBuilder
        //所以这里的equals方法要看StringBuilder中的equals方法
        //那么在StringBuilder当中，没有重写equals方法
        //使用的是object中的
        //在object当中默认是使用==号比较两个对象的地址值
        //而这里的s和sb记录的地址值是不一样的，所以结果返回false
    }
}
