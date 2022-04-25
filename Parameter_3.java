package com.week1;

public class Parameter_3 {
	static Dog methodA(Dog myDog) { 
		// 같은 이름의 변수로 new를 사용해서 객체를 생성하게 되면 타입은 같지만 새로운 주소 번지를 갖게 된다. 이것은 서로 다른 객체라는 의미로 받아들여야 한다.
		System.out.println("methodA " + myDog); // 메인에서 인스턴스화한 myDog와 같은 주소 출력.
		return null;
	}
	public static void main(String[] args) {
		Dog myDog = new Dog(); 
		System.out.println("main " + myDog); // 특정 값을 넣은 게 아님. 참조 변수 선언한 거라 주소 번지 출력.
		methodA(myDog); // static으로 선언된 메소드라 가능
	}

}

// 스택에서는 지역 변수. 힙(클래스?)에서는 전역 변수.