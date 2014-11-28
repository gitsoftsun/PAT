package LanguageBasicDesign;

import java.util.Scanner;

/**
 * Q: http://www.patest.cn/contests/basic-programming/%E6%95%B0%E7%BB%84-03
 * 冒泡排序
 * Created by lzy on 2014/11/28.
 */
public class Array_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int count = scanner.nextInt();
        int[] inputs = new int[length];
        for (int i = 0; i < length; i++) {
            inputs[i] = scanner.nextInt();
        }
        bubbleSort(inputs, count);
        for (int i = 0; i < length; i++) {
            System.out.printf("%d", inputs[i]);
            if (i != length-1){
                System.out.printf("%s", " ");
            }
        }
    }
    public static void bubbleSort(int[] ins, int count){
        for (int i = ins.length-1; i > ins.length-1-count; i--) {
            boolean isChange = false;
            for (int j = 1; j <= i; j++) {
                if (ins[j] < ins[j-1]){
                    isChange = true;
                    int temp = ins[j];
                    ins[j] = ins[j-1];
                    ins[j-1] = temp;
                }
            }
            if (!isChange){
                return;
            }
        }
    }
}
