package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {

		StudentService sv = new StudentService();
		
		// makeStudeSnt 메서드
		//Student student = sv.makeStudentOne();
		//System.out.println(student.avg);
		
		// makeStudents 메서드
		//Student [] st = sv.makeStudents();
		
		// StudentController class 변수 선언
		StudentController control = new StudentController();
		// control class에서 start()메서드의 반환값 보여주기
		boolean result = control.start();
	}

}
