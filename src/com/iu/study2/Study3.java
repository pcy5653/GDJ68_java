package com.iu.study2;

public class Study3 {

	public static void main(String[] args) {
		// if, if-else, if - else if - else
		// switch (정수식 또는 문자열 [조건식]) { case 정수 또는 문자열: break; } 
		// 여러개 중 하나 선택
		 
		int num = 10;
		
		switch(num*2) {
		case 10:
			System.out.println("num 10");
			break;
		case 20:
			System.out.println("num 20");
			break;
		default:	
			System.out.println("num 모름");
		}
		
	}

}
