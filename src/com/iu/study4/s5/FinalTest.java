package com.iu.study4.s5;

// final : 변하지 않는 , 상수 취급 지정자이기에 변수명을 대문자_대문자(snake방식)
// class앞에 final = 상속불가
public final class FinalTest {
	
	// static & final : 공통의 변하지 않는 값 ex) 카드 사이즈
	public static final int SIZE=50;
	
	// 변수 : 변하는 값
	// 변수 앞에 final = 상수, 한번 입력한 값은 변경 불가 (20이면 쭉 20)
	public final int MAX_NUM; // =20;(초기화) 1번
	
//	{	//인스턴스 값 대입  2번
//		this.MAX_NUM=20;
//	}
	
	// 생성자 값 대입  3번
	public FinalTest() {
		this.MAX_NUM=20;
	}
	
	// method앞에 final = 오버라이딩 불가
	public final void finalMethod() {
		
		// 지역변수 앞에 final = 상수, 한번 입력한 값은 변경 불가
		final int a=10;
	}
}
