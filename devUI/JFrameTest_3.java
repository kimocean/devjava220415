package com.day3;

import javax.swing.JFrame;

public class JFrameTest_3 {
	// 선언부
	JFrame jf = new JFrame();
	int width = 600;
	int height = (int) (Math.random()*1000)+1;
	public void initDisplay() {
		jf.setSize(width,height); // 오버라이딩, 덮어쓰기 / 가로 세로 창 크기 지정
		jf.setLayout(null); // 배치 관리자(컨테이너에 존재하는 컴포넌트의 위치와 크기를 자동으로 관리)를 지정하지 않는다. 
		jf.setVisible(true); // 화면 상에 보여 주기
		jf.setTitle("김민지"); // 상단바?에 뭐 적을지
//		jf.setLocation(56,311); // 창 켜지는 위치
		jf.setResizable(true); // 창 크기 조절 가능, false는 불가능
		System.out.println("height: " + height); // 랜덤값인 height 값 프린트
		System.out.println("initDisplay 호출 성공");
		
	} // end of initDisplay
	public static void main(String[] args) {
		JFrameTest_3 jft = new JFrameTest_3();
		jft.initDisplay();
	} // end of main

} // end of JFrameTest
