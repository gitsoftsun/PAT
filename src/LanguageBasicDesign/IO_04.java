package LanguageBasicDesign;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * 测试用例：
 * 2.12 88 c 4.7（input）
 * c 88 2.12 4.70(output)
 * Created by lzy on 2014/11/13.
 */
public class IO_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float f1 = scanner.nextFloat();
        int i1 = scanner.nextInt();
        String c1 = scanner.next();
        char c = c1.toCharArray()[0];
        float f2 = scanner.nextFloat();
//        System.out.printf("%c %d %.2f %.2f", c, i1, f1, f2);   //pat这种写法通不过想不通为什么
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        System.out.printf("%c %d %s %s",c, i1, decimalFormat.format(f1), decimalFormat.format(f2));
    }
}
