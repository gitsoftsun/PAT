package basiclevelpractise;

import java.util.Scanner;

/**
 *
 * 读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

 输入格式：每个测试输入包含1个测试用例，格式为

 第1行：正整数n
 第2行：第1个学生的姓名 学号 成绩
 第3行：第2个学生的姓名 学号 成绩
 ... ... ...
 第n+1行：第n个学生的姓名 学号 成绩
 其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
 输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。
 * 输入样例：
 3
 Joe Math990112 89
 Mike CS991301 100
 Mary EE990830 95
 输出样例：
     Mike CS991301
     Joe Math990112
 * Created by lzy on 2014/11/14.
 */
public class P1004 {
    public static void main(String[] args) {
        String[][] results;
        Scanner scanner = new Scanner(System.in, "utf-8");
        int lines = scanner.nextInt();
        results = new String[lines][3];
        for (int i =0; i < lines; i++){
            for (int j = 0; j < 3; j++){
                results[i][j] = scanner.next();
            }
        }
        int maxIdx = getMaxIdx(results);
        int minIdx = getMinIdx(results);
        System.out.printf("%s %s\n",results[maxIdx][0], results[maxIdx][1]);
        System.out.printf("%s %s", results[minIdx][0], results[minIdx][1]);
    }
    public static int getMaxIdx(String[][] strings){
        int maxIdx = 0;
        for (int i = 0; i < strings.length; i++){
            if (Integer.valueOf(strings[maxIdx][2]) < Integer.valueOf(strings[i][2])){
                maxIdx = i;
            }
        }
        return maxIdx;
    }
    public static int getMinIdx(String[][] strings){
        int minIdx = 0;
        for (int i=0; i < strings.length; i++){
            if (Integer.valueOf(strings[minIdx][2]) > Integer.valueOf(strings[i][2])){
                minIdx = i;
            }
        }
        return minIdx;
    }
}
