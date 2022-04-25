package com.week1;

class Dog {
	int leg = 0; // 전역 변수. 초기화 생략 가능. 다만 다른 클래스에서 사용할 때는 인스턴스화 필요?
}

public class Parameter_1 { 
	
	static void methodA(Dog myDog) { // 사용자 정의 메소드 -> 기능 담당. 파라미터로 주소 번지를 받을 수 있다.
		System.out.println(myDog.leg); // 4
		myDog.leg = 2; 
	}
	
	public static void main(String[] args) {
		Dog myDog = new Dog(); // Dog 클래스를 메모리에 만들었다. 인스턴스화함으로써. static 없이 사용 가능. myDog라는 참조변수.
		myDog.leg = 4; // 외부 클래스라 전역 변수라도 참조변수명 붙여서 초기화
		methodA(myDog); // 메소드에이에 myDog라는 변수를 넣은 거. 파라미터로 주소 번지를 넣었다. 뭐의 주소 번지를 넣은 거?
		System.out.println(myDog.leg); // 2. 주소 번지 내에 있는 걸 변경한 거라 값 바뀜.
	}

}

// 원시형 변수의 파라미터는 값. 참조형 변수는 주소 번지.
