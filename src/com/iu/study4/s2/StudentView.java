package com.iu.study4.s2;

public class StudentView {
//	public void view(Student [] count) {
//		// 2. 학생 정보 출력 파트
//		// 출력할 파트에서는 반환할 값이 없기에 '리턴변수'를 void로 사용한다.
//		
//		System.out.println("입력한 학생수는 " + count.length + "입니다.");
//		for(int i=0; i<count.length; i++) {
//			
//			System.out.println(i+1 +"번 학생의 국어는 " + count[i].kor + "이고, 영어는 " + count[i].eng + "이며, 수학은 " + count[i].math + "이다.");
//			System.out.println("위 학생의 평균은 " + count[i].avg + "점 입니다.");
//		}
//	}
	
	// 3번 누를시 해당 메서드 실행(출력) 
	// 1번 메소드 viewOne, 2번 메소드 view => overloading을 통해 동일한 메서드명으로 사용
	public void view(Student student) {
		System.out.println(student.getName(null));
		System.out.println(student.getNum(0));
		System.out.println(student.getAvg());
	}
	
	public void view(Student [] count) {
		// studentService객체의 makeStudents메서드를 담은 count를 매개변수로 받아옴.
		// 출력만 하면 끝 = return 할 값이 없다.
		
		for(int i=0; i<count.length; i++) {
			Student student = count[i];
//			System.out.println(student.name);
//			System.out.println(count[i].num);
//			System.out.println(count[i].avg);
			this.view(student);
			System.out.println("=================="); 
		}
		
//	public Student [] st1(Student [] count) {
//		// 2. 학생 정보 출력 파트
//		
//		System.out.println("입력한 학생수는 " + count.length + "입니다.");
//		for(int i=0; i<count.length; i++) {
//			
//			System.out.println(i+1 +"번 학생의 국어는 " + count[i].kor + "이고, 영어는 " + count[i].eng + "이며, 수학은 " + count[i].math + "이다.");
//			System.out.println("위 학생의 평균은 " + count[i].avg + "점 입니다.");
//		}
//		
//		//????????????
//		return count;
	}
}
