package LanguageBasicDesign;

import java.util.Scanner;

/**
 * Q: http://www.patest.cn/contests/basic-programming/%E7%BB%93%E6%9E%84-01
 * 有理数比较, 最好先化简,这样比较好比较
 * Created by lzy on 2014/11/29.
 */
public class Structure_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String[] as = a.split("/");
        String[] bs = b.split("/");
        long[] al = simplication(as);
        long[] bl = simplication(bs);
        if (al[0] == bl[0] && al[1]==bl[1]){
            System.out.printf("%s = %s", a, b);
        }else{
            if (al[0]*bl[1] > bl[0]*al[1]){
                System.out.printf("%s > %s", a, b);
            }else{
                System.out.printf("%s < %s", a, b);
            }
        }
    }
    public static long[] simplication(String[] ins){
        long[] result = new long[2];
        long fz = Long.valueOf(ins[0]);
        long fm = Long.valueOf(ins[1]);
        long commonDividor = commonDividor(fz, fm);
        result[0] = fz/commonDividor;
        result[1] = fm/commonDividor;
        return result;
    }

    /**
     * 辗转相除求最大公约数
     * @param x
     * @param y
     * @return
     */
    public static long commonDividor(long x, long y){
        if (x < y){
            return commonDividor(y, x);
        }
        if (y != 0){
            return commonDividor(y, x%y);
        }
        return x;
    }
}
