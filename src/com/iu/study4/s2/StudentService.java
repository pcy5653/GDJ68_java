package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	public Student makeStudentOne() {
		// 학생 한명 만들어서 이름, 번호, 국어, 영어, 수학
		// 총점 평균을 계산 
		// 학생을 리턴
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("이름");
		s.name = sc.next();
		System.out.println("번호");
		s.num = sc.nextInt();
		System.out.println("국어");
		s.kor = sc.nextInt();
		System.out.println("영어");
		s.eng = sc.nextInt();
		System.out.println("수학");
		s.math = sc.nextInt();
		
		s.total = s.kor + s.eng + s.math;
		s.avg = s.total/3;

		return s;
	}
	
	
	public Student [] makeStudents () {
		//학생수 입력받기
		//학생수 만큼 학생들이 만들어짐
		//이름, 번호, 국어, 영어, 수학 점수입력
		//총점, 평균 계산해서 대입한다.
		//학생들을 리턴하라.
		
		// 1. 학생 배열을 생성
		// 2. 학생수 만큼 반복문 실행
		// 3. 반복문 내에서 이름, 번호, 국어, 영어, 수학 입력 총점 평균
		// 4. 해당 학생을 배열에 대입
		Scanner sc = new Scanner(System.in);
		
		//1
		System.out.println("학생수를 입력하세요");
		int i = sc.nextInt();
		Student [] count = new Student[i];
		
		//2
		for(int j=0; j<count.length; j++) {
			Student s1 = new Student();
			
			//3
			System.out.println("이름");
			s1.name= sc.next();
			
			System.out.println("번호");
			s1.num= sc.nextInt();
			
			System.out.println("국어");
			s1.kor= sc.nextInt();
			
			System.out.println("영어");
			s1.eng= sc.nextInt();
			
			System.out.println("수학");
			s1.math= sc.nextInt();
			
			s1.total = s1.kor + s1.eng + s1.math;		
			s1.avg = s1.total/3;
			
			count[j] = s1;
		}
		
		
	return count;
		
	}
}
