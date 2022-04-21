package com.day4;

public class Variable_1_1 {
	int age = 20; // 선언부에 선언한 전역 변수
	void methodA() {
		double pi = 3.14; // methodA 메소드에 선언한 지역변수. 실수는 double 타입으로 선언
		int age = 30; // 지역변수. int 붙으면 이름 같고 속성 다른 전역/지역 age가 됨.
	}
	
	public static void main(String[] args) { // break point는 메인 메소드가 시작되는 부분에 체크.
		Variable_1_1 v11 = new Variable_1_1(); // 메모리에 참조하게 하고 싶을 때 생성.
		// 인스턴스화: 메모리에 로딩됨, 상주됨. 인스턴스화 하게 되면 변수와 메소드를 누릴 수 있다.
		System.out.println("before : "+v11.age);
		v11.methodA(); // 왜 v1이 붙었는지 -> 논스태틱메소드 스태틱 내에서 사용하려고
		// 전역변수에서 선언된 20 age를 methodA 선언 후 지역변수 적용되어 30 age 됨.
		System.out.println("after : "+v11.age);	// 인스턴스화된 전역 변수 & methodA의 int age 값이 덮어쓰기 되는 건 아님.
	} // end of main
}

// 전역 int age랑 지역 int age는 이름만 같고 성질이 다름. 그래서 methodA 호출하면 지역 int age가 30 되는 거고 sop에서 부르는 age는 전역 int age임.