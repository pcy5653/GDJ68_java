package com.iu.study4.s1;

public class Hap {
	public int h1(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
		return sum;
	}
	
	//홀수면 true, 짝수면 false 결과를 리턴하라.
	public boolean h2(int num) {
		boolean result=false; 
		
		if(num%2==0) {
			result =! result;
		}
		return result;
	}
	
	public int [] h3(int count) {
		// count 수 만큼 정수를 담을 배열을 만들어서 리턴하라.
		int [] ar = new int[count];
		return ar;
		
	}
}
