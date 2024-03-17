package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("수익을 입력해 주세요. \n금익: ");
		double cost = sc.nextDouble();
		double tax; // 소득세
		
        // 음수 값 입력 시 오류 메시지 출력 조건 추가
        if (cost < 0) {
            System.out.println("잘못 입력했습니다.");
        } else if (cost <= 1000) {
            tax = 0.09 * cost;
            System.out.println("소득세는 "+tax+" 입니다.");
        } else if (cost <= 4000) {
            tax = 1000 * 0.09 + 0.18 * (cost-1000);
            System.out.println("소득세는 "+tax+" 입니다.");
        } else if (cost < 8000) {
            tax = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (cost-4000);
            System.out.println("소득세는 "+tax+" 입니다.");
        } else { // cost >= 8000
            tax = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (cost-8000);
            System.out.println("소득세는 "+tax+" 입니다.");
        } 
        sc.close();

	}

}
