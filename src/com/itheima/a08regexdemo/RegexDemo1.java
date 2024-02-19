package com.itheima.a08regexdemo;

public class RegexDemo1 {
    public static void main(String[] args) {
        /*
            假如现在要求校验一个QQ号码是否正确
            规则：6位及20位之内，0不能在开头，必须全部是数字
            先使用目前所学知识完成校验需求
            然后体验一下正则表达式检验
         */
        String qq = "1234567890";
        System.out.println(qq.matches("[1-9]\\d{5,19}"));
    }


    public static boolean checkQQ(String qq) {
        int len = qq.length();
        if (len < 6 || len > 20) {
            return false;
        }

        //0不能在开头
        if(qq.startsWith("0")){
            return false;
        }

        //必须全部都是数字
        for (int i = 0; i < qq.length(); i++) {
            char c = qq.charAt(i);
            if(c < '0' || c > '9'){
                return false;
            }
        }

        return true;
    }
}
