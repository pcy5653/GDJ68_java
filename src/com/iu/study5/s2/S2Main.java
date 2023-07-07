package com.iu.study5.s2;

public class S2Main {

	public static void main(String[] args) {
		Computer computer = new Computer();
		computer.setCompany("SAMSUNG");
		computer.setModel("갤럭시 북");
		computer.setCpu("ip");
		computer.setColor("black");
		computer.setPrice(200000);
		computer.setPoint(200);
		
		Tv tv = new Tv();
		tv.setCompany("LG");
		tv.setModel("좋은티비");
		tv.setInch(50);
		tv.setColor("white");
		tv.setPrice(500000);
		tv.setPoint(500);
		
		Phone phone = new Phone();
		phone.setCompany("Apple");
		phone.setModel("iphone12pro");
		phone.setOs("IOS");
		phone.setColor("black");
		phone.setPrice(30000);
		phone.setPoint(90);
		
		//손님이 1개의 물건 구매
		Customer winter = new Customer();
		//winter.buy(tv);
		
		//손님이 2개의 물건 구매
		Product [] products = new Product [2];
		products[0]=computer;
		products[1]=tv;
		winter.buy(products);
	}

}
