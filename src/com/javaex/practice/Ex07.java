package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age; // 나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이 입력받기
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//그룹분류
		if(age < 8) { //0~7세
			System.out.print("취학전아동/무료 입니다.");
		}else if(age < 14) { // 8~13세
			System.out.print("초등학생/2000원 입니다.");
		}else if(age < 17) { // 14~16세
			System.out.print("중학생/3000원 입니다.");
		}else if(age < 20) { // 17~19세
			System.out.print("고등학생/4000원 입니다.");
		}else { // 20세 ~
			System.out.print("성인/5000원 입니다.");
		}
		
		sc.close();

	}

}
