package advancedLevelPractise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Result : 一个测试用例: "格式错误"
 * Q:   http://www.patest.cn/contests/pat-a-practise/1002
 * Thinking:
 *  1. 归并排序, 根据前一个元素决定下一个元素是相加, 还是连接
 *
 *
 * Created by lzy on 2014/12/5.
 */
public class P1002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countO = scanner.nextInt();
        float[] polynomial1 = new float[2*countO];
        for (int i = 0; i < polynomial1.length; i++) {
            polynomial1[i] = scanner.nextFloat();
        }
        int countT = scanner.nextInt();
        float[] polynomial2 = new float[2*countT];
        for (int i = 0; i < polynomial2.length; i++) {
            polynomial2[i] = scanner.nextFloat();
        }
//        Test input
//        System.out.println(Arrays.toString(polynomial1));
//        System.out.println(Arrays.toString(polynomial2));
        addPoly(polynomial1, polynomial2);
    }
    public static void addPoly(float[] a, float[] b){
        List<Float> result = new ArrayList<Float>();
        int i =0, j =0;
        while (i < a.length && j < b.length){
            if (a[i] > b[j]){
                result.add(Float.valueOf(a[i]));
                result.add(a[++i]);
                i++;
            }else if (a[i] == b[j]){
                result.add(Float.valueOf(a[i]));
                float tempRes = a[++i] + b[++j];
                result.add(tempRes);
                i++;
                j++;
            }else {
                result.add(Float.valueOf(b[j]));
                result.add(b[++j]);
                j++;
            }
        }
        while (i < a.length){
            result.add(Float.valueOf(a[i]));
            result.add(a[++i]);
            i++;
        }
        while (j < b.length){
            result.add(Float.valueOf(b[j]));
            result.add(b[++j]);
            j++;
        }
        output(result);
    }
    public static void output(List<Float> res){
        StringBuilder stringBuilder = new StringBuilder();
        int count =0;
        for (int i = 0, j =1; i < res.size()&& j < res.size(); i+=2, j+=2) {
            if (!res.get(j).equals(0.0f)){
                count++;
                stringBuilder.append(res.get(i).intValue()).append(" ").append(String.format("%.1f",res.get(j)));
//            stringBuilder.append(res.get(i).intValue()).append(" ").append(String.format("%.1f", Math.rint(res.get(j))));
//                if (j != res.size()-1 && j < res.size()){
                    stringBuilder.append(" ");
//                }
            }
        }
        System.out.printf("%d %s", count, stringBuilder.toString().trim());
    }
}
