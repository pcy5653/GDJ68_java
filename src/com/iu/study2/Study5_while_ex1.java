package com.iu.study2;

import java.util.Scanner;

public class Study5_while_ex1 {

	public static void main(String[] args) {
		// while문 사용하여 true 일 때까지 무한대로 반복하기
		
		Scanner sc = new Scanner(System.in);
		
		int id = 1234;
		int pw = 5678;
		boolean login = true;
		
		// while
		// 1. 로그인 시도 2. 프로그램 종료
		
		while(login) {
			System.out.println("ID를 입력하세요");
			int yid = sc.nextInt();
			System.out.println("PW를 입력하세요");
			int ypw = sc.nextInt();
			
			if(id==yid && pw==ypw) {
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
			}
			
			System.out.println("로그인 시도는 1번 프로그램 종료 2번");
			int check = sc.nextInt();
			
			if(check==2) {
				login = false;
			}
		}// while 끝
		
		// 로그인 성공했을 때만 진행
		// 게임을 진행한다. 시작레벨 : 1 / 최대레벨 : 15
		// 모든 몬스터의 경험치는 동일하고 레벨이 올라갈 수록 몬스터의 수는 증가한다.
		// gold : 0
		// 5레벨 달성시 : 1000gold 지급
		// 10레벨 달성시 : 2000gold 지급
		// 15레벨 달성시 : 3000gold 지급
		// 1 -> 2 : 3몬스터 사냥성공 메세지 3개
		// 2 -> 3 : 6몬스터
		// 3 -> 4 : 9몬스터
		// ...
		//14 -> 15 : 42몬스터
		// 랩업시 게임을 계속할지 종료할 지 선택
		
		// 현재레벨, gold가 출력
		
		int gold = 0;
		
		while(login) {
			System.out.println("게임을 시작하겠습니다.");
			
			for(int level = 1; level < 15; level++) {
				System.out.println("현재 레벨 : "+ level);
				System.out.println("게임 진행은 1, 종료는 2");
				int answer = sc.nextInt();
				
				if(answer==2) {
					login =! login;
					break;
				}
				
				for(int i=0; i<level*3; i++) {
					System.out.println("몬스터 사냥성공");
				}
					
				switch(level) {
				case 5:
					gold = gold+1000;
					System.out.println("현재 GOLD의 갯수는 "+ gold+"입니다.");
					break;
				case 10:
					gold = gold+2000;
					System.out.println("현재 GOLD의 갯수는 "+ gold+"입니다.");
					break;
				case 15:
					gold = gold+3000;
					System.out.println("현재 GOLD의 갯수는 "+ gold+"입니다.");
					login =! login;
					break;
				}	
			}
		}
		System.out.println("프로그램 종료");
		
	}

}
