package advancedLevelPractise;

import java.util.Scanner;

/**
 * Q: http://www.patest.cn/contests/pat-a-practise/1011
 * thinking ： 
 * 	1. 求出每行最大值的下标， 并计算出对应的W/T/L
 * 	2. 根据公式计算结果
 * 	3. 格式化输出
 * @author lzy
 *
 */
public class P1011 {
	private static final String[] WTL = new String[]{"W","T","L"};
	public static void process(float[][] f){
		String res = "";
		float result =1;
		for (int i = 0; i < f.length; i++) {
			int maxIdx =0;
			for (int j = 0; j < f[i].length; j++) {
				if (f[i][j] > f[i][maxIdx]) {
					maxIdx = j;
				}
			}
			result = result*f[i][maxIdx];
			res = res + String.format("%s ", WTL[maxIdx%3]);
		}
		System.out.printf("%s%.2f",res, (result*0.65-1)*2);
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float[][] inputs = new float[3][3];
		for (int i = 0; i < inputs.length; i++) {
			for (int j = 0; j < inputs[0].length; j++) {
				inputs[i][j] = scanner.nextFloat();
			}
		}
		process(inputs);
	}

}
