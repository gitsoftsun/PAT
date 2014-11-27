package advancedLevelPractise;

import java.util.Scanner;

/**
 * Thinking:
 *  如何不超时?
 * Created by lzy on 2014/11/27.
 */
public class P1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            long c = scanner.nextLong();
            if (isTrue(a, b, c)){
                System.out.printf("Case #%d: %s\n",i+1, "true");
            }else {
                System.out.printf("Case #%d: %s\n",i+1, "false");
            }
        }
    }
    public static boolean isTrue(long a, long b, long c){
        if (a > 0 && b > 0 && a > Long.MAX_VALUE-b){
            return true;
        }
        if (a < 0 && b <0 && a < Long.MIN_VALUE-b){
            return false;
        }
        if (a+b > c){
            return true;
        }else {
            return false;
        }
    }
}
