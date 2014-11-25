package basiclevelpractise;

import java.util.Arrays;
import java.util.Scanner;
/**
 * PAT (主要在于如何输出， 你不一定处理好之后放入数组你可以直接拼接输出即可)
 * 
 * 一个数组A中存有N（N>0）个整数，在不允许使用另外数组的前提下，将每个整数循环向右移M（M>=0）个位置，即将A中的数据由（A0 A1……AN-1）变换为（AN-M …… AN-1 A0 A1……AN-M-1）（最后M个数循环移至最前面的M个位置）。如果需要考虑程序移动数据的次数尽量少，要如何设计移动的方法？

	输入格式：每个输入包含一个测试用例，第1行输入N ( 1<=N<=100)、M（M>=0）；第2行输入N个整数，之间用空格分隔。
	
	输出格式：在一行中输出循环右移M位以后的整数序列，之间用空格分隔，序列结尾不能有多余空格。
	
	输入样例：
	6 2
	1 2 3 4 5 6
	输出样例：
	5 6 1 2 3 4
 * @author lzy
 *
 */
public class P1008 {
	public static void rightShift(int[] a, int n, int m){
		String result = "";
		if (m%n == 0) {
			for (int i = 0; i < a.length; i++) {
				result = result+a[i]+" ";
			}
		}else{
			int idx = n - m%n;
			int count = 0;
			while (count< n) {
				result = result+a[idx++]+" ";
				idx = idx%n;
				count++;
			}
		}
		System.out.printf("%s", result.trim());
		
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] ins = new int[n];
		for (int i = 0; i < ins.length; i++) {
			ins[i] = scanner.nextInt();
		}
//		 System.out.println(Arrays.toString(ins));
		rightShift(ins, n, m);
	}
}
