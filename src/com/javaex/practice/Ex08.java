package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double cm, kg, BMI;
				
		System.out.println("키와 몸무게를 입력해 주십시오.");
		System.out.print("키: ");
		cm = sc.nextDouble();
		System.out.print("몸무게: ");
		kg = sc.nextDouble();
		
		BMI = kg / (cm * cm) * 10000;
		
		if (BMI <= 18.5) {
			System.out.println("저체중입니다.\nBMI:"+BMI);
		}else if (BMI < 24.9) {
			System.out.println("정상체중입니다.\nBMI:"+BMI);
		}else {
			System.out.println("과체중입니다.\nBMI:"+BMI);
		}
		sc.close();
	}

}
