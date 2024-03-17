package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("첫 번째 숫자: ");
	        int num1 = scanner.nextInt();
	        System.out.print("두 번째 숫자: ");
	        int num2 = scanner.nextInt();
	            
	        // 더 큰 수와 더 작은 수 판별
	        int bigger, smaller;
	        bigger = num1 > num2 ? num1 : num2;
	        smaller = num1 < num2 ? num1 : num2;
	        
	        // 작은 수가 큰 수의 약수인지 확인
	        if (bigger % smaller == 0) {
	            System.out.println(smaller + "은(는) " + bigger + "의 약수입니다.");
	        } else {
	            System.out.println(smaller + "은(는) " + bigger + "의 약수가 아닙니다.");
	        }
	        
	        scanner.close();

	}

}
