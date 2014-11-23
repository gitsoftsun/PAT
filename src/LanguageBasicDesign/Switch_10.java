package LanguageBasicDesign;

import java.util.Scanner;
/**
 * 假设个人所得税为：税率 * (工资 - 1600)。请编写程序计算应缴的所得税，其中税率定义为：
	
	当工资不超过1600时，税率为0；
	当工资在区间(1600, 2500]时，税率为5%；
	当工资在区间(2500, 3500]时，税率为10%；
	当工资在区间(3500, 4500]时，税率为15%；
	当工资超过4500时，税率为20%。
	输入格式：
	
	输入在一行中给出非负工资。
	
	输出格式：
	
	在一行输出个人所得税，精确到小数点后2位
 * @author lzy
 *
 */

public class Switch_10 {
	public static float individualIncomeTaxCost(float salary){
		float tax =0.00f;
		if(salary <= 1600){
			tax = 0.00f;
		}else if (salary > 1600 && salary <= 2500){
			tax = 0.05f*(salary-1600);
		}else if(salary > 2500 && salary <= 3500){
			tax = 0.10f*(salary-1600);
		}else if(salary > 3500 && salary <= 4500){
			tax = 0.15f*(salary-1600);
		}else{
			tax = 0.20f*(salary-1600);
		}
		return tax;
	}
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		float salary = scanner.nextFloat();
		System.out.printf("%.2f", individualIncomeTaxCost(salary));
	}
}
