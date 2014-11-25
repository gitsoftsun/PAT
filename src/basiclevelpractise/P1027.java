package basiclevelpractise;

import java.util.Scanner;


public class P1027 {
	public static int calc(int in){
		int result =0;
		result = (int) Math.floor(Math.sqrt((in+1)/2));
		return result;
	}
	public static void output(int n, String icon){
		for (int i = n; i >0; i--) {
			//output space
			for (int j = 0; j < n-i; j++) {
				System.out.printf("%s"," ");
			}
			//output icon
			for (int j = 2*i-1; j >0; j--) {
				System.out.printf("%s", icon);
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			//output space
			for (int j = 0; j < n-i; j++) {
				System.out.printf("%s", " ");
				
			}
			//output icon
			for (int j = 2*i-1; j > 0; j--) {
				System.out.printf("%s", icon);
			}
			System.out.println();
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		String icon = scanner.next();
		int n = calc(input);
		output(n, icon);
		System.out.printf("%s", (int)(input+1-2*Math.pow(n, 2))==0?"":(int)(input+1-2*Math.pow(n, 2)));
	}

}
