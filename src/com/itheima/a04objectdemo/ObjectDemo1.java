package com.itheima.a04objectdemo;

public class ObjectDemo1 {
    public static void main(String[] args) {
        /*
            public String toString()   返回对象的字符串表示形式
            public boolean equals(Object obj) 比较两个对象是否相等
            protected Object clone(int a) 对象克隆
         */

        //1.toString 返回对象的字符串表示形式
        Object obj = new Object();
        String str1 = obj.toString();
        System.out.println(str1);//java.lang.Object@776ec8df

        Student stu = new Student();
        String str2 = stu.toString();
        System.out.println(str2);//com.itheima.a04objectdemo.Student@3b07d329
    }
}
