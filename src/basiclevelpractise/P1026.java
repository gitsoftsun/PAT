package basiclevelpractise;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
//notified :　注意时间的输出格式
/**要获得一个C语言程序的运行时间，常用的方法是调用头文件time.h，其中提供了clock()函数，可以捕捉从程序开始运行到clock()被调用时所耗费的时间。这个时间单位是clock tick，即“时钟打点”。同时还有一个常数CLK_TCK，给出了机器时钟每秒所走的时钟打点数。于是为了获得一个函数f的运行时间，我们只要在调用f之前先调用clock()，获得一个时钟打点数C1；在f执行完成后再调用clock()，获得另一个时钟打点数C2；两次获得的时钟打点数之差(C2-C1)就是f运行所消耗的时钟打点数，再除以常数CLK_TCK，就得到了以秒为单位的运行时间。
	
	这里不妨简单假设常数CLK_TCK为100。现给定被测函数前后两次获得的时钟打点数，请你给出被测函数运行的时间。
	
	输入格式：
	
	输入在一行中顺序给出2个整数C1和C1。注意两次获得的时钟打点数肯定不相同，即C1 < C2，并且取值在[0, 107]。
	
	输出格式：
	
	在一行中输出被测函数运行的时间。运行时间必须按照“hh:mm:ss”（即2位的“时:分:秒”）格式输出；不足1秒的时间四舍五入到秒。
	
	输入样例：
	123 4577973
	输出样例：
	12:42:59
 * 
 * @author lzy
 *
 */
public class P1026 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int c1 = scanner.nextInt();
		int c2 = scanner.nextInt();
		float seconds = (c2-c1)/100.0f;
		int hours = (int)seconds/3600;
		float s1 = seconds%3600;
		int mins = (int)(s1/60);
		float s2 = s1%60;
		int sec = (int) Math.round(s2);
		System.out.printf("%02d:%02d:%02d\n", hours, mins, sec);
//		format date type
		Date date = new Date();
		date.setHours(hours);
		date.setMinutes(mins);
		date.setSeconds(sec);
		System.out.print(new SimpleDateFormat("HH:mm:ss").format(date));
	}
}
