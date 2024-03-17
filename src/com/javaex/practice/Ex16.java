package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요.\n숫자: ");
		double x = sc.nextDouble();
		double result;
		
		if (x<=0) {
			result = x * x * x - 9 * x + 2;
		}else {
			result = 7 * x + 2;
		}
		
		System.out.println("계산 결과는 "+result+" 입니다.");
		sc.close();

	}

}
