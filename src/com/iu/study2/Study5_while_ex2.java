package com.iu.study2;

import java.util.Random;
import java.util.Scanner;

public class Study5_while_ex2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		int hp=40;			// 유저의 HP
		int monsterHp=60;	// 몬스터의 HP
		int monsterPower=40;// 몬스터의 공격력
		
		// 1.평타 2.스킬 3.HP회복 4.도망
		// 평타 : 0 ~ 10미만의 공격이 몬스터에게 적용. monsterHp에서 차감
		// 스킬 : 0 ~ 30미만의 공격이 몬스터에게 적용. (최대 3번까지 적용)
		// 회복 : 0 ~ 40까지 회복. 회복량 40을 넘어가도 40으로 표시
		// 도망 : 50%확률로 성공, 실패
		// 몬스터차례 -> 내차례 -> ...
		// 종료 2가지 : 1. HP가 0일 때, 2. 도망 성공했을 시
		
		//monster
		// 1: 유저 공격 0~40의 공격을 유저에게
		int mP = random.nextInt(41);
		// 평타 랜덤
		int a = random.nextInt(11);
		// 스킬 랜덤
		int b = random.nextInt(31);
		// 회복 랜덤
		int c = random.nextInt(41);
		// 도망 랜덤
		int d = random.nextInt(2);
		
		while(check) {
			// 유저정보 : hp | 몬스터정보 : hp
			System.out.println("유저의 hp는 "+ hp+", 몬스터의 hp는 "+monsterHp);
			// 4가지 공격 선택 (유저 먼저)
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int num = sc.nextInt();
			
			// 선택한 공격이 몬스터한테 적용한 값
			if(num==1) {
				System.out.println("평타 공격 : "+a);
				monsterHp-=a;
			}else if(num==2) {
				System.out.println("스킬 공격 : "+b);
				monsterHp-=b;
			}else if(num==3) {
				System.out.println("회복 수치 : "+c);
				hp+=c;
				if(hp>=40) {
					hp=40;
				}
			}else {
				System.out.println("도망 결과 : "+d);
				// 도망 성공:0 -> 게임종료 | 실패: 1
				if(d==0) {
					check =! check;
					break;
				   }
			 }
			System.out.println("몬스터 데미지는 "+monsterHp);
		    
			// 몬스터 공격
			System.out.println("몬스터 공격차례!");
			System.out.println(mP);
			hp-=mP;
		
			if(hp<=0 || mP<=0) {
				hp=0;
				mP=0;
				System.out.println("유저의 데미지는 "+ hp);
				check=!check;
			}
		}
		System.out.println("게임이 종료되었습니다.");
		
		
		
		
	}

}
