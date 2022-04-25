package com.week1;

public class Parameter_2 {
	static Dog methodA(Dog myDog) { // static 메소드. 인스턴스화 없이 호출 가능.
		Dog yourDog = new Dog(); // 새로운 복제본. 인스턴스화가 일어남. yourdog.leg는 0 new 뒤의 Dog();은 뭐임? 참조 변수 타입?
		System.out.println("methodA의 myDog.leg ==> "+myDog.leg);
		myDog.leg = 2;
		return yourDog;
	}
	public static void main(String[] args) {
		Dog myDog = new Dog(); // dog 클래스에 mydog 변수로 인스턴스화.
		myDog.leg = 4; // leg는 파라미터1의 클래스 dog에서 가져옴
		Dog yourDog = methodA(myDog); // 참조형 변수 yourdog 선언. static 메소드라 인스턴스화 없이 호출함. 파라미터가 myDog. 11에서 선언한 거.
		System.out.println("main myDog.leg ==> "+myDog.leg);
		System.out.println("main yourDog.leg ==> "+yourDog.leg);
	}

}

// 스택에서는 지역 변수. 힙(클래스?)에서는 전역 변수.