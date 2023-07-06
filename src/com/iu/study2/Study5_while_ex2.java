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
		
		// 스킬 최대 3번
		int skillCount=3;
		
		while(check) {
			// 유저정보 : hp | 몬스터정보 : hp
			System.out.println("유저의 hp는 "+ hp+", 몬스터의 hp는 "+monsterHp);
			// 4가지 공격 선택 (유저 먼저)
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			
			// 각각의 변수를 선어하지 않고 num 변수를 이용해 random.next에서 받는 값도 넣는다.
			int num = sc.nextInt();
			
			// 선택한 공격이 몬스터한테 적용한 값
			if(num==1) {
				num = random.nextInt(10);
				monsterHp-=num;
				System.out.println("평타 공격 : "+ num);
			}else if(num==2) {
				if(skillCount>0) {
					num = random.nextInt(30);
					monsterHp-=num;
					System.out.println("스킬 공격 : "+ num);
					// 스킬 1회씩 차감
					skillCount--;
				}else {
					System.out.println("스킬횟수를 소진하였습니다.");
				}
			}else if(num==3) {
				num = random.nextInt(40);
				hp+=num;
				System.out.println("회복 수치 : "+ num);
				if(hp>=40) {
					hp=40;
				}
				System.out.println("유저의 회복 수치 : "+hp);
			}else {
				// 도망 성공:0 -> 게임종료 | 실패: 1
				num = random.nextInt(2);
				System.out.println("도망 결과 : "+ num);
				if(num==0) {
					System.out.println("몬스터에게서 도망쳤습니다!");
					break;
				   }
			 }//1.2.3.4 공격 실행문 끝
			System.out.println("몬스터 데미지는 "+monsterHp);
		     
			// 몬스터 공격
			num=random.nextInt(41);
			hp-=num;
			System.out.println("몬스터 공격차례!");
			System.out.println("몬스터 공격치 : "+ num);
		
			if(hp<=0 || monsterHp<=0) {
				hp=0;
				monsterHp=0;
				System.out.println("유저의 데미지는 "+ hp);
				check=!check;
			}
		}//while 끝
		System.out.println("게임이 종료되었습니다.");
		
		///////////////////////////////
		 /*
		boolean flag=true;
		
		
		while(flag) {
			System.out.println("1.평타 2.스킬 3.회복 4.도망");
			int select = sc.nextInt();
			
			if(select==1) {
				//평타
				select = random.nextInt(11);
				monsterHp=monsterHp-select;
				if(monsterHp<1) {
					System.out.println("몹이 죽었어요");
					break;
				}
			}else if(select==2) {
				//스킬카운트
				if(skillCount>0) {
					//스킬
					select = random.nextInt(31);
					monsterHp=monsterHp-select;
					if(monsterHp<1) {
						System.out.println("몹이 죽었어요");
						break;
					}
					//1회씩 차감
					skillCount--;
				}else {
					System.out.println("스킬횟수를 소진하였습니다.");
				}
			}else if(select==3) {
				//회복
				select = random.nextInt(41);
				hp=hp+select;
				if(hp>=40) {
					hp=40;
				}
				System.out.println("유저의 회복 수치 : "+hp);
			}else {
				//도망
				select = random.nextInt(2);
				if(select==0) {
					System.out.println("도망성공");
					break;
				}else {
					System.out.println("도망실패");
				}
			}// 1.2.3.4 실행문 끝
			
			select=sc.nextInt(41);
			hp=hp-select;
			System.out.println("유저의 피해는 "+select);
			if(hp<1) {
				System.out.println("You Die");
				break;
			}
		}
		*/
		
	}

}
