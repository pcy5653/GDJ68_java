package com.iu.study5.s1;

public class Worrier extends Character {
	
	// main method의 2.멤버변수 실행. 전사는 무기를 '가지고 있다'.
	Axe axe;

		
	// overriding : 수정
	@Override
	public void attack() {
		System.out.println("칼 찌르기");
	}
}
