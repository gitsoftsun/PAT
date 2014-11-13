package LanguageBasicDesign;

import java.util.Scanner;

/**
 * Created by lzy on 2014/11/4.
 */
public class IO_03 {
    public static int sum(int[] a){
        int sum = 0;
        for (int i =0; i < a.length; i++){
            sum+=a[i];
        }
        return sum;
    }
    public static double average(int sum, int length){
        return sum/length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[4];
        int i = 0;
        while ( i < ints.length){
            ints[i++] = scanner.nextInt();
        }
        int sum = sum(ints);
        System.out.println("Sum = "+sum+"; Average = "+average(sum, ints.length));
    }
}
