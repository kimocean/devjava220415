package com.day4;

public class Variable_7 {
	void methodA() {
		
	}
	int methodB() {
		int x = 5;
		int y; // 지역 변수는 선언만 하는 것 불가능. 초기화까지 해야 함.
		y = x; // 지역 변수 초기화
//		return 0;
		return y;
	}
	public static void main(String[] args ) {
		Variable_7 v7 = new Variable_7();
//		int x = v7.methodA(); // void 있는 건 반환값이 없으므로 x에 대입할 것도 없음.
		int x = v7.methodB();
		v7.methodA(); // 실행해도 결과값 없어서 반환값 없음.
		System.out.println(x); // 5. 지역 변수 int x = v7.methodB(); 값 반환.
	}
}
