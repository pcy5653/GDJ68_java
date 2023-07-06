package com.iu.study4.s3;

public class S3Main {

	public static void main(String[] args) {
		// 객체생성 -> 메서드 사용
		// test : stack공간 | new Test() : Heap공간(int, double)
		Test test1 = new Test();
		test1.num1=2;
		test1.num2=1.2;
		//test1.method1();		// 0.0
		//System.out.println(test1);  // method1의 this와 동일한 주소값
		
		Test test2 = new Test();
		test2.num1=2;
		test2.num2=1.2;
		//test2.method1();	// 3.2	
		//System.out.println(test2);
		
		System.out.println(test1==test2);
		test1.same(test2);
		test2.same(test1);
		boolean result = test1.same(test2);
		System.out.println(result);
		
//		Test test = new Test();
//		test.hap(10, 10.2F); 
		
		
		// 생성자 (Constructor)  
		//자동차 예제
//		Car car1 = new Car();
//		// 아래 값을 Car() 생성자 메서드에 집어넣음
//		car.company="Audi";
//		car.brand="A7";
//		car.color="black";
//		car.price=9985;
//		car1.info();
//		
//		Car car2 = new Car("S8");
//		car2.info();
//		
//		Car car3 = new Car("SL2", "chacol");
//		car3.info();
//		
//		Car car4 = new Car("SL2", "chacol", 10518);
//		car4.info();
		
		// 핸드폰 예제
//		Phone phone = new Phone();
//		phone.info();
	}

}
