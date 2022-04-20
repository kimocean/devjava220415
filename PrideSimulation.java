package com.day4;

class Pride {
	int speed = 0; //  클래스 선언부에 선언된 전역 변수
	String carColor = "red"; // 전역 변수
	public void stop() { // 퍼블릭: 다른 클래스에서도 접근하기 위한 접근제한자
		speed = speed - 1;
	}
}

public class PrideSimulation {
//	static int abc = 5;
	public static void main(String[] args) {
		Pride herCar = new Pride();
		System.out.println(herCar.carColor); // 전역변수 카컬러 - 선언된 클래스인 프라이드가 아닌 프라이드시뮬레이션 클래스에서도 사용 가능
		herCar.speed = 70; // 오버라이딩. 0과 70 동시에 기억 불가.
		herCar.stop(); // 메소드 소출
		System.out.println(herCar.speed);
//		System.out.println(abc); // 같은 클래스 내에서만 static 붙은 것 인스턴스화 없이 사용 가능
	}

}

/* 	void는 return이 없어서 사용하는 것.
	public String getName() { return name; } 에서는 name이 String이라 void 자리에 String 들어감.
	public void setName(String name) { this.name = name; } 에서는 대입만 있고 return 없어서 void 사용.

*/