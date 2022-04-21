package com.day4;

public class Variable_5 {
	int age 	= 20; // 전역 변수
	// 변수 선언 앞에 static이 있으면 정적변수라고 함 - 클래스 급
	// 인스턴스화 없이 호출할 수 있다.
	// 단 선언된 클래스 외부에서 접근할 때는 선언된 클래스 타입.변수명 으로 호출 가능
	static int height 	= 170; // 정적 변수. 전역의 성격을 가지면서 동시에 외부 클래스에서 호출 가능
	public static void main(String[] args) {
		Variable_5 v1 = new Variable_5();
		System.out.println(v1.age); // static 밖에 있는 전역 변수 불러 오기 위해 인스턴스화
		System.out.println(height); // static 붙은 정적 변수는 인스턴스화 없이도 사용 가능.
		System.out.println(Variable_5.height); // 앞에 클래스명 붙여도 괜찮음. static 변수라 없어도 기능함.
	}
}

/*
	primary data type - 원시형 변수
	reference type - 참조형 변수


	전역변수를 선언부에 선언하면 초기화 생략 가능 -> 디폴트 값 출력.
	디폴트 값: int=0, double=0.0, boolean=false, 참조형 변수=null

*/

