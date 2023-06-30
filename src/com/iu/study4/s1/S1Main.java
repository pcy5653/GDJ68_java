package com.iu.study4.s1;

import java.util.Scanner;

public class S1Main {

	public static void main(String[] args) {
		//Hap선언
		Hap hap = new Hap();
		int sum = hap.h1(10,20);
		// sum *2
		System.out.println(sum*2);
		
		// h2 결과 출력
		boolean result = hap.h2(21);
		System.out.println(result);
		
		// h3 length 출력
		int [] ar = hap.h3(3);
		System.out.println(ar.length);
		

	}

}
