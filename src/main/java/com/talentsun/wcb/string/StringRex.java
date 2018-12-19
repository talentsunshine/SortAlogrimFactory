package com.talentsun.wcb.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringRex {

    public static void main(String[] args) {

        String regEx ="(UPDATE|T_PM_USER)";

        //检测要匹配的单词，单词的前面必须是空格或者标点符号
        Pattern pattern = Pattern.compile("[^\\w]*"+regEx+"[^\\w]+");
        //同时存在单词
        Pattern pattern1 = Pattern.compile("(?i).*(\\bUPDATE\\b).*(\\bT_PM_USER\\b)");

        Matcher matcher = pattern1.matcher("RFRFF UPDATE t_pm_user EEE ");

        boolean result= matcher.find();

        System.out.println(result);

    }
}
