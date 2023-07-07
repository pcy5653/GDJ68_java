package com.iu.study4.s5;

public class MyCar {
	// static 초기화 1
	public static String company="Kia";
	public String brand;
	
	// static 초기화 2
	static {
		MyCar.company="Audi";
	}
	
	
	{} // 객체 생성시
	public MyCar() {} //객체 생성시
	//setter : 객체 생성 후
}
