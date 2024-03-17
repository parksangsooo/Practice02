package com.javaex.practice;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        
        // 숫자 3개 입력 받기
        System.out.println("숫자 3개를 입력해 주세요.");
        System.out.print("숫자 1: ");
        int num1 = scanner.nextInt();
        System.out.print("숫자 2: ");
        int num2 = scanner.nextInt();
        System.out.print("숫자 3: ");
        int num3 = scanner.nextInt();
        
        // 가장 큰 수 찾기
        int biggest;
        if (num1 >= num2 && num1 >= num3) {
        	biggest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
        	biggest = num2;
        } else {
        	biggest = num3;
        }
        
        // 가장 작은 수 출력
        System.out.println("가장 큰 수는 " + biggest + " 입니다.");
        
        scanner.close();


	}

}
