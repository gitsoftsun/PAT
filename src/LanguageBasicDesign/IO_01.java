package LanguageBasicDesign;


/**
 * IO-01. 表格输出(5)
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
 本题要求编写程序，按照规定格式输出表格。

 输入格式：

 本题目没有输入。

 输出格式：

 要求严格按照给出的格式输出下列表格：

 ------------------------------------
 Province      Area(km2)   Pop.(10K)
 ------------------------------------
 Anhui         139600.00   6461.00
 Beijing        16410.54   1180.70
 Chongqing      82400.00   3144.23
 Shanghai        6340.50   1360.26
 Zhejiang      101800.00   4894.00
 ------------------------------------
 * Created by lzy on 2014/11/3.
 */
public class IO_01 {
    public static void main(String[] args) {
        System.out.println("------------------------------------");
        System.out.println(String.format("%-9s","Province")+"     "+String.format("%9s", "Area(km2)")+"   "
                +String.format("%-8s", "Pop.(10K)"));
        System.out.println("------------------------------------");
        System.out.printf("%-9s","Anhui");
        System.out.printf("     ");
        System.out.printf("%9s", "139600.00");
        System.out.printf("   ");
        System.out.printf("%7s","6461.00");
        System.out.println();
        //Beijing        16410.54   1180.70
//         Chongqing      82400.00   3144.23
//        Shanghai        6340.50   1360.26
//        Zhejiang      101800.00   4894.00
        System.out.println(String.format("%-9s", "Beijing")+"     "+String.format("%9s", "16410.54")+"   "+String.format("%7s", "1180.70"));
        System.out.println(String.format("%-9s", "Chongqing")+"     "+String.format("%9s", "82400.00")+"   "+String.format("%7s", "3144.23"));
        System.out.println(String.format("%-9s", "Shanghai")+"     "+String.format("%9s", "6340.50")+"   "+String.format("%7s", "1360.26"));
        System.out.println(String.format("%-9s", "Zhejiang")+"     "+String.format("%9s", "101800.00")+"   "+String.format("%7s", "4894.00"));
        System.out.println("------------------------------------");
    }
}
