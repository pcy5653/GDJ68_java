package com.iu.study5.s1;

// Animal을 상속받은 조류
// 데이터타입 : Bird, Animal, Flyable(인터페이스)
public abstract class Bird extends Animal implements Flyable{
	
	int wing;
	
	//조류마다 나는 행위가 다르다.
	// 명령어를 interface에 생성
	//public abstract void fly();
}
