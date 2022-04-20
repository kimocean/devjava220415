package com.basic;

public class JFrameTest2 {
	// 선언부
	
	// 화면 그리기 - non-static의 메소드
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
	}
	// 11 main 호출-12 인스턴스화-13 메소드 호출-7 메소드 구현 이동-8 sop 출력-9-14-16(종료)
	public static void main(String[] args) {
		JFrameTest2 jft = new JFrameTest2();
		jft.initDisplay();
	}

} // end of JFrameTest