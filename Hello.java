package com.basic;
// ctrl+s 누르면 저장과 동시에 javac Hello.java -> Hello.class
// java Hello 엔터
// public은 접근 제한자
// public > protected > friendly(default) > private 예약어
// 접근 제한자 public 같은 예약어는 변수명으로 사용 불가
// class는 클래스 선언시 사용하는 예약어
public class Hello {
	// 선언부 - 변수 선언 및 초기화 가능
	// 변수와 메소드를 선언할 수 있다
	// 변수 선언을 통해서 데이터를 담을 수 있다
	// 변수타입 변수명 대입연산자 값
	int age = 25; // 초기화
// 클래스 영역
// 클래스 안에는 변수와 메소드가 살고 있음
	// 변수에는 데이터(숫자, 문자열, 참 또는 거짓)를 담는다
	
	// 메인 메소드가 있어야 exe파일로 만들 수 있다
	// 메인 메소드가 entry point이다 - 제일 먼저 실행됨
	// 코드가 많아도 가장 먼저 실행되는 곳이 main 메소드
	// entry point이다
	// 메소드와 변수 구분: 이름 뒤에 괄호가 있으면 메소드
	// static 영역에서는 non-static변수나 메소드는 사용 불가
	public static void main(String[] args) {
		// system이 가리키는 건 내가 사용 중인 pc
		// out변수는 출력장치를 의미
		// println은 출력 기능을 담당하는 '메소드'이다
		// 어디에 출력? - 콘솔창에
		// 출력을 해야 소통할 수 있다
		System.out.println("Hello World");
	} // end of main method - 기능, 처리, event

} // end of hello -  사용자 정의 클래스 선언 및 구현이 끝나는 것
