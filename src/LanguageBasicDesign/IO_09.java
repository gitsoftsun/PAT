package LanguageBasicDesign;

import java.util.Scanner;

/**
 * 给定一个华氏温度F，本题要求编写程序，计算对应的摄氏温度C。计算公式：C = 5*(F-32)/9。题目保证输入与输出均在整型范围内。

 输入格式：

 输入在一行中给出一个华氏温度。

 输出格式：

 在一行中按照格式“Celsius = C”输出对应的摄氏温度C的整数值。

 输入样例：
 150
 输出样例：
 Celsius = 65
 * Created by lzy on 2014/11/15.
 */
public class IO_09 {
    public static int f2C(int f){
        int result = 0;
        result = 5*(f-32)/9;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int f = scanner.nextInt();
        System.out.printf("Celsius = %d", f2C(f));
    }
}
