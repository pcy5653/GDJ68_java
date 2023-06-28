package com.iu.study2;

import java.util.Scanner;

public class Study4_for2_ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 30발 3탄창
		// M16, 2가지: 단발, 3점사
		
		// 1. 단발, 2.점사
		// 탕, 타타탕

		for(int tan = 0; tan<3; tan++) {
			System.out.println("단발 : 1, 점사 : 2");
			int a = sc.nextInt();
			
			if(a==1) {
				for(int i=0; i<30; i++) {
					System.out.println("탕");
				}
			}else if(a==2) {
				for(int j=0; j<10; j++) {
					System.out.println("타타탕");
				}
			}else {
				System.out.println("잘못 입력하셨습니다.");
				tan=-1;
			}
		}
		System.out.println("모두 쏘셨습니다.");
	}
}
