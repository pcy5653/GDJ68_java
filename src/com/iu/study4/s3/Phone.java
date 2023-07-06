package com.iu.study4.s3;

public class Phone {
	// 멤버변수
	String company="Apple";
	String brand="Iphone15";
	
	{
		// Instance 초기화 블럭
		this.company="LG";
		this.brand="가로본능";
	}
	
	// 생성자 메서드
	public Phone() {
		this.company="Samsung";
		this.brand="s20";
	}
	
	
	public void info() {
		System.out.println("Company : "+ this.company);
		System.out.println("Brand : "+ this.brand);
	}
}
