package com.iu.study4.s2;

import java.util.Scanner;

public class StudentController {
	
	public boolean start() {
		// 1. 학생 정보 생성 -- makeStudents 호출
		// 2. 학생 정보 출력 -- SV에서 출력
		// 3. 프로그램 종료
		//    -- 2번먼저 누르면 NULL값만 나오니 1번->2번 순서대로 작성하고 프로그램 종료 누를 때까지 돌아가게 생성.
		// start 메서드 
		Scanner sc = new Scanner(System.in);
				
		boolean check = true;
				
		while(check) {
			System.out.println("학생 정보를 생성하세요!");
					
			// SS class 선언
			StudentService service = new StudentService();
			// 위 class의 method 선언
			Student [] count = service.makeStudents();
					
			// SC class 선언
			StudentView view = new StudentView();
			// 위 class의 method 선언
			Student [] stview = view.st1(count);
					
			// 입력 or 종료 선택
			System.out.println("다시 입력 : 1 , 프로그램 종료 : 2");
			int push = sc.nextInt();
					
			if(push==2) {
				System.out.println("프로그램 종료합니다.");
				check =! check;
				break;
			}
					
		}
		return check;
	}
}
