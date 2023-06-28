package com.iu.study2;

public class Study4_for_ex1 {

	public static void main(String[] args) {
		// 0 - 10미만의 숫자 중 짝수 만 출력
		
		for(int i = 0; i<10; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
		
		// 0 - 10미만의 숫자 중 짝수만 출력
		// 단, if문 사용 X
		
		for(int j = 0; j<10; j+=2) {
			System.out.println(j);
		}
		
		
		// a - z 출력
		for (int c = 97; c < 123; c++) {;
			System.out.println((char)c);
		}
		
		// A -Z 출력
		for (int c = 65; c < 91; c++) {
			System.out.println((char)c);
		}
	}

}
