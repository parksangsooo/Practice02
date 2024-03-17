package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("출력되는 내용을 입력하세요.\n기호: ");
		String operator = sc.next();
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		
		System.out.print("숫자1: ");
		double num2 = sc.nextDouble();
		
		//계산식 switch 연산자로 case 구분
		switch (operator) {
		case "+" :
			System.out.println("결과는: " + (num1 + num2));
			break;
		case "-" :
			System.out.println("결과는: " + (num1 - num2));
			break;
		case "*" :
			System.out.println("결과는: " + (num1 * num2));
			break;
		case "/" :// 나눗셈의 경우 0이면 "계산할 수 없습니다." 출력
			if (num2 ==0) {
				System.out.println("계산할 수 없습니다.");
			}else {
				System.out.println("결과는: " + (num1 / num2));
				}
			break;
			default: // 없는 연산자 입력시 계산할 수 없는 기호입니다.
				System.out.println("계산할 수 없는 기호입니다.");
				break;
		} 
		sc.close();

	}

}
