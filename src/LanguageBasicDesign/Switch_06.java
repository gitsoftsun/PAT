package LanguageBasicDesign;

import java.util.Scanner;
/**
 * 分支-06. 成绩转换(15)
	
	时间限制
	400 ms
	内存限制
	65536 kB
	代码长度限制
	8000 B
	判题程序
	Standard
	作者
	沈睿（浙江大学）
	本题要求编写程序将一个百分制成绩转换为五分制成绩。转换规则：
	
	大于等于90分为A；
	小于90且大于等于80为B；
	小于80且大于等于70为C；
	小于70且大于等于60为D；
	小于60为E。
	输入格式：
	
	输入在一行中给出1个整数的百分制成绩。
	
	输出格式：
	
	在一行中输出对应的五分制成绩。
	
	输入样例：
	90
	输出样例：
	A
 * @author lzy
 *
 */

public class Switch_06 {
	public static String scoreLevel(int x){
		if(x >= 90){
			return "A";
		}else if (x < 90 && x >= 80){
			return "B";
		}else if (x < 80 && x >= 70){
			return "C";
		}else if(x < 70 && x >= 60){
			return "D";
		}else{
			return "E";
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in, "utf-8");
		int score = scanner.nextInt();
		System.out.print(scoreLevel(score));
	}

}
