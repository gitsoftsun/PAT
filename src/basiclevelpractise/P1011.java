package basiclevelpractise;

import java.util.Scanner;

public class P1011 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        long[][] inputs = new long[rows][3];
        for (int i = 0; i < inputs.length; i++) {
            for (int j = 0; j < inputs[0].length; j++) {
                inputs[i][j] = scanner.nextLong();
            }
        }
        printSum(inputs);
    }
    public static void printSum(long[][] ins){
        for (int i = 0; i < ins.length; i++) {
            if (ins[i][0] > 0 && ins[i][1] > 0 && ins[i][0] > Integer.MAX_VALUE - ins[i][1]){
                System.out.printf("Case #%d: %s\n",i, true);
            }
            if (ins[i][0] < 0 && ins[i][1] < 0 && ins[i][0] < Integer.MIN_VALUE - ins[i][1]){
                System.out.printf("Case #%d: %s\n",i, false);
            }
            if (ins[i][0] + ins[i][1] > ins[i][2]){
                System.out.printf("Case #%d: %s\n",i, true);
            }else {
                System.out.printf("Case #%d: %s\n",i, false);
            }
        }
    }

}
