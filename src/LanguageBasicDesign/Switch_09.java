package LanguageBasicDesign;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 按照规定，在高速公路上行使的机动车，超出本车道限速的<10%则处200元罚款；若超出<50%，就要吊销驾驶证。请编写程序根据车速和限速自动判别对该机动车的处理。
 * Created by lzy on 2014/11/22.
 */
public class Switch_09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in, "utf-8");
        int speed = scanner.nextInt();
        int speedLimits = scanner.nextInt();
        double result = (double)(speed-speedLimits)/speedLimits*100.0;
        if (result < 10){
            System.out.printf("%s","OK");
        }else if (result < 50){
            System.out.printf("Exceed %.0f%%. Ticket 200", result);
        }else {
            System.out.printf("Exceed %.0f%%. License Revoked", result);
        }
//        int temp = speed - speedLimits;
//        if (temp <= 0){
//            System.out.printf("%s","OK");
//        }else {
//            BigDecimal bigDecimal = new BigDecimal((double)temp/speedLimits);
//            double res = bigDecimal.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
//            if (res <= 0.10){
//                System.out.printf("%s","OK");
//            }else if (res > 0.10 && res <= 0.50){
//                System.out.printf("Exceed %s%%. Ticket 200", (int)(res*100));
//            }else {
//                System.out.printf("Exceed %s%%. License Revoked", (int)(res*100));
//            }
//        }
    }
}
