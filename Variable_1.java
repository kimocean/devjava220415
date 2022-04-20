package com.day4;

public class Variable_1 {
	int age = 20; // 선언부에 선언한 전역 변수
	void methodA() {
		double pi = 3.14; // methodA 메소드에 선언한 지역변수. 실수는 double 타입으로 선언
		age = 30; // 지역변수. int 생략 이유 : 위에 int age는 전역인데 여기에도 int 붙이면 전역 변수 불러오는 것이 됨.
	}
	
	// 디버깅: f6 누르면 메소드 건너 뛰기, f5 누르면 메소드 내로 들어감
	public static void main(String[] args) { // break point는 메인 메소드가 시작되는 부분에 체크.
		Variable_1 v1 = new Variable_1(); // 메모리에 참조하게 하고 싶을 때 생성.
		// 인스턴스화: 메모리에 로딩됨, 상주됨
		// 인스턴스화 하게 되면 변수와 메소드를 누릴 수 있다.
		System.out.println("before : "+v1.age);
		v1.methodA(); // 왜 v1이 붙었는지 -> 논스태틱메소드 스태틱 내에서 사용하려고
		// 전역변수에서 선언된 20 age를 methodA 선언 후 지역변수 적용되어 30 age로 오버라이딩
		// 메소드 호출할 때는 ; 붙인다
		System.out.println("after : "+v1.age);		
	} // end of main
}

/* run configuration의 메인 클래스 역할?
	configuration: 배열, 환경 설정.
	main class는 실행할 클래스. parameter.java에서 배열에 넣을 때 메인 클래스를 파라미터.자바 설정해 줘야 파라미터 클래스 내의 배열에 argument에 입력한 내용 들어감

	선언부: 첫 번째 줄을 의미하는 건데 선언부에 변수 선언은 선언부 바로 아래에서도 적용되는 듯. 반환타입 메서드 이름 (타입 변수명, ...) {}
	구현부: {} 안의 내용. 호출했을 때 수행되는 문장.
	전역 변수: 클래스 선언부 바로 아래에 선언되는 변수. 다른 클래스/메소드에서 사용 가능.
	지역 변수: 메소드 내에서 선언되는 변수. 메소드가 끝나면 지역 변수도 끝.
 */