package com.iu.study5.s1;

public class Magician extends Character {
	private int mp;
	
	public int getMp() {
		return mp;
	}
	public void setMp(int mp) {
		this.mp = mp;
	}

	
	public Magician() {
		// 본인 생성자 호출 this();
		// 부모의 생성자 호출 super ();
		super ();
	}
	
	
	// overriding : 수정
	// 상속받은 메서드의 내용을 자기에 맞게 재정의.
	// 상속받은 메서드의 선언부(헤더)는 동일하게 작성
	public void attack() {
		System.out.println("파이어볼");
	}
	
}
