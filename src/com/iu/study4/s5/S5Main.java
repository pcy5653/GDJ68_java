package com.iu.study4.s5;

public class S5Main {

	public static void main(String[] args) {
		// 그외 지정자 (static, final)
		
		// 클래스명 참조변수명 = new 생성자();
		//StaticTest st = new StaticTest();
		
//		// 클래스명.클래스변수명
//		StaticTest.staticNum=20;
//		// 클래스명.메스드명();
//		StaticTest.staticMethod();	
		
		
		// MyCar 예제
		// company와 같이 동일한 데이터를 한번에 바꿔야 할 때 static 사용.
		MyCar.company="Audi";
		
		MyCar myCar1 = new MyCar();
		myCar1.brand="A7";
		
		System.out.println(MyCar.company);
		System.out.println(myCar1.brand);
		
		MyCar myCar2 = new MyCar();
		myCar2.brand="SL8";
		
		System.out.println(MyCar.company);
		System.out.println(myCar2.brand);
	}

}
