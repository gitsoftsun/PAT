package LanguageBasicDesign;

import java.util.Scanner;

/**
 * Created by lzy on 2014/11/15.
 */
public class Branch_04 {
    public static float taxiCost(float kilometers, int times){
        float result = 10;
        float temp = kilometers - 3;
        if (temp > 0){
            result += temp*2;
            temp = temp - 7;
            if (temp > 0){
                result = result + temp;
            }
        }
        result = result + (times/5)*2;
        return  result;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float kilemeters = scanner.nextFloat();
        int times = scanner.nextInt();
        System.out.print((int)Math.rint(taxiCost(kilemeters, times)));

    }
}
