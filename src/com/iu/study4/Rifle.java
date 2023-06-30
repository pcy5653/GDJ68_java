package com.iu.study4;

public class Rifle {
	
	boolean mod; // true: 단발, false:점사
	
	// 메서드 선언공식
	// 접근지정자 [그외지정자] 리턴타입 메서드명([매개변수들 선언]) {실행 코드}
	// 메인메서드 -> public static void main(String [] args) {}
	
	// int count : 매개변수들 선언
	public void shoot1(int count) {
		int damage=20;
		for(int i =0; i<count; i++) {
			System.out.println("탕");
		}
	}
	
	//shoot2
	public void shoot2(int c, String n, int [] ar) {
		System.out.println("타타탕");
	}
	
	
}
