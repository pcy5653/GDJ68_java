package com.iu.study4.s4;

public class Product {
	
	// private 접근지정자는 해당 class에서만 사용가능
	// main 메서드에서도 다른 패키지니 사용할 수 없다.
	private String name;
	private int price;
	
	// 외부데이터를 내부데이터에 전달(public -> private)
	public void setPrice() {
		// -가격일 수 있기에 조건문
		if(price<1) {
			this.price=1000;
		}
		this.price=price;
	}
	
	// 내부데이터를 외부로 가져오기 위함.
	public int getPrice() {
		if(price<1) {
			this.price=1000;
		}
		return this.price;
	}
	
	public void info() {
		System.out.println(this.name);
	}
}
