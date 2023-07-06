package com.iu.study4;

public class StudentView {
	// Student 정보를 출력
	// 메서드 이름 : view 
	
	public void view(Student student) {
		System.out.println(student.name);
		System.out.println(student.gender);
	}
	
	//메서드 이름 : viewAll
	// 모든 student(s1, s2)들 정보출력
	// 단, viewAll 매개변수는 딱 한개만 선언
	
	public void viewAll(Student [] total) {
		
		for(int i=0; i<total.length; i++) {
			System.out.println(total[i].name);
			System.out.println(total[i].gender); 
		}	
	}
}
