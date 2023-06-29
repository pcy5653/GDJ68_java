package com.iu.study3;

import java.util.Random;

public class Array5 {

	public static void main(String[] args) {
		
		//로또 문제 6개의 랜덤 숫자를 출력하라!
		int [] nums = new int [6];
		Random random = new Random();
		
		for(int i=0;i<nums.length;i++) {  //중복이 되지않게 5번을 반복해야함.
			nums[i]=random.nextInt(45)+1;
			
			for(int j=0;j<i;j++) {
				//중복 확인 코드
				//i가 0이면 X
				//i가 1이면 0비교
				//i가 2이면 0,1비교
				//i가 3이면 0,1,2비교
				//...
				if(nums[i]==nums[j]) {
					i--;
				}
			
			}
		}
		
		// 각 index의 값을 오름차순(ASC)로 정렬하여 출력하라
		// 1번째 돌리면 [0] : 6번 비교
		// 2번째 돌리면 [1] : 5번 비교
		// 3번째 돌리면 [2] : 4번 비교
		// 4번째 돌리면 [3] : 3번 비교
		// 5번째 돌리면 [4] : 2번 비교
		// 6번째 돌리면 [5] : 1번 비교		
		for(int i=0;i<5;i++) {
			for(int j=i+1;j<6;j++) {		//i=0이기 때문에 i+1로 한번 더 돌았을때 1
				if(nums[i]>nums[j]) {
					// 비교할 때 임시저장소 만들어야 기존의 값이 삭제되지 않는다.
					int tmp=nums[i];
					
					nums[i]=nums[j];
					nums[j]=tmp;
				}
			}
			
		}
	
		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}
}


