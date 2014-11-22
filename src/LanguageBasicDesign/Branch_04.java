package LanguageBasicDesign;

import java.util.Scanner;

/**
 * notified :  kilometers =0
 *
 * 起步里程为3公里，起步费10元；
 超起步里程后10公里内，每公里2元；
 超过10公里以上的部分加收50%的回空补贴费，即每公里3元；
 营运过程中，因路阻及乘客要求临时停车的，按每5分钟2元计收(不足5分钟则不收费 )。
 输入格式：

 输入在一行中给出输入行驶里程（单位为公里，精确到小数点后1位）与等待时间（整数，单位为分钟），其间以空格分隔。

 输出格式：

 在一行中输出乘客应支付的车费（单位为元），结果四舍五入，保留到元。
 * Created by lzy on 2014/11/15.
 */
public class Branch_04 {
    public static float taxiCost(float kilometers, int times){
        float result = 0;
        if (kilometers >0)
            result += 10;
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
