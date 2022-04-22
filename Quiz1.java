package com.quiz;

import javax.swing.JOptionPane;

public class Quiz1 {

	public static void main(String[] args) {
		String userWeight = null; // 지구 몸무게
		userWeight = JOptionPane.showInputDialog("당신의 몸무게는 얼마입니까?");
		double moon_weight = 0.0; // 달의 몸무게 담는 변수
		double earth_weight = Double.parseDouble(userWeight); // 메소드의 파라미터에 String을 주면 double 타입으로 형변환하는 메소드.
		System.out.println(earth_weight*(17/100.0));
		moon_weight = earth_weight*(17/100.0);
		System.out.println(moon_weight);
	}

}
