package com.itheima.a08regexdemo;

public class RegexDemo2 {
    public static void main(String[] args) {
        //public boolean matches(Stringregex):判断是否与正则表达式匹配，匹配返回true
        //只能是a b c 一个中括号表示一个字符
        System.out.println("-----------------1-----------------");
        System.out.println("a".matches("[abc]"));//true
        System.out.println("z".matches("[abc]"));//false
        System.out.println("aa".matches("[abc][abc]"));//true

        //不能出现a b c
        System.out.println("-----------------2-----------------");
        System.out.println("a".matches("[^abc]"));//false
        System.out.println("z".matches("[^abc]"));//true
        System.out.println("zz".matches("[^abc]"));//false
        System.out.println("zz".matches("[^abc][^abc]"));//true

        //a到z A到Z(包括头尾的范围)
        System.out.println("-----------------3-----------------");
        System.out.println("a".matches("[a-zA-Z]"));//true
        System.out.println("z".matches("[a-zA-Z]"));//true
        System.out.println("zz".matches("[a-zA-Z]"));//false
        System.out.println("aa".matches("[a-zA-Z]"));//false
        System.out.println("0".matches("[a-zA-Z]"));//false

        //[a-d[m-p]] a到d，或m到p
        System.out.println("-----------------4-----------------");
        System.out.println("a".matches("[a-d[m-p]]"));//true
        System.out.println("d".matches("[a-d[m-p]]"));//true
        System.out.println("m".matches("[a-d[m-p]]"));//true
        System.out.println("p".matches("[a-d[m-p]]"));//true
        System.out.println("e".matches("[a-d[m-p]]"));//false
        System.out.println("0".matches("[a-d[m-p]]"));//false

        //[a-z&&[def]] a-z和def的交集  为d,e,f
        System.out.println("-----------------5-----------------");
        System.out.println("a".matches("[a-z&&[def]]"));//false
        System.out.println("d".matches("[a-z&&[def]]"));//true
        System.out.println("e".matches("[a-z&&[def]]"));//true
        System.out.println("f".matches("[a-z&&[def]]"));//true
        System.out.println("z".matches("[a-z&&[def]]"));//false
        System.out.println("0".matches("[a-z&&[def]]"));//false

        //[a-z&&[^bc]] a-z和bc的交集 等同于[ad-z]
        System.out.println("-----------------6-----------------");
        System.out.println("a".matches("[a-z&&[^bc]]"));//true
        System.out.println("b".matches("[a-z&&[^bc]]"));//false
        System.out.println("0".matches("[a-z&&[^bc]]"));//false
        System.out.println("a".matches("[ad-z]"));//true
        System.out.println("d".matches("[ad-z]"));//true
        System.out.println("b".matches("[ad-z]"));//false

        //[a-z&&[^m-p]] a到z和除了m到p的交集 (等同于[a-lq-z])
        System.out.println("-----------------7-----------------");
        System.out.println("a".matches("[a-z&&[^m-p]]"));//true
        System.out.println("m".matches("[a-z&&[^m-p]]"));//false
        System.out.println("0".matches("[a-z&&[^m-p]]"));//false


    }
}
