package com.day3;

public class JFrameTest {
	// 선언부
	
	// 화면 처리부 - non-static 타입(void 앞에 static 없음)의 메소드 선언
	// non-static 메소드는 메인 메소드 안에서 호출 불가
	// 꼭 사용하고 싶으면? - 인스턴스화 거쳐야 함
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
	} // end of initDisplay
	// 메인 메소드 - 실행할 수 있다, exe 파일로 만들 수 있다, 가장 먼저 실행됨
	// entry point - main thread이다
	// 15-16-17-9-10-11-18
	public static void main(String[] args) {
		JFrameTest jft = new JFrameTest(); // 인스턴스화 - 클래스명 변수명 = new 클래스명();
		jft.initDisplay(); // 변수명.메소드명();
	} // end of main

} // end of JFrameTest
