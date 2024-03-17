package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 15;
		
		//age가 0살 초과이고 18살 미만 이면
		if(age > 0 && age <18 ) { // 0 < age < 18와 같은 표현은 Java에서 유효하지 않습니다. 
								// 대신, 두 개의 조건을 && (논리 AND 연산자)로 연결해야 합니다.
			System.out.println("청소년 입니다.");
		}

	}

}
