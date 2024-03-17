package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("알파벳 1글자(소문자)를 입력하세요.\n알파벳: ");
        char alphabet = sc.next().charAt(0); // 입력받은 문자열의 첫 번째 문자

        // 알파벳이 영문 소문자인지 확인
        if (alphabet >= 'a' && alphabet <= 'z') {
            switch (alphabet) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u': // 모음인 경우
                    System.out.println("모음입니다.");
                    break;
                default: // 자음인 경우
                    System.out.println("자음입니다.");
                    break;
            }
        } else {
            System.out.println("영문 소문자만 입력 가능합니다.");
        }
        
        sc.close();

	}

}
