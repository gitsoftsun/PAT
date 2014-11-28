package LanguageBasicDesign;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Q:http://www.patest.cn/contests/basic-programming/%E6%95%B0%E7%BB%84-01
 * Thinking: 使用正则表达式匹配;是数字输出; 最后校验数组字符串第一位是否为0, 或者
 *String类型转化为Integer类型会将首位为0的数字的0去掉
 * 找出字符串中的数字,组成整数输出;
 * Created by lzy on 2014/11/27.
 */
public class Array_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long result = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) >= '0' && input.charAt(i) <= '9'){
                result = result*10+(input.charAt(i)-'0');
            }
        }
        System.out.printf("%d", result);
    }
    //PAT 有个用例没有通过
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.next();
//        Matcher matcher = Pattern.compile("\\d{1}").matcher(input);
//        String result = "";
//        while (matcher.find()){
//            result = String.format("%s%s",result, matcher.group());
//        }
//        System.out.printf("%d", Long.valueOf(result.equals("") ? "0" : result));
//    }
}
