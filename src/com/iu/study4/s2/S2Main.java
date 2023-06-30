package com.iu.study4.s2;

public class S2Main {

	public static void main(String[] args) {

		StudentService sv = new StudentService();
		
		// makeStudent 메서드
		Student student = sv.makeStudentOne();
		System.out.println(student.avg);
		
		// makeStudents 메서드
		Student [] st = sv.makeStudents();
	}

}
