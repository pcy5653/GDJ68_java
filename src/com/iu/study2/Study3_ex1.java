package com.iu.study2;

public class Study3_ex1 {

	public static void main(String[] args) {
		// 국어, 영어, 수학 입력
		// 총점 평균 계산 (평균은 int)
		// 90:A, 80:B, 70:C, 60:D, 그외:F
		//switch 사용
		
		int ko = 80;
		int en = 70;
		int ma = 90; 
		
		int sum = ko + en + ma;
		int avg = sum/3;
		
		// avg를 10씩 나누면 10의 자리만으로 점수 구분 가능함!! 
		switch(avg/10) {
		case 10:
		case 9:
			System.out.println("A");
		    break;
		case 8:
			System.out.println("B");
		    break;
		case 7:
			System.out.println("C");
		    break;
		case 6:
			System.out.println("D");
		    break;
		default:
			System.out.println("F");
		}

	}

}
