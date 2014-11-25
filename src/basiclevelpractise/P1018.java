package basiclevelpractise;

import java.util.Scanner;

enum Game{
	C(0), J(1), B(2); 
	Game(int v){
		this.val = v;
	}
	private final int val;
	public int getValue(){
		return val;
	}
}
/**
 * 结果： 运行超时
 * 题目： http://www.patest.cn/contests/pat-b-practise/1018
 * 
 * @author lzy
 *
 */
public class P1018 {
	public static void process(String[][] strings){
		for (int i = 0; i < strings.length; i++) {
			if (strings[i][0].equals("C")) {
				if(strings[i][1].equals("J")){
					strings[i][2] = "1";
				}else if(strings[i][1].equals("C")){
					strings[i][2] = "0";
				}else{
					strings[i][2] = "-1";
				}
			}else if (strings[i][0].equals("J")) {
				if(strings[i][1].equals("J")){
					strings[i][2] = "0";
				}else if(strings[i][1].equals("C")){
					strings[i][2] = "-1";
				}else{
					strings[i][2] = "1";
				}
			}else{
				if(strings[i][1].equals("J")){
					strings[i][2] = "-1";
				}else if(strings[i][1].equals("C")){
					strings[i][2] = "1";
				}else{
					strings[i][2] = "0";
				}
			}
		}
	}
	public static void printWinFlatLose(String[][] strings){
		int wins =0, flat=0, loses=0;
		int[] w= new int[3];
		int[] l = new int[3];
		for (int i = 0; i < strings.length; i++) {
			if (strings[i][2].equals("1")) {
				wins++;
				if (strings[i][0].equals("C")) {
					w[0]++;
				}else if (strings[i][0].equals("J")) {
					w[1]++;
				}else{
					w[2]++;
				}
			}else if(strings[i][2].equals("0")){
				flat++;
			}else{
				loses++;
				if (strings[i][1].equals("C")) {
					l[0]++;
				}else if (strings[i][1].equals("J")) {
					l[1]++;
				}else{
					l[2]++;
				}
			}
		}
		System.out.printf("%d %d %d\n", wins,flat, loses);
		System.out.printf("%d %d %d\n", loses,flat, wins);
		System.out.printf("%s %s", Game.values()[maxValue(w)], Game.values()[maxValue(l)]);
		
	}
	public static int maxValue(int[] a){
		int maxIdx = 0;
		if (a[maxIdx] < a[1]) {
			maxIdx = 1;
		}else if(a[maxIdx] == a[1]){
			if(a[maxIdx] > a[2]){
				maxIdx = 0;
			}
		}
		if (a[maxIdx] < a[2]) {
			maxIdx = 2;
		}else if(a[maxIdx] == a[2]){
			if (maxIdx == 0) {
				maxIdx = 2;
			}else{
				maxIdx = 2;
			}
		}
		return maxIdx;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int rows = scanner.nextInt();
		String[][] inputs = new String[rows][3];
		for (int i = 0; i < inputs.length; i++) {
			for (int j = 0; j < 2; j++) {
				inputs[i][j] = scanner.next();
			}
		}
		process(inputs);
		printWinFlatLose(inputs);
		
	}
}
