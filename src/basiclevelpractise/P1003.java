package basiclevelpractise;

import java.util.Scanner;

/**
 * Created by lzy on 2014/11/15.
 */
public class P1003 {
    public static String[] input(){
        String[] result;
        Scanner scanner = new Scanner(System.in, "utf-8");
        int lines = scanner.nextInt();
        result = new String[lines];
        for (int i =0; i < lines; i++){
            result[i] = scanner.next();
        }
        return result;
    }
    public static boolean hasPAT(String str){
        boolean hasPp = false, hasAa = false, hasTt = false, hasPAT = false;
        char[] chars = str.toCharArray();
        for (int i =0; i < chars.length; i++){
            if (chars[i] == 'P' ){
                hasPp = true;
            }else if(chars[i] == 'A' ){
                hasAa = true;
            }else if (chars[i] == 'T'){
                hasTt = true;
            }else {
                return hasPAT;
            }
        }
        hasPAT = hasPp && hasAa && hasTt;
        if (hasPAT){
            if (str.contains("PAT")){
                hasPAT = true;
            }else if (str.contains("PAAT")){
                hasPAT = true;
            }else {
                hasPAT = false;
            }
        }
        return hasPAT;
    }
    public static boolean isRight(String str){
       boolean result = false;
        boolean hasP = false, hasA = false, hasT = false;
        int counta = 0, countb =0, countc =0;
        char[] c = str.toCharArray();
        for (int i =0; i < c.length; i++){
            if (c[i] == 'A'){
                if (!hasP){
                    counta++;
                }else if (!hasT){
                    countb ++;
                }else {
                    countc++;
                }
            }else if (c[i] == 'P'){
                hasP = true;
            }else if (c[i] == 'T'){
                hasT = true;
            }else {
                return result;
            }
        }
//        if (counta * countb == countc){
//            result = true;
//        }
//        countc / counta == countb
        if (countb == 0){
            result = false;
        }else{
            if (counta == 0 && countc==0){
                result = true;
            }else if (counta == 0 && countc != 0){
                result = false;
            }else if (counta != 0 && countc == 0){
                result = false;
            }else {
                if (countc%counta == 0 & countc/counta == countb){
                    result = true;
                }else{
                    result = false;
                }

            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] inputs = input();
        for (String string : inputs){
            System.out.println(isRight(string)?"YES":"NO");
        }
    }
}
