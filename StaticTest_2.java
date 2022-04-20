package com.basic;

public class StaticTest_2 {
	int age = 30;
	public static void main(String[] args) {
		// 아래 코드를 어떻게 바꾸면 30이 나올지?
//		StaticTest st = new StaticTest();
		StaticTest_2 st2 = new StaticTest_2();
//		System.out.println(st.age); 
		System.out.println(st2.age); 
	} // end of main

} // end of StaticTest
