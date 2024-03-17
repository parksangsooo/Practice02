package com.javaex.practice;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사번(정수)를 입력해 주세요.\n사번: ");
		int employeeNum = sc.nextInt();
		
		 // 사번을 3으로 나눈 나머지에 따라 팀 구분
		if (employeeNum == 0) {
			System.out.println("잘못된 사번입니다.");
		}else{
			switch (employeeNum % 3) {
		case 0:
			System.out.println("A팀 입니다.");
			break;
		case 1:
			System.out.println("B팀 입니다.");
			break;
		case 2:
			System.out.println("C팀 입니다.");
			break;
		default://
			System.out.println("잘못 입력하셨습니다.");
			break;
			}
		}
		sc.close();
		

	}

}
