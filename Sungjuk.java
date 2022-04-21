package com.day5;

public class Sungjuk {
	int kor=90;
	int eng=95;
	int math=60; // 셋 다 전역 변수
	
	int total() { // 합계 구하는 메소드.
		int hap=0;
		hap = kor+eng+math;
		return hap; // return 있어서 void 대신 int total 됨
	}
	double average (int hap) { // 평균은 나누기라 소수점 때문에 double 사용. hap은 어차피 위에서 int라 여기서도 int.
		double avg = hap / 3.0;
		return avg;
	}
	public static void main(String[] args) {
		Sungjuk sj = new Sungjuk(); // sj가 참조형 변수로 호출하면 주소번지가 출력됨. 클래스 내에 선언된 변수나 메소드를 누릴 때 사용
		int hap = sj.total(); // static인 메인 메소드 밖의 넌스태틱 total 메소드 찾아와야 해서 인스턴스화
		System.out.println(hap); // 바로 위에서 int hap 정의? 선언? 했으니 sj 안 붙여도 됨
		double avg = sj.average(hap); // 스태틱인 메인 메소드 밖에 있는 넌스태틱 어베리지 메소드 사용하기 위해 인스턴스화
		System.out.println(avg); // hap랑 마찬가지
		System.out.println(sj.kor);
		System.out.println(sj.eng);
		System.out.println(sj.math); // kor, eng, math는 메인 메소드 안에서 정의된 적 없고 클래스에서만 선언된 전역 변수라 인스턴스화 필요.
	}

}
