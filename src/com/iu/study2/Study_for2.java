package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study_for2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
//		// 구구단 실행
//		for(int dan=2; dan<10; dan++) {
//			for(int i= 1; i<10; i++) {
//				System.out.println(dan+"*"+i+"="+dan*i);
//			}
//		}
		
//		// 시계 실행
//		for(int min=0; min<6; min++) {
//			for(int sec=0; sec<60; sec++) {
//				System.out.println(min + ":" + sec);
//			}
//		}
		
		// 전자레인지 개념
		// 종료할 분, 초를 입력받아서 해당 분초가 되면 종료한다.

		System.out.println("차례대로 원하는 분과 초를 입력하세요");
		int m = sc.nextInt();
		int s = sc.nextInt();
		
		for(int min=0; min<6; min++) {
			for(int sec=0; sec<60; sec++) {
				System.out.println(min + ":" + sec);
				if(m == min && s == sec) {
					min=6;
					break;
				}				
			}
		}
		
		
//		for(int i = 0; i<5; i++) {
//			// 0 ~ 3 미만의 정수 한개를 랜덤출력 (0 1 2) 
//			int num = random.nextInt(3);
//			
//			switch(num) {
//			case 0: 
//				System.out.println(num);
//				break;
//			case 1: 
//				System.out.println(num);
//			default: 
//				System.out.println(num);
//			}
//		}
		System.out.println("프로그램 종료");
		

	}

}
