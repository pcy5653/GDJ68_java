package com.iu.study3;

public class Array3 {

	public static void main(String[] args) {
		//배열명.length : 배열의 길이
		int [] nums = {1,2,3,4};
		System.out.println(nums.length);
		
		//기존의 nums의 길이에서 1칸을 추가 : nums.length+1
		int [] copyNums = new int [nums.length+1];

		// nums의 값들을 copyNums의 순서에 맞게 대입하라
		for(int i = 0; i<nums.length;i++) {
			copyNums[i] = nums[i];
		}
		//nums.length는 nums의 길이는 총 길이 : 4번째 -> [index]배열에 할 시 [4] : 5칸 의미
		copyNums[nums.length]=5;
		
		// copyNums의 주소를 nums에 대입하여 nums를 확인시에 copyNums로 주소설정
		nums = copyNums;
		
		
		// nums : 5칸
		copyNums = new int [nums.length-1];  //4
		System.out.println(copyNums.length);
		
		for(int i=0; i<copyNums.length; i++) {
			copyNums[i] = nums[i];
			System.out.println(copyNums[i]);
		}
		nums = copyNums;
		
		System.out.println(nums.length);
		//System.out.println("추가할 번호를 입력하세요");
	}

}
