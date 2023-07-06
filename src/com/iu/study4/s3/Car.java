package com.iu.study4.s3;

public class Car {
	// 멤버변수 선언
	// 지정사용자가 default이면 같은 패키지에서만 사용가능
	String company;
	public String brand;		// 모든 패키지에서 사용가능
	String color;
	int price;
	
	// 생성자(Constructor) : 그외지정자(static), 리턴변수(void) X
	// 접근지정자 클래스명과동일한이름=메서드명([매개변수들 선언]) {}
	// Car car = new "Car()"; -> "Car()"를 생성자라고 함.
	// 매개변수가 없으면 '기본생성자' 라고 불림.
	public Car() {
		// 기본생성자 : 아무것도 없다면 기본으로 1개 만들어지지만 생성자가 있다면 기본생성자는 존재하지 않는다.
		
		// 다른 생성자 호출 this();
		this("A7");
		this.company="Audi";
		this.brand="A7";
		this.color="black";
		this.price=9985;
	}
	
	public Car(String brand) {
		// 기본생성자
		this(brand, "PINK");
//		System.out.println("자동차를 만듭니다");
//		this.company="Audi";
//		this.brand=brand;
//		this.color="black";
//		this.price=9985;
	}
	
	public Car(String brand, String color) {
		this(brand, color, 9958);
//		System.out.println("자동차를 만듭니다");
//		this.company="Audi";
//		this.brand=brand;
//		this.color=color;
//		this.price=9985;
	}
	
	public Car(String brand, String color, int price) {
		System.out.println("자동차를 만듭니다");
		this.company="Audi";
		this.brand=brand;
		this.color=color;
		this.price=price;
	}
	
	
	public void info() {
		System.out.println("Company : "+ this.company);
		System.out.println("Brand : "+ this.brand);
		System.out.println("Color : "+ this.color);
		System.out.println("Wheel : "+ this.price+"만원");
	}
}
