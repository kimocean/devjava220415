package com.day5;

import com.day4.Variable_8; // v8 내용 가져오기

public class Variable_8App {

	public static void main(String[] args) {
		Variable_8 v8 = new Variable_8(); // 객채 생성과 동시에 생성자 호출. 없어도 사용 가능한데 이게 true로 바꾸는 역할. 생성자에 isOk = true; 있으니까.
		System.out.println(Variable_8.isOk); // 다른 패키지에선 사용 불가했는데 isOk 접근제한자 public 붙여 주면 사용 가능.
		// false 나오는 이유: 전역 변수인 isOk가 넘어온 것. main의 isOk는 main 메소드 내에서만 true.
		// true 가지고 오려면
	}

}

/*	생성자 호출 양식
	클래스명 변수명 = new 클래스이름(전달값);
	생성자는 위의 표현식을 통해 객체의 생성과 함께 실행됨.
*/