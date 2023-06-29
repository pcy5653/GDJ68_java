package com.iu.study3;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 갯수를 입력하세요");
		int j = sc.nextInt();
		
		int [] nums = new int[j];
		// int i = 0; 첫번째 for문의 지역변수
		for(int i=0; i<j; i++) {
			System.out.println(i+1+" 번째 숫자 입력");
			nums[i]=sc.nextInt();
		}
		
		// int i = 0; 두번째 for문의 지역변수라 동일 시 되지 않음.
		for(int i=0; i<j; i++) {
			System.out.println(nums[i]);
		}

	}

}
