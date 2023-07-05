package com.iu.study4.s2;

public class StudentView {
	public Student [] st1(Student [] count) {
		// 2. 학생 정보 출력 파트
		
		System.out.println("입력한 학생수는 " + count.length + "입니다.");
		for(int i=0; i<count.length; i++) {
			
			System.out.println(i+1 +"번 학생의 국어는 " + count[i].kor + "이고, 영어는 " + count[i].eng + "이며, 수학은 " + count[i].math + "이다.");
			System.out.println("위 학생의 평균은 " + count[i].avg + "점 입니다.");
		}
		
		//????????????
		return count;
	}
}
