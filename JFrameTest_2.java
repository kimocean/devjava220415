package com.day3;

import javax.swing.JFrame; // GUI 구현하기 위해 JDK에서 제공하는 툴킷

public class JFrameTest_2 {
	// 선언부
	JFrame jf = new JFrame(); // static 아닌데 왜 인스턴스화??
	int width = 600;
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공");
		jf.setSize(300,400);
		jf.setSize(width,400); // 오버라이딩, 덮어쓰기
		jf.setLayout(null);
		jf.setVisible(true);
		
	} // end of initDisplay
	public static void main(String[] args) {
		JFrameTest_2 jft = new JFrameTest_2();
		jft.initDisplay();
	} // end of main

} // end of JFrameTest
