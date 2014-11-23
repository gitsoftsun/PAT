package LanguageBasicDesign;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 输入一个字符串S，再输入一个字符c，要求在字符串S中查找字符c。如果找不到则输出“Not found”；若找到则输出字符串S中从c开始的所有字符。

	输入格式：
	
	输入在第1行中给出一个不超过80个字符长度的、以回车结束的非空字符串；在第2行中给出一个字符。
	
	输出格式：
	
	在一行中按照题目要求输出结果。
 * @author lzy
 *
 */
public class String_01 {
	public static void processString(String str, char c){
		int index = str.indexOf(c);
		if (index == -1){
			System.out.printf("%s", "Not found");
		}
		System.out.printf("%s", str.substring(index));
	}
	public static void main(String[] args){
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			String strings = bufferReader.readLine();
			String chars = bufferReader.readLine();
			char[] ch = chars.toCharArray();
			char c = ch[0];
			processString(strings, c);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
