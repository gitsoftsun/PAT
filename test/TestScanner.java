import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by lzy on 2014/11/4.
 */
public class TestScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] ints = new int[4];
        int i =0;
        while (i < ints.length){
            ints[i++] = scanner.nextInt();
        }
        scanner.close();
        System.out.println(Arrays.toString(ints));
    }
}
