package com.javaex.practice;

import java.util.Scanner;

public class Ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final int year = 2023;
        System.out.println("태어난 년도를 입력해 주세요");
        System.out.print("년도: ");
        int birth = sc.nextInt();
        
        int age = year - birth;
        
        System.out.println("올해: " + year + "\n태어난 해: " + birth + "\n나이: " + age);
        System.out.println("==========================");
        
        // 나이 계산
        if (age < 20) {
            System.out.println("20세 미만 건강검진대상이 아님.");
        } else {
            // 20세 이상인 경우
            System.out.print("20세 이상\n");
            
            // 짝수해/홀수해에 따른 건강검진 대상 판별
            if (((year % 2 == 0) && (birth % 2 == 0)) || 
                ((year % 2 != 0) && (birth % 2 != 0))) {
                System.out.println("건강검진해");
                
                // 40세 이상 암 검사 가능 여부
                if (age >= 40) {
                    System.out.println("암 검사");
                } else {
                    System.out.println("암 검사X");
                }
            } else {
                System.out.println("건강검진해 아님");
            }
        }
        sc.close();
    }
}
