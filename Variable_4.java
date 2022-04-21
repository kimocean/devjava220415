package com.day4;

public class Variable_4 {
	int age = 20; // 전역 변수.
	// 지역 변수가 갖는 값을 다른 메소드에서 사용할 때 리턴 타입을 사용함. 이 뭔 소리임?
	int methodA(int age) {// 50. 지역 변수 int age. 
		age = 30; // 30으로 값 변경.
		return age; // return이 생겨서 void 대신 int methodA가 됨. 저 자리가 int기 때문에 return에도 int만 들어올 수 있음.
	}
	public static void main(String[] args) {
		Variable_4 v4 = new Variable_4();
		System.out.println("before : "+v4.age); // 20. 인스턴스화된 전역 변수.
		int age = v4.methodA(50); // 단순히 메소드 실행이 아니라 main 내에서 int age를 새로 정의. 그 값은 methodA(50)으로 초기화.
		System.out.println("after : "+age); // 30. 이건 바로 위에서 int age 정의해 줘서 v4 없이 사용 가능.
		System.out.println("after : "+v4.age); // 20. v4 붙이면 전역 변수 20 가져옴.
	}
}