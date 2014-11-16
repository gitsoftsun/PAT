package basiclevelpractise;

import java.util.Scanner;

/**
 * 1006. 换个格式输出整数 (15)
 时间限制
 400 ms
 内存限制
 32000 kB
 代码长度限制
 8000 B
 判题程序
 Standard
 作者
 CHEN, Yue
 让我们用字母B来表示“百”、字母S表示“十”，用“12...n”来表示个位数字n（<10），换个格式来输出任一个不超过3位的正整数。例如234应该被输出为BBSSS1234，因为它有2个“百”、3个“十”、以及个位的4。

 输入格式：每个测试输入包含1个测试用例，给出正整数n（<1000）。

 输出格式：每个测试用例的输出占一行，用规定的格式输出n。

 输入样例1：
 234
 输出样例1：
 BBSSS1234
 输入样例2：
 23
 输出样例2：
 SS123

 * Created by lzy on 2014/11/16.
 */
public class P1006 {
    public static void formatOutput(int input){
        int countB = input / 100;
        input = input%100;
        int countS = input / 10;
        int countU = input % 10;
        for (int i = countB; i > 0; i--){
            System.out.printf("%s","B");
        }
        for (int j = countS; j > 0; j--){
            System.out.printf("%s","S");
        }
        for (int k =0; k < countU; k++){
            System.out.printf("%d",k+1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        formatOutput(input);
    }
}
