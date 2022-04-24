package com.day3;

import javax.swing.JFrame;

public class JFrameTest_4 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 600; // 변수 선언. 타입 변수명(마음대로) = 값
	int height = 400;
	
	String name = "김민지";
	public void initDisplay() {
		
		System.out.println("initDisplay 호출 성공");
		
		jf.setSize(width,height); // 오버라이딩, 덮어쓰기 / 가로 세로 창 크기 지정
		jf.setTitle(name); // 상단바?에 뭐 적을지. 변수 사용하면 다양하게 변하는 정보 사용 가능
//		jf.setTitle("김민지"); // 문자열 상수. 고정값
		jf.setLayout(null);		
		jf.setVisible(true);
		
		
	} // end of initDisplay
	public static void main(String[] args) {
		JFrameTest_4 jft = new JFrameTest_4();
		jft.initDisplay();
	} // end of main

} // end of JFrameTest
