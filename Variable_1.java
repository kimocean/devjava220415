package com.day4;

public class Variable_1 {
	int age = 20; // 전역 변수는 인스턴스화가 실행되고 나면 그 다음 heap 메모리 내의 클래스 안에서 초기화됨
	void methodA() {
		double pi = 3.14; // methodA 메소드에 선언한 지역변수. 실수는 double 타입으로 선언
		age = 30; // 지역변수. int 없는 age로 정의하면 전역 변수 int age에 덮어 쓰기 가능. 
		System.out.println("after1 : "+age); // 30. 바로 위 지역 변수 age 불러 옴.		
		Variable_1 v1 = new Variable_1();
		System.out.println("after2 : "+v1.age); // 20. 인스턴스화는 무조건 전역 변수만 가능함.
	}
	// 디버깅: f6 누르면 메소드 건너 뛰기, f5 누르면 메소드 내로 들어감
	public static void main(String[] args) { // break point는 메인 메소드가 시작되는 부분에 체크.
		Variable_1 v1 = new Variable_1(); // 메모리에 참조하게 하고 싶을 때 생성.
		// 인스턴스화: 메모리에 로딩됨, 상주됨. 인스턴스화하게 되면 변수와 메소드를 누릴 수 있다.
		System.out.println("before : "+v1.age); // 20. 전역 변수 사용.
		v1.methodA(); // 왜 v1이 붙었는지 -> 논스태틱 메소드 스태틱 내에서 사용하려고
		// 전역변수에서 선언된 20 int age를 methodA 선언 후 지역변수 age 적용되어 30 age로 오버라이딩
		System.out.println("after3 : "+v1.age);	// 30. 전역 변수 20이 methodA 내의 30 만나 30으로 오버라이딩.
	} // end of main
}

/* run configuration의 메인 클래스 역할?
	configuration: 배열, 환경 설정.
	main class는 실행할 클래스. parameter.java에서 배열에 넣을 때 메인 클래스를 파라미터.자바 설정해 줘야 파라미터 클래스 내의 배열에 argument에 입력한 내용 들어감

	선언부: 첫 번째 줄을 의미하는 건데 선언부에 변수 선언은 선언부 바로 아래에서도 적용되는 듯. 반환타입 메서드 이름 (타입 변수명, ...) {}
	구현부: {} 안의 내용. 호출했을 때 수행되는 문장.
	전역 변수: 클래스 영역에 선언되는 변수. 다른 클래스/메소드에서 사용 가능.
	지역 변수: 메소드 내에서 선언되는 변수. 메소드가 끝나면 지역 변수도 끝.
 */