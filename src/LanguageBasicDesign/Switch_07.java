package LanguageBasicDesign;

import java.util.Scanner;

/**
 * 比较大小 - 排序（快速排序）-递归的执行效率太low
 * @author lzy
 * 
 * 分支-07. 比较大小(10)

时间限制
400 ms
内存限制
65536 kB
代码长度限制
8000 B
判题程序
Standard
作者
杨起帆（浙江大学城市学院）
本题要求将输入的任意3个整数从小到大输出。

输入格式：

输入在一行中给出3个整数，其间以空格分隔。

输出格式：

在一行中将3个整数从小到大输出，其间以“->”相连。

输入样例：
4 2 8
输出样例：
2->4->8
 *
 */
public class Switch_07 {
	/**
	 * 一次快排
	 * @param a
	 * @return 确定位置下标
	 */
	public int getMiddle(int[] a, int start, int end){
		int tag = 0;
		while(start < end){
			tag =  a[start];
			while(start < end && a[end] > tag){
				end--;
			}
			if (start < end){
				a[start] = a[end];
			}
			while(start < end && a[start] < tag){
				start++;
			}
			if(start < end){
				a[end] = a[start];
			}
		}
		a[start] = tag;
		return start;
	}
	public void quickSort(int[] a, int s, int e){
		if(s < e){
			int m = getMiddle(a, s, e);
			quickSort(a, s, m-1);
			quickSort(a, m+1, e);
		}
	}
	public static void sort(int a, int b, int c){
		if(a > b){
			if(c>=a){
				System.out.printf("%d->%d->%d",b,a,c);
			}else{
				if(b >= c){
					System.out.printf("%d->%d->%d",c,b,a);
				}else{
					System.out.printf("%d->%d->%d", b,c,a);
				}
			}
		}else if(a == b){
			if(c > a){
				System.out.printf("%d->%d->%d", b,a,c);
			}else{
				System.out.printf("%d->%d->%d", c,b,a);
			}
		}else{
			if(b<=c){
				System.out.printf("%d->%d->%d", a,b,c);
			}else{
				if(a >= c){
					System.out.printf("%d->%d->%d", c,a,b);
				}else{
					System.out.printf("%d->%d->%d", a,c,b );
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int[] a = new int[3];
		int i =0;
		while(i < a.length){
			a[i++] = scanner.nextInt();
		}
		sort(a[0],a[1],a[2]);
	}

}
