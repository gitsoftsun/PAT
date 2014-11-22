/**
 * Created by lzy on 2014/11/13.
 */
public class testIntegerMax {
    public static void main(String[] args) {
//        long sum = (long)Integer.MAX_VALUE+1;
//        System.out.println(sum);
        double c = (double)10 / 3;
        double d = Double.valueOf(String.format("%.2f", c));
        System.out.println(c+" , d = "+d);
        short i = 99;
        char ch = (char)i;
        byte b = (byte)i;
        System.out.printf("");
        double d1 = 29.333;
        System.out.printf("d1 %.0f%%\n",d1);
        System.out.printf("d1 保留一位小数: %.1f\n",d1);
        System.out.printf("d1 : %.2f", d1);
    }
}
