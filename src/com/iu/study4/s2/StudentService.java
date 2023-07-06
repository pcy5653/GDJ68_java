package com.iu.study4.s2;

import java.util.Scanner;

public class StudentService {
	
	// 3번 누를시 해당 메서드 실행(입력), 매개변수는 총학생의 데이터중에서 찾아야하기 때문에 count
	public Student findByNum(Student [] count) {
		Scanner sc = new Scanner(System.in);
		System.out.println("찾을려는 학생의 번호를 입력하세요.");
		int num = sc.nextInt();
		
		// 1명의 학생의 데이터를 받을(주소릃 넣는다) 변수 설정
		//Student타입의 student변수를 리셋해주는 개념으로 null값 넣어주기(References 타입)
		Student student = null;
		
		// 1번에서 입력한 학생배열에서 찾는 반복문
		for(int i=0; i<count.length; i++) {
			if(num==count[i].getNum(num)) {
				// true이고 1명의 학생의 주소를 받기위해 Student [](여러명)중에 Student타입(1명)에 넣는다.  
				student = count[i];
				break; 
			}
		}
		return student;
	}
	
	
	
	public Student makeStudentOne() {
		// 학생 한명 만들어서 이름, 번호, 국어, 영어, 수학
		// 총점 평균을 계산 
		// 학생을 리턴
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		System.out.println("이름");
		s.setName(sc.next());
		System.out.println("번호");
		s.setNum(sc.nextInt());
		System.out.println("국어");
		s.setKor(sc.nextInt());
		System.out.println("영어");
		s.setEng(sc.nextInt());
		System.out.println("수학");
		s.setMath(sc.nextInt());
		
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
		
		// 1=> 학생을 담을 배열 생성
		Student [] count = new Student[i];
		
		//2
		for(int j=0; j<i; j++) {
			Student s1 = new Student();
			
			//3
			System.out.println("이름");
			s1.setName(sc.next());
			
			System.out.println("번호");
			s1.setNum(sc.nextInt());
			
			System.out.println("국어");
			s1.setKor(sc.nextInt());
			
			System.out.println("영어");
			s1.setEng(sc.nextInt());
			
			System.out.println("수학");
			s1.setMath(sc.nextInt());
			
			// student객체에서 total, avg 출력
			s1.cal();
			
			count[j] = s1;
		}
		
		
	return count;
		
	}
}
