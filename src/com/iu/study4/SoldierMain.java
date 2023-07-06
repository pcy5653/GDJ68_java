package com.iu.study4;

import java.util.Scanner;

public class SoldierMain {

	public static void main(String[] args) {
		Soldier soldier = new Soldier();
		Scanner sc = new Scanner(System.in);
		System.out.println("공격하고 싶은 횟수는?");
		int b = sc.nextInt();
		soldier.attack(b);

	}

}
 