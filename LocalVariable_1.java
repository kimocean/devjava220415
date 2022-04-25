package com.week1;

public class LocalVariable_1 {
	void methodA(double d) { // 메소드 파라미터 내의 변수는 지역 변수. 호출할 때 초기화됨.
		System.out.println("methodA 호출 성공 " + d);
	}
	
	public static void main(String[] args) {
		LocalVariable_1 lv = new LocalVariable_1();
		double avg = 85.8; // 초기화
		lv.methodA(avg); // 로컬베리어블클래스에 있는 논스태틱 메소드에이 사용하기 위한 인스턴스화
		// 이 자리에서 sop(d) 하게 되면 지역 변수 불러 올 수 없어서 에러 발생.
	}
}
