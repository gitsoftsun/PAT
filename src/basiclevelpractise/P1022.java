package basiclevelpractise;

import java.util.Scanner;

/**
 * @ref : http://www.patest.cn/contests/pat-b-practise/1022
 * 1022. D进制的A+B (20)
 * 
 * 输入两个非负10进制整数A和B(<=230-1)，输出A+B的D (1 < D <= 10)进制数。
	
	输入格式：
	
	输入在一行中依次给出3个整数A、B和D。
	
	输出格式：
	
	输出A+B的D进制数。
	
	输入样例：
	123 456 8
	输出样例：
	1103

 * @author lzy
 *
 */

public class P1022 {
	public static String converTOX(long in, int hex){
		String result = "";
		if (in == 0) {
			return "0";
		}
		long beiChuShu = in;
		int chuShu = hex;
		while (beiChuShu != 0) {
			result = beiChuShu%chuShu + result;
			beiChuShu = beiChuShu/chuShu;
		}
		return result;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int da = scanner.nextInt();
		int db = scanner.nextInt();
		int hex = scanner.nextInt();
		long total = (long)da+db;
		System.out.printf("%s", converTOX(total, hex));
	}

}
