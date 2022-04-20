package com.day3;

import javax.swing.JFrame;

public class JFrameTest_5 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 600; // 변수 선언. 타입 변수명(마음대로) = 값
	int height = 400;
	String name = "김민지";
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jf.setSize(width,height); 
		jf.setTitle(name); 
		jf.setLayout(null);		
		jf.setVisible(true);
	} // end of initDisplay
	
	// javac JFrameTest_5.java -> 저장하는 순간 컴파일
	// java JFrameTest_5 "홍길동" "강감찬" "이순신" - 한 번에 세 개 담을 수 있음 - 배열
	// -> run configuration에서 main class JFrameTest_5로 설정하고 argument에 내용 입력
	public static void main(String[] args) {
		JFrameTest_5 jft = new JFrameTest_5();
		jft.initDisplay();
		for(int i=0;i<3;i=i+1) { // i는 0에서 시작, 그 다음에 1, 2
			System.out.println(args[i]); 
		}
	} // end of main

} // end of JFrameTest

/* 
	한 번에 하나만 담을 수 있다
	같은 타입만 담을 수 있다
	타입이 갖고 있는 크기만큼만 담을 수 있다
	
	배열을 사용하면 한 번에 여러 개를 담을 수 있다
	
	변수 - 배열 - 객체 배열 - List or Map 자료 구조 - 쿠키와 세션
*/

/* 파라미터(=매개 변수): 함수를 정의할 때 사용되는 변수 / 인수: 매개 변수에 실제로 담기는 값
	args라는 배열에 자리 잡은 매개 변수에 run configuration의 argument를 사용하여 "~" "~" 형식으로 파라미터 전달
*/