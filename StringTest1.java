package com.day6;

import javax.swing.JButton;

public class StringTest1 {

	public static void main(String[] args) {
		StringTest1 st1 = new StringTest1();
		JButton jbtn = new JButton("북쪽"); // 자바에서 제공하는 클래스. 개발자 의도와 상관없이 값을 출력하는 경우 있음. 그래서 결과가 다르게 출력됨. 
		System.out.println("StringTest1: " + st1);
		System.out.println("StringTest1: " + st1.toString());
		String s = new String("좋은 아침입니다."); // 괄호 내에 뭐가 들어가는 인스턴스화랑 아닌 것 차이가 뭐임?
		String s1 = new String("좋은 아침입니다."); // 괄호 내에 뭐가 들어가는 인스턴스화랑 아닌 것 차이가 뭐임?
		System.out.println("String: " + s); // s는 참조형 변수
		System.out.println("String: " + s1); // s는 참조형 변수
		// s와 s1의 주소 번지는 다름.
		if (s==s1) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
		if (s.equals(s1)) {
			System.out.println("같다");
		}
		else {
			System.out.println("다르다");
		}
	}

}
