package basiclevelpractise;

import java.util.Scanner;

/**
 * 题目： 
 * 	http://www.patest.cn/contests/pat-b-practise/1029
 * @author lzy
 *
 */

public class P1029 {
	public static void brokenKey(String a, String b){
		String result ="";
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		for (int i = 0; i < ac.length; i++) {
			boolean hasCon = false;
			for (int j = 0; j < bc.length; j++) {
				if (ac[i] == bc[j]) {
					hasCon = true;
				}
			}
			if (!hasCon) {
				String temp = (ac[i]+"").toUpperCase();
				if(!result.contains(temp)){
					result+=temp;
				}
			}
		}
		System.out.printf("%s", result);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		String preInputs = scanner.next();
		String realInputs = scanner.next();
		brokenKey(preInputs, realInputs);
	}

}
