package advancedLevelPractise;

import java.util.Scanner;

/**
 * Q:http://www.patest.cn/contests/pat-a-practise/1042
 * Thinking : 将扑克通过rules 数组的顺序进行洗牌, 题目的意思是: 将下标为rules[0]的牌给放到第一位上来;
 * 做法1:
 *  声明一个放牌的空间, 将结果放置在新的哦你空间内;
 * Created by lzy on 2014/11/27.
 */
public class P1042 {
    private static final String[] COLORS = {"S", "H", "C", "D"};
    private static final int CARD_NUMBER = 54;
    public static String[] shuffling(String[] strings, int[] rules){
        String[] result = new String[54];
        for (int i = 0; i < rules.length; i++) {
            result[rules[i]-1] = strings[i];
        }
        return result;
    }
    public static void shufflingMachine(int count, String[] strings, int[] rules){
        String[] result = strings;
        while (count-- != 0){
            result = shuffling(result, rules);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%s", result[i]);
            if (i != result.length-1){
                System.out.printf("%s", " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int shufflingCount = scanner.nextInt();
        int[] rules = new int[CARD_NUMBER];
        int c =0;
        while(c < CARD_NUMBER){
            rules[c++] = scanner.nextInt();
        }
        String[] inputs = new String[CARD_NUMBER];
        for (int i =0, j =0; i < COLORS.length; i++){
            for (int k = 0; k < 13; k++) {
               inputs[j++] = String.format("%s%d", COLORS[i], k+1);
            }
        }
        inputs[52] = "J1"; inputs[53] = "J2";
        shufflingMachine(shufflingCount, inputs, rules);
    }
}
