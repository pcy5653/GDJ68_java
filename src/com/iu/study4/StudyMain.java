package com.iu.study4;

import java.util.Scanner;

public class StudyMain {

	public static void main(String[] args) {
		//System.out.println("프로그램 시작");
		
		// 데이터타입 변수명; Card라는 사용자가 생성한 데이터타입
		Card card = new Card();
		Card card2 = new Card();
		
		card.cardNumber = 3.1;
		//System.out.println(card.cvc);  // 인스턴스 변수 -> 기본값 0
		//System.out.println(card.name); // 인스턴스 변수 -> 기본값 null
		
		
		// Student class 출력
		Student s1 = new Student(); 
		s1.name = "박채연";
		s1.gender = 'f';
		
		Student s2 = new Student();
		s2.name= "iu";
		s2.gender='f';
		
		// s1과 s2를 한번에 출력할 수 있도록 배열 생성
		Student [] s3 = new Student[2];
		s3[0] = s1;
		s3[1] = s2;
		
		// view 메서드를 활용한 출력
		StudentView sv = new StudentView();
		sv.view(s1);
		
		// viewAll 메서드를 활요한 출력
		StudentView sa = new StudentView();
		sa.viewAll(s3);
	}

}
