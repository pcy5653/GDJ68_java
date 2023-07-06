package com.iu.study4.s3;

public class Test {
	// 멤버변수 생성 (Heap공간 저장)
	int num1;
	double num2;
	
	public void method1() {
		// 참조변수명.멤버변수명
		System.out.println(this.num1 + num2); 
		System.out.println(this);
		method2();
	}
	
	public void method2() {
		System.out.println("method2");
	}
	
	// test1과 test2의 값 비교 
	public boolean same(Test t) {
		// num1과 다른 객체의 num1이 같고
		// num2와 다른 객체의 num2가 같으면 true리턴, 아니면 false.
		
		boolean result = false;
		if(this.num1==t.num1 && this.num2==t.num2){
			result = true;
		} 
		return result;
	}
	
	// 매개변수 = 지역변수 (stack공간 저장)
	public void hap(int num1) {
		// test객체의 num1과 매개변수 num1을 더한다
		// test객체의 (this)를 사용하여 인스턴스(파랑), 지역변수(갈색) 표시한다.
		System.out.println(this.num1+num1);
	}
	
	public void hap(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void hap(int n1, float n2) {
		System.out.println(n1+n2);
	}
}
