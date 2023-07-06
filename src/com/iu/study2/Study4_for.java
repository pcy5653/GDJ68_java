package com.iu.study2;

import java.util.Scanner;

public class Study4_for {

	public static void main(String[] args) {
		
//		for(int i = 0; i<5; i++) {
//			System.out.println("Hello");
//		}
		 
		// for문 쉬운 예제
		// 키보드로부터 출력횟수를 입력받아 hello를 출력하라
		Scanner sc = new Scanner(System.in);
		
		System.out.println("횟수를 입력하세요.");
		int num = sc.nextInt();
		for(int j=0; j<num; j++) {
			System.out.println("hello");
		}
		
		
	}

}
