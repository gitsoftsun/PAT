package LanguageBasicDesign;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * IO-02. 整数四则运算(10)
 时间限制
 400 ms
 内存限制
 32000 kB
 代码长度限制
 8000 B
 判题程序
 Standard
 作者
 乔林（清华大学）
 本题要求编写程序，计算2个正整数的和、差、积、商并输出。题目保证输入和输出全部在整型范围内。

 输入格式：

 输入在一行中给出2个正整数A和B。

 输出格式：

 在4行中按照格式“A 运算符 B = 结果”顺序输出和、差、积、商。

 输入样例：
 3 2
 输出样例：
 3 + 2 = 5
 3 - 2 = 1
 3 * 2 = 6
 3 / 2 = 1
 * Created by lzy on 2014/11/4.
 */
public class IO_02 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        try {
            str = bufferedReader.readLine();
        }catch (Exception e){
            e.printStackTrace();
        }
        String[] strings = str.split(" ");
        int x = Integer.valueOf(strings[0]);
        int y = Integer.valueOf(strings[1]);
        System.out.println(x+" + "+y+" = "+add(x,y));
        System.out.println(x+" - "+y+" = "+sub(x,y));
        System.out.println(x+" * "+y+" = "+muilt(x,y));
        System.out.println(x+" / "+y+" = "+division(x,y));

    }
    public static int add(int x, int y){
        return x+y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int muilt(int x , int y){
        return x*y;
    }
    public static int division(int x, int y){
        if (y == 0){
            return 0;
        }
        return x/y;
    }
}
