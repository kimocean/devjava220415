package com.day4;

public class Variable_6 {
	// 전역 변수는 초기화 생략 가능, 지역 변수는 초기화 생략 불가능
	int i; // 전역 변수
	void methodA(int i) { // 파라미터를 받아 오는 메소드.
		System.out.println(i);
	}

	public static void main(String[] args) {
		int i; // 변수 선언. 메인 메소드 내에 있는 지역 변수.
		i = 10; // 변수의 초기화
		Variable_6 v6 = new Variable_6();
		v6.methodA(i); // 10. 메인 메소드에서 선언된 지역 변수 돌림.
		i = 100; // 지역 변수 값 변경.
		v6.methodA(v6.i); // 0. 전역 변수 호출하는데 정의 안 되어 있으므로 기본값 0.
	}

}
