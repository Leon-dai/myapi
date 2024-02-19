package com.itheima.a08regexdemo;

public class RegexDemo3 {
    public static void main(String[] args) {
        // .表示任意一个字符
        System.out.println("-----------------1-----------------");
        System.out.println("你".matches(".."));//false
        System.out.println("你".matches("."));//true
        System.out.println("你a".matches(".."));//true

        // \\d只能是任意的一位数字 有一个\是转义字符
        System.out.println("-----------------2-----------------");
        System.out.println("a".matches("\\d"));//false
        System.out.println("11".matches("\\d"));//false
        System.out.println("11".matches("\\d\\d"));//true
        System.out.println("0".matches("\\d"));//true

        // \\w只能是一位单词字符 [a-zA-Z_0-9]
        System.out.println("-----------------3-----------------");
        System.out.println("z".matches("\\w"));//true
        System.out.println("2".matches("\\w"));//true
        System.out.println("33".matches("\\w"));//false
        System.out.println("_".matches("\\w"));//true
        System.out.println("你".matches("\\w"));//false

        // \\W 表示一位非单词字符
        System.out.println("你".matches("\\W"));//true
        System.out.println("******************************************");
        System.out.println("以上正则匹配都只能校验单个字符");

        //必须是数字 字母 下划线 至少6位
        System.out.println("dfjadjfla".matches("\\w{6,}"));//true
        System.out.println("dfja".matches("\\w{6,}"));//false

        //必须是数字和字符 必须是4位
        System.out.println("23dF".matches("[a-zA-Z0-9]{4}"));//true
        System.out.println("23_F".matches("[a-zA-Z0-9]{4}"));//false
        System.out.println("23dF".matches("[\\w&&[^_]]{4}"));//true
        System.out.println("23_F".matches("[\\w&&[^_]]{4}"));//false



    }
}
