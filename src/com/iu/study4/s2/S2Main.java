package com.iu.study4.s2;

public class S2Main {
		// 리턴변수, 매개변수, 참조변수 this, 접근지정자 사용
	public static void main(String[] args) {
		// 1. 프로그램 실행
		// 2. 테스트 용도
		
		// 1=학생관련 class활용
//		StudentService sv = new StudentService();
		
		// makeStudeSnt 메서드
		//Student student = sv.makeStudentOne();
		//System.out.println(student.avg);
		
		// makeStudents 메서드
		//Student [] st = sv.makeStudents();
		
		// StudentController class 변수 선언
		StudentController control = new StudentController();
		// control class에서 start()메서드의 반환값 보여주기
		// boolean result = control.start();
		// makeStudent 메서드
//		Student student = sv.makeStudentOne();
//		System.out.println(student.avg);
		
		// makeStudents 메서드
//		Student [] st = sv.makeStudents();
		
		// StudentController class 변수 선언 (객체생성)
		StudentController studentcontrol = new StudentController();
		// control class에서 start()메서드의 반환값 보여주기
		// boolean result = control.start();
		studentcontrol.start(); 
		
//		// 2=셰프관련 class 활용
//		Chef chef = new Chef();
//		// 라면만들어
//		//Ramyun [] ramyuns = chef.makeRamyun(3);
//		
//		// 접시만큼 라면만들어
//		Ramyun [] ramyuns = new Ramyun[2];
//		chef.makeRamyun2(ramyuns);
//		System.out.println(ramyuns[0].title);
		
		// 김밥만들어
		//chef.makeKimbap();
	}

}
