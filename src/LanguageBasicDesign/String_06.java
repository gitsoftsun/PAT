package LanguageBasicDesign;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 一个IP地址是用四个字节（每个字节8个位）的二进制码组成。请将32位二进制码表示的IP地址转换为十进制格式表示的IP地址输出。

	输入格式：
	
	输入在一行中给出32位二进制字符串。
	
	输出格式：
	
	在一行中输出十进制格式的IP地址，其由4个十进制数组成（分别对应4个8位的二进制数），中间用“.”分隔开。
 * @author lzy
 *
 */
public class String_06 {
	public static void toDecimal(String inputs){
		String result = "";
		String[] temp = new String[4];
		Matcher matcher = Pattern.compile("\\d{8}").matcher(inputs);
		for(int i =0; matcher.find() && i < temp.length; i++){
			temp[i] = matcher.group();
		}
		for(String str : temp){
			Matcher m = Pattern.compile("\\d{1}").matcher(str);
			String[] strs = new String[8];
			for(int i =0; m.find() && i < strs.length; i++){
				strs[i] = m.group();
			}
			int sum = 0;
			for(int i =0; i < strs.length; i++){
				int bin = Integer.valueOf(strs[i]);
				if(bin == 1){
					sum = sum + (int)(bin*Math.pow(2, (7-i)));	
				}
			}
			result = result + sum + ".";
		}
		System.out.printf("%s", result.substring(0, result.length()-1)); //subString 是前开后闭的方法 beginIndex(include), endIndex (exclude)
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String testString = scanner.next();
		toDecimal(testString);
	}

}
