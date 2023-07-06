package com.iu.study4.s2;

public class Chef {
	
	// 셰프에게 라면, 김밥 만들기 메서드(활동) 부여
	String name;
	
	public void makeRamyun2(Ramyun [] ramyuns) {
		//S2Main에서 배열을 받아 실행하는 method
		for(int i =0; i<ramyuns.length; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			
			ramyuns[i]=ramyun;
		}
	}
	
	
	
	public Ramyun [] makeRamyun(int count) {
		
		// Ramyun class를 객체 생성!!!!
		// ramyun인 참조변수는 Ramyun타입만 담을 수 있다.
		//Ramyun ramyun = new Ramyun();
		//Ramyun ramyun2 = new Ramyun();
		//ramyun2 = new Ramyun();
		// int num = 2;
		// num =3;
		
		Ramyun [] ramyuns = new Ramyun[count];
		for(int i = 0; i<count; i++) {
			Ramyun ramyun = new Ramyun();
			ramyun.title = "진라면";
			ramyun.price = 3000;
			
			// 해당 ramyun변수의 주소(100, 200)에 생성된 내용을 각각 집어넣는 과정
			ramyuns [i] = ramyun;
		}
		return ramyuns;
	}
	
	public void makeKimbap() {
		
	}
}
