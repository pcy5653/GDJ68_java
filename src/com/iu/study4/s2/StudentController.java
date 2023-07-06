package com.iu.study4.s2;
import java.util.Scanner;
 

import java.util.Scanner;

public class StudentController {
	// 	SS와 SV의 메서드를 총 관리라는 곳 = SC
	
	public void start() {
		// 1. 학생 정보 생성 -- makeStudents 호출
		// 2. 학생 정보 출력 -- SV에서 출력
		// 3. 프로그램 종료
		//    -- 2번먼저 누르면 NULL값만 나오니 1번->2번 순서대로 작성하고 프로그램 종료 누를 때까지 돌아가게 생성.
		// start 메서드 
		Scanner sc = new Scanner(System.in);
				
//		boolean check = true;
//		
//		while(check) {
//			System.out.println("학생 정보를 생성하세요!");
//					
//			// SS class 객체생성
//			StudentService service = new StudentService();
//			// 위 class의 method 선언
//			Student [] count = service.makeStudents();
//					
//			// SV class 객체생성
//			StudentView studentView = new StudentView();
//			// 위 class의 method를 사용한다(SS객체의 method를 받아온다, makeStudents -> Student [] count로 받아옴 java.22)
//			// makeStudents의 배열을 받아와 st1에서 보여준다.
//			studentView.view(count);
//					
//			// 입력 or 종료 선택
//			System.out.println("다시 입력 : 1 , 프로그램 종료 : 2");
//			int push = sc.nextInt();
//					
//			if(push==2) {
//				System.out.println("프로그램 종료합니다.");
//				check =! check;
//				break;
//			}
//					
//		}
//		return check;
		
		// studentService라는 객체를 한번만 만들어주면 효율적
		StudentService studentService = new StudentService();
		// if문 1번에 선언을 하면 2,3번에서 사용할 수 없으니 while문 밖에서 선언
		Student [] count = null;	//-> Reference변수 기본값 null, 빈 배열보여주기위해
		
		// studentView라는 객체를 한번만 만들어주기
		StudentView studentView = new StudentView();
		
		// while을 마지막에 둠으로써 1번은 무조건 돌아가고 그 뒤에 조건식 검사한다.
		while(true){
			System.out.println("1. 학생정보생성");
			System.out.println("2. 학생정보출력");
			System.out.println("3. 학생정보검색");
			System.out.println("4. 프로그램종료");
			int select = sc.nextInt();
			
			if(select==1) {
				System.out.println("1번 누름");
				// Student [] count로 받는 이유는 studentView객체에서 view메소드를 통해 보여주기 위해
				count = studentService.makeStudents();
			}else if(select==2) {
				System.out.println("2번 누름");
				studentView.view(count);
			}else if(select==3) {
				System.out.println("3번 누름");
				// 1. findByNum (1명의 학생을 받기 때문에 Student타입의 변수로 생성)
				// 매개변수는 여러명의 학생의 데이터를 받기때문에 Student [] count
				Student student = studentService.findByNum(count);
				
				// 2. viewOne
				studentView.view(student);
				
			}else {
				System.out.println("프로그램종료");
				break;
			}
		}

	}
}
