package com.day4;

public class Variable_8 {
	public static boolean isOk; // boolean의 기본값은 false. 변수 선언 시 타입 앞에 static 붙이면 인스턴스화 없이 사용 가능.
	
	public Variable_8() { // 파라미터(괄호 안 값)가 없는 디폴트 생성자 구현
		System.out.println("Variable_8 디폴트 생성자 호출 성공"); // 생성자 호출되면 이거 출력하
		isOk = true; // 값 true로 바뀜.
	}
	public static void main(String[] args) {
	
		System.out.println(isOk); // false 출력
		isOk = true; // static 변수(정적 변수)라 인스턴스화 없이 사용
		System.out.println(Variable_8.isOk); // 클래스명.변수명 이렇게 써도 됨.
	}

}
