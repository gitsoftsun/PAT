package basiclevelpractise;

import java.util.Scanner;
/**
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。

	现给定数字，请编写程序输出能够组成的最小的数。
	
	输入格式：
	
	每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数字1、……数字9的个数。整数间用一个空格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
	
	输出格式：
	
	在一行中输出能够组成的最小的数。
	
	输入样例：
	2 2 0 0 0 3 0 0 1 0
	输出样例：
	10015558
 * @author lzy
 *
 */
public class P1023 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] inputs = new int[10];
		for (int i = 0; i < inputs.length && scanner.hasNext(); i++) {
			inputs[i] = scanner.nextInt();
		}
		System.out.printf("%s", produceMinNumber(inputs));
	}
	public static String produceMinNumber(int[] a){
		StringBuilder stringBuilder = new StringBuilder();
		//确定最高位的值
		for (int i = 1; i < a.length; i++) {
			if (a[i] != 0) {
				stringBuilder.append(i);
				a[i]--;
				break;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 0) {
				for (int j2 = 0; j2 < a[j]; j2++) {
					stringBuilder.append(j);
				}
			}
		}
		return stringBuilder.toString();
	}
}
