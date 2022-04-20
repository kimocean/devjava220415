package com.basic;

public class StaticTest_3 {
	//non-static 타입의 변수 선언 후 초기화
	//변수명 대신 컴퓨터는 메모리의 주소번지로 기억하지만 사람은 주소보다는 변수명 접근이 편리함
	int age = 20; // =는 대입 연산자. 오른쪽 값을 왼쪽에 대입
	static int birth_year = 2000; // 변수 앞에 static 붙이니 기울임꼴 됨 - static타입 변수
	public static void main(String[] args) {
		// insert here - age 변수를 접근할 수 있나? X
		// main 메소드는 선언부에 static이 붙어 있으니까 static 영역
		// 그러나 변수 age 앞에는 static이 없으니까 사용 불가
		// non-static은 static 영역 내에서 사용 불가
		StaticTest_3 st = new StaticTest_3(); // 해결 방법: 인스턴스화하면 static 영역에서도 사용 가능
		System.out.println(st.age);
//		System.out.println(age); static영역의 non-static변수라 사용 불가
		System.out.println(birth_year);
		// 변수 호출하면 주소번지가 아닌 값이 나옴
	} // end of main

} // end of StaticTest
