package com.day4;

public class Variable_3 {
	int age = 20;
	void methodA(int age) { // 50. 메소드의 파라미터(괄호 안, 여기선 50)도 지역 변수로 침. 호출할 때 지역 변수 값 설정.
		System.out.println("지역변수 : "+age); // 50
		age = 30; // 50이던 age를 30으로 바꿈
		System.out.println("methodA : "+age); // 30. 바로 위에 30으로 바뀐 지역 변수.
		System.out.println("methodAt : "+this.age); // 20 -> this는 해당 클래스의 전역 변수 가지고 오는 생성자?
		
	}
	public static void main(String[] args) {
		Variable_3 v3 = new Variable_3();
		System.out.println("before : "+v3.age); // 20. int age 갖고 옴
		v3.methodA(50);
		System.out.println("after : "+v3.age);	// 20. 인스턴스화된 전역 변수.	
	}
}