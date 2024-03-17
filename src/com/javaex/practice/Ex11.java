package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        
        System.out.print("첫 번째 숫자: ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 숫자: ");
        int num2 = sc.nextInt();
        
        // 큰 수와 작은 수 판별
        int bigger = num1 > num2 ? num1 : num2;
        int smaller = num1 < num2 ? num1 : num2;
        
        // 계산
        int quotient = bigger / smaller;
        int remainder = bigger % smaller;
        
        // 출력
        System.out.println("몫: " + quotient);
        System.out.println("나머지: " + remainder);
        sc.close();
	}

}
