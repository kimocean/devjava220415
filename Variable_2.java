package com.day4;

public class Variable_2 {
	int age = 20;
	void methodA(int age) { // v1.methodA에서 50을 받아 와서 int age 자리에 넣음. 이 순간에는 지역 변수 age는 50.
		age = 30; // 그래도 age에 30 넣어서 값은 30 출력됨.
	} // 지역 변수 age를 30으로 바꾸는 것. 전역은 손 안 댐.
	public static void main(String[] args) {
		Variable_2 v2 = new Variable_2();
		System.out.println("before : "+v2.age); // 20
		v2.methodA(50);
		System.out.println("after : "+v2.age); // 20. 전역 변수 호출. 이 경우에도 덮어쓰기 안 됨.
	}
}