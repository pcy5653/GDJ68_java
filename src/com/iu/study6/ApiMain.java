package com.iu.study6;

public class ApiMain {

	public static void main(String[] args) {
		//객체 생성
		//클래스명 변수명 = new 생성자();
		Object obj = new Object();
		boolean check = obj.equals(null);
		String str = obj.toString();
		int r = obj.hashCode();
		// String타입의 객체선언 및 초기화
		String st ="hello";
		// String타입의 charAt은 메소드중 하나, charAt의 리턴값은 char
		char ch=st.charAt(0);
		System.out.println(ch);
	}

}
