package LanguageBasicDesign;

import java.util.Scanner;

/**
 * Q: http://www.patest.cn/contests/basic-programming/%E5%BE%AA%E7%8E%AF-01
 * 
 * tinking : 主要在于输出的格式上面；
 * 			除了 每行满5个换行外， 还有最好一个元素也是需要换行的
 * @author lzy
 *
 */

public class Loop_01 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int start = scanner.nextInt();
		int end = scanner.nextInt();
		printSum(start, end);
	}
	public static void printSum(int start, int end){
		int count =1, sum =0;
		for (int i = start; i <= end; i++) {
			sum += i;
			System.out.printf("%5d", i);
			if (count++%5 == 0 || i == end) {
				System.out.println();
			}
		}
		System.out.printf("Sum = %d", sum);
	}

}
