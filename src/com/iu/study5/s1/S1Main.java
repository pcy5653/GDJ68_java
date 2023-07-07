package com.iu.study5.s1;

public class S1Main {

	public static void main(String[] args) {
		// 상속 과 다형성
		// 게임 캐릭터 예시
		
		// 전사
		Worrier worrier = new Worrier();
		// extends Character을 통해 부모꺼 상송
		worrier.getItem();
		// 다른 클래스의 멤버를 내가 선언한 멤버처럼 사용하고 싶을 때
		// 다른 클래스를 사용하고 싶을 때 1.상속  2.멤버변수
		// worrier.axe.name
		
		// 마법사
		Magician magician = new Magician();
		magician.getItem();
		
		// 공격
		worrier.attack();
		
		// 다형성
		// 부모데이터타입을 자식이 받을 수 있다.
		Character character = magician;
		character = worrier;
		
		// character타입이기에 현재는 magician만 갖는 mp를 사용할 수 없다,
		// 그렇기때문에 다시 형변환(원래의 타입)하여(1번) 원하는 변수를 사용(2번)해야 한다.
		// magician.setMp(); --> X
		magician = (Magician)magician;   // 1번
		magician.setMp(20);				 // 2번
		
		
		// 다형성으로 자식들을 한곳에 모으기 위해(배열) 동일한 데이터타입(부모) 선언
		Character [] w = new Character[2];
		w[0]=worrier;
		w[1]=magician;
		
		// Worrier타입 -> Character타입(배열넣고) -> Worrier타입(형변환하여 기존의 worrier에 데이터 넣기)
		//worrier = (Worrier)w[0];
		//magician = (Magician)w[1];
	}

}
