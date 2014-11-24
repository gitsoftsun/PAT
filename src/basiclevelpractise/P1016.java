package basiclevelpractise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正整数A的“DA（为1位整数）部分”定义为由A中所有DA组成的新整数PA。例如：给定A = 3862767，DA = 6，则A的“6部分”PA是66，因为A中有2个6。
	
	现给定A、DA、B、DB，请编写程序计算PA + PB。
	
	输入格式：
	
	输入在一行中依次给出A、DA、B、DB，中间以空格分隔，其中0 < A, B < 1010。
	
	输出格式：
	
	在一行中输出PA + PB的值。
	
	输入样例1：
	3862767 6 13530293 3
	输出样例1：
	399
 * @author lzy
 *
 */
public class P1016 {
	public long getPX(long a, int da){
		Matcher matcher = Pattern.compile("\\d{1}").matcher(Long.valueOf(a).toString());
		List<Integer> lists = new ArrayList<Integer>();
		while(matcher.find()){
			lists.add(Integer.valueOf(matcher.group()));
		}
		int count =0;
		for (int i = 0; i < lists.size(); i++) {
			if (lists.get(i).equals(da)) {
				count++;
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(da);
		}
		return sb.toString().equals("")?0:Long.valueOf(sb.toString());
	}
	public long getPAB(long a, int da, long b, int db){
		long pa = getPX(a, da);
		long pb = getPX(b, db);
		return pa+pb;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		long a = scanner.nextLong();
		int da = scanner.nextInt();
		long b = scanner.nextLong();
		int db = scanner.nextInt();
		System.out.printf("%d",new P1016().getPAB(a, da, b, db));
	}
}
