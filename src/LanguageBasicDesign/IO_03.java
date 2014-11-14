package LanguageBasicDesign;


import java.util.Scanner;

/**
 * Created by lzy on 2014/11/4.
 */
public class IO_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long[] inputs = new long[4];
        for (int i =0; i < 4; i++){
            inputs[i] = scanner.nextLong();
        }
        long sum =0;
        for (int i =0; i < inputs.length; i++){
            sum+=inputs[i];
        }
        float average = sum/4.0f;
//        使用String.format保留一位小数是需要四舍五入的，
//        System.out.print("Sum = "+sum+"; Average = "+String.format("%.1f", average));

        System.out.print("Sum = "+sum+"; Average = "+average);
    }
}
