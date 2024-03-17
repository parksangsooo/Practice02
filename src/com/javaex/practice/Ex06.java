package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age; // 나이
		
		Scanner sc = new Scanner(System.in);
		
		//나이 입력받기
		System.out.println("나이를 입력해 주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		//그룹분류
		if(age>=19 && age < 65) { // 19세 이상 65세 미만이면
			System.out.print("\"1번그룹\"");
		}else { // 그 이외
			System.out.print("\'2번그룹\'");
		}
		System.out.println("입니다.");
		sc.close();

	}

}
