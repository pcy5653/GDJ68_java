package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		int result = random.nextInt(10);
		
		// while(조건문 -> 무조건 true){참일 때 실행되는 출력문}
		while(check) {
			System.out.println("0-10 미만 숫자 입력");
			int num = sc.nextInt();
			 
			if(result==num) {
				System.out.println("정답입니다.");
				check =! check;  // 정답일 경우 빠져나오는 방법 1
				break;			 // 정답일 경우 빠져나오는 방법 2
			}else {
				System.out.println("틀렸습니다.");
			}
		} // while 끝

	}

}
