package advancedLevelPractise;

import java.util.Scanner;
/**
 * 题目： http://www.patest.cn/contests/pat-a-practise/1027
 * 思路： 关键是在于进制的转化问题上； 一位是10机制转换为13进制， 10-12要用A-C表示， 因此余数字母表示要注意；对应
 * @author lzy
 *
 */
public class P1027 {
	private static final String ZERO="0";
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int r = scanner.nextInt();
		int g = scanner.nextInt();
		int b = scanner.nextInt();
		convertRGB(r, g, b);
	}
	public static void convertRGB(int r, int g, int b){
		String r13 = decimalConvertion(r, 13);
		String g13 = decimalConvertion(g, 13);
		String b13 = decimalConvertion(b, 13);
		System.out.printf("#%s%s%s", r13.length()==1?ZERO+r13:r13, g13.length()==1?ZERO+g13:g13, b13.length()==1?ZERO+b13:b13);
	}
	public static String decimalConvertion(int decimal, int hex){
		String result = "";
		if (decimal == 0) {
			return "0";
		}
		while (decimal != 0) {
			int remainder = decimal%hex;
			String remain = "";
			switch (remainder) {
			case 1 : case 2: case 3: case 4: case 5:
			case 6: case 7: case 8: case 9: case 0:
				remain = String.format("%02d", remainder);
				break;
			case 10:
				remain ="A";
				break;
			case 11:
				remain = "B";
				break;
			case 12:
				remain = "C";
				break;
			default:
				break;
			}
			result = remain+result;
			decimal = decimal/hex;
		}
		return result;
	}

}
