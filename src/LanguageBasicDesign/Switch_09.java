package LanguageBasicDesign;


import java.util.Scanner;

/**
 * 为鼓励居民节约用水，自来水公司采取按用水量阶梯式计价的办法，居民应交水费y（元）与月用水量x（吨）相关：当x不超过15吨时，y=4x/3；超过后，y=2.5x-17.5。请编写程序实现水费的计算。

 输入格式：

 输入在一行中给出非负实数x。

 输出格式：

 在一行输出应交的水费，精确到小数点后2位。
 * Created by lzy on 2014/11/23.
 */
public class Switch_09 {
    public static float waterBill(float tons){
        float  f = 0.0f;
        if (tons <= 15){
            f = 4*tons/3;
        }else {
            f = 2.5f*tons-17.5f;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tons = scanner.nextFloat();
        System.out.printf("%.2f", waterBill(tons));
    }
}
