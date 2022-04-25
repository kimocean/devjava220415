package com.day6;

class Param {
	int ival; // 전역 변수 초기화 생략
}

public class TestParam {
	void effectParam(Param p) {
		p = new Param(); // 이건 왜 쓰는 거? 14번의 Param과 8의 것은 다르다. 타입은 같지만 객체는 서로 다름.
		p.ival = 300;
		System.out.println("sub ival: " + p.ival);
	}
	public static void main(String[] args) {
		TestParam tp = new TestParam(); // TestParam 클래스로 인스턴스화
		Param p = new Param(); // Param 클래스로 인스턴스화
		p.ival = 500; // Param 클래스 부르는 변수를 p로 규정하고 Param의 변수 호출
		tp.effectParam(p); // TestParam 클래스의 effectParam 메소드에 파라미터 p 넣어 호출
		System.out.println("main ival: " + p.ival);
	}

}

/*
	12번: 나 자신에 대한 인스턴스화
	왜? 14번의 effectParam 메소드를 호출하기 위해
	14번에서는 13번에서 인스턴스화된 클래스의 전역 변수인 ival 변수에 초기값 0 대신 500으로 덮어쓰기 발생
	15번 effectParam의 메소드를 경유하게 되는데 이때 13번에서 정의된 객체의 주소 번지를 가지고 7번으로 진입.
	7번의 지역 변수 p와 13의 p는 주소 번지가 같다
	따라서 8번의 ival 변수의 300은 13에서 만들어진 원본 클래스의 전역 변수가 변경되는 것.
*/