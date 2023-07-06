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
		int level = 1;
		while(login) {
			System.out.println("게임을 시작하겠습니다.");
			
			for(level = 1; level < 15; level++) {
				System.out.println("현재 레벨 : "+ level);
				
				// 각 레벨에 따른 gold지급 (먼저해줘야 각 레벨에 종료시에 출력됨.)
				switch(level) {
				case 5:
					gold+=1000;
					break;
				case 10:
					gold+=2000;
					break;
				}
						
				// 레벨에 따른 마리수 표시
				for(int i=0; i<level*3; i++) {
					System.out.println(i+1+"마리 사냥성공");
				}
				
				System.out.println("게임 진행은 1, 종료는 2");
				int answer = sc.nextInt();
				
				if(answer==2) {
					login =! login;
					break;
				}
				
			}
			//switch문에 입력했을 시 15레벨 출력 안되기에 for문 밖에 작성
			if(level==15) {
				gold+=3000;
				login =! login;
				break;
			}
		}
		System.out.println(level+" 현재레벨");
		System.out.println(gold+" 골드");
		System.out.println("프로그램 종료");
		
		/*
		[강사님]
		int a;
		 
		for(a=1; a<15; a++) {
			
			// 5의배수 레벨 시 골드 지급
			if(a%5==0) {
				gold = gold+level/5*1000;
			}
			
			System.out.println("1,2");
			int select = sc.nextInt();
			if(select != 1) {
				break;
			}
			
			for(int monster=0;monster<a*3;monster++) {
				System.out.println(monster+1+"마리 사냥성공");
			}
			System.out.println(a+1+"로 랩업햇습니다.");
		}
		
		// 마지막 15레벨은 for문을 나오기 때문에 나와서 작성
		if(a==15) {
			gold+=3000;
		}
		
		System.out.println(a+" 현재레벨");
		System.out.println(gold+" 골드");
		*/
	}

}
