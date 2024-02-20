package com.itheima.a08regexdemo;

public class RegexDemo10 {
    public static void main(String[] args) {
        //捕获分组
        //需求1：判断一个字符串的开始字符和结束字符是否一致？只考虑一个字符
        //举例：a123a b456b 17891 &abc& a123b(false)
        //   \\组号：表示第X组的内容再拿出来用一次
        String regex1 = "(.).+\\1";
        System.out.println("a123a".matches(regex1));//true
        System.out.println("b456b".matches(regex1));//true
        System.out.println("17891".matches(regex1));//true
        System.out.println("&abc&".matches(regex1));//true
        System.out.println("a123b".matches(regex1));//false
        System.out.println("----------------------------------------");

        //需求2：判断一个字符串的开始部分和结束部分是否一致？可以有多个字符
        //举例：abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));//true
        System.out.println("b456b".matches(regex2));//true
        System.out.println("123789123".matches(regex2));//true
        System.out.println("&!@abc&!@".matches(regex2));//true
        System.out.println("abc123abd".matches(regex2));//false

        //需求3：判断一个字符串的开始部分和结束部分是否一致？开始部分内部每个字符也需要一致
        //举例：aaa123aaa bbb456bbb 111789111 &&abc&&

        //(.):把首字母看做一组
        // \\2:把首字母拿出来再次使用
        // *：作用于\\2,表示后面的内容重复出现0次或多次
        //以左括号为基准，第一个左括号为第一组，第二个为第二组
        String regex3 = "((.)\\2*).+\\1";
        System.out.println("aaa123aaa".matches(regex3));//true
        System.out.println("bbb456bbb".matches(regex3));//true
        System.out.println("111789111".matches(regex3));//true
        System.out.println("&&abc&&".matches(regex3));//true
        System.out.println("&&abc&!".matches(regex3));//false
    }
}
