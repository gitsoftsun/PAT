package LanguageBasicDesign;

/**
 * 本题要求编写程序，输出指定的由“*”组成的倒三角图案。

 输入格式：

 本题目没有输入。

 输出格式：

 按照下列格式输出由“*”组成的倒三角图案。

 * * * *
  * * *
   * *
    *
 * Created by lzy on 2014/11/15.
 */
public class IO_08 {
    public static void outTriangle(){
        for (int i =0; i < 4; i++){
            // out space character
            for (int j = i; j > 0; j--){
                System.out.printf(" ");
            }
            for (int z = 4-i; z > 0; z--){
                System.out.printf("%s","*");
                if (z != 1){
                    System.out.printf("%s"," ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        outTriangle();
    }
}
