package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {
        /*
            只写+和*表示贪婪匹配
            +?非贪婪匹配
            *?非贪婪匹配

            贪婪爬取：在爬取数据的时候尽可能的多获取数据
            非贪婪爬取：在爬取数据的时候尽可能的少获取数据

            ab+:
            贪婪爬取：abbbbbbbbbbbb
            非贪婪爬取：ab

            Java当中，默认的就是贪婪爬取
            如果我们在数量词+ *的后面加上问号，那么此时就是非贪婪爬取

         */

        String s = "Java自从95年问世以来，abbbbbbbbbbbbaaaaaaaaaaaaaaaaaa" +
                "经历了很多版本，目前企业中用的最多的是Java8和Java11，因为这两个是长期支持版本，" +
                "下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

//        String regex = "ab+";
        String regex = "ab+?";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }


    }
}
