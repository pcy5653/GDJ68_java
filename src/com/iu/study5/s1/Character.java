package com.iu.study5.s1;

public abstract class Character {
	private int hp;
	private int damage;
	private int level;
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}

	
	// 메서드 section
	// final 메소드 시 overriding X
	public final void getItem() {
		System.out.println("아이템 줍기");
	}
	
	public abstract void attack();
		// abstract : 미완성
		// 메소드에 abstract 사용 시 무조건 오버라이딩 

	
}
