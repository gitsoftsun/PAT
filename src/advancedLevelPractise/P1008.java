package advancedLevelPractise;

import java.util.Scanner;
/**
 * 题目： http://www.patest.cn/contests/pat-a-practise/1008
 * 
 * @author lzy
 *
 */

public class P1008 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int lens = scanner.nextInt();
		int[] inputs = new int[lens];
		for (int i = 0; i < inputs.length; i++) {
			inputs[i] = scanner.nextInt();
		}
		System.out.printf("%s", timeCose(inputs));
	}
	public static int timeCose(int[] ins){
		int total =0;
		int nowFloor =0;
		for (int i = 0; i < ins.length; i++) {
			if (ins[i] > nowFloor) {
				total += 6*(ins[i]-nowFloor);
				nowFloor = ins[i];
			}else{
				total+=4*(nowFloor-ins[i]);
				nowFloor = ins[i];
			}
		}
		total += 5*ins.length;
		return total;
	}

}
