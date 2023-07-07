package com.iu.study4.s5;

public class StaticTest {
	public int instanceNum;
	
	public static int staticNum; 
	
	public void instanceMethod() {
		// 클래스명.클래스변수명 (this를 사용할 수 없음. static은 객체 생성 X)
		StaticTest.staticNum=50;
		// 해당 클래스의 멤버변수 사용 시 this (객체선언 시에만 가능)
		this.instanceNum=20;
		System.out.println("멤버메서드");
	}
	
	public static void staticMethod() {
		// 클래스명.클래스변수명
		StaticTest.staticNum=20;
		// 하지만 다른 변수들은 staticMethod에 데이터가 없기 때문에 사용할 수 없다.
		
		System.out.println("클래스메서드");
	}
}
