package jisuanke;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 泥塑课
 * Created by lzy on 2014/11/6.
 */
public class E_06 {
    private static String[] result;
    public static void input(){
        Scanner scanner = new Scanner(System.in);
        while ( true){
            int rowNum = scanner.nextInt();
            if (rowNum == -1)
                return;
            result = new String[rowNum];
            for (int i =0; i < result.length; i++){
                result[i] = scanner.nextLine();
            }
        }
    }

    public static void main(String[] args) {
//        input();
        Scanner scanner = new Scanner("3\n1 2 3 r\n2 3 4 e\n4 3 1 d\n-1");
        while ( true){
            int rowNum = scanner.nextInt();
            if (rowNum == -1)
                break;
            result = new String[rowNum];
            for (int i =0; scanner.hasNextLine() &&i < result.length; i++){
//                if (scanner.nextLine()=="")
//                    continue;
                result[i] = scanner.nextLine();
            }
        }
        for (String str : result){
            System.out.println(str);
        }
    }
}
