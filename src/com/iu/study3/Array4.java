package com.iu.study3;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] nums = {1,2,3,4,5};
		int [] copyNums = new int [nums.length-1];
		
		System.out.println("지울려고 하는 인덱스 번호를 입력하세요");
		int idx = sc.nextInt();
		
		int index=0;
		for(int i=0;i<nums.length;i++) {
			if(idx==i) {
				// 입력한 idx가 i(nums[])와 같으면 증감식으로 올라가기
				continue;
			}
			copyNums[index]=nums[i];
			// 위에 if문이 발생하면 index와 i의 값이 달라지기 때문에 
			index++;
		}
		
		nums=copyNums;
		
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}

	}

}
