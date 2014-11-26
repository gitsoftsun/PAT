package advancedLevelPractise;

import java.util.Scanner;

/**
 * Q:http://www.patest.cn/contests/pat-a-practise/1031
 * 
 * Waring： 一个测试用例没有通过
 * 
 * @author lzy
 *
 */

public class P1031 {
	private static final int CHARS_LENGTH = 2; // the shape of U 's border
	public static int[] getNx(int n){
		int[] result = new int[2];
		int res= 0, n2 = (n+3)/2, minValue = n;
		for (int i = n2; i >= 3; i--) {
			if ((n+2-i)%2 != 0) {
				continue;
			}
			int n1 = (n+2-i)/2;
			res = Math.abs(i - n1);
			if (res < minValue) {
				minValue = res;
				result[1] = i;
			}
		}
		result[0] = result[1] - minValue;
		return result;
	}
	public static void output(int[] a, String str){
		int gaps = a[1] - CHARS_LENGTH;
		int lines =0, s= 0, e = str.length()-1;
		while(lines < a[0]-1 && s < e){
			String result ="";
			result += str.charAt(s++);
			for (int i = 0; i < gaps; i++) {
				result = String.format("%s%s", result, " ");
			}
			result = String.format("%s%s\n", result, str.charAt(e--));
			System.out.printf("%s", result);
			lines++;
		}
		System.out.printf("%s", str.substring(s, e+1));
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		output(getNx(input.length()), input);
	}
	
}
