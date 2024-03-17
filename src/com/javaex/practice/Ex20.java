package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("알파벳 1글자(소문자)를 입력하세요.\n알파벳: ");
        char alphabet = scanner.next().charAt(0); // 입력받은 문자열의 첫 번째 문자
        
        // 영문 소문자인지 확인
        if (alphabet < 'a' || alphabet > 'z') {
            System.out.println("영문 소문자만 입력 가능합니다.");
        } else {
            // 모음인지 자음인지 판별
            if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || 
                alphabet == 'o' || alphabet == 'u') {
                System.out.println("모음입니다.");
            } else {
                System.out.println("자음입니다.");
            }
        }
        
        scanner.close();

	}

}
