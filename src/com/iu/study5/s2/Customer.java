package com.iu.study5.s2;

public class Customer {
	private int money;
	private int point; // 손님 누적포인트
	
	public Customer() {
		//생성자로 초기화
		this.money=50000000;
		this.point=50;
	}
	
	// 계산 메서드
	// 1개 구매
	public void buy (Product product) {
		this.money = this.money - product.getPrice();
		this.point = this.point + product.getPoint();
		System.out.println("돈 : "+this.money + ", 포인트 : "+ this.point);
	}
	
	public void buy (Product [] products) {
		for(int i=0; i<products.length; i++) {
			//같은 class의 메소드 사용하기 위해 this(본인클래스)사용
			//계산 내용은 위와 같기때문에 위의 메소드를 불러와서 사용
			this.buy(products[i]);
		}
	}
}
