package exerciseTest;

import java.util.Arrays;

public class RandomArray {
	
	public RandomArray() { // 디폴트 생성자
		Random(); // 디폴트 생성자에 메소드 넣었고... 메소드 마지막에 다음으로 이어지는 메소드 실행하게 해서 main 메소드에는 생성자만 있도록 만듦
	}

	int random[] = new int[10]; // -10~10 사이 정수 10개 담을 배열
	int poNum[] = new int[10]; // 양수 담을 배열
	int neNum[] = new int[10]; // 음수 담을 배열 - 양수 음수 비율 일정하지 않으므로 최댓값인 10으로 배열 길이 설정
	
	public void Random() { // -10~10 숫자 열 개 임의로 random[]에 담는 메소드
		for(int i=0;i<random.length;i++) {
			random[i] = (int)(Math.random()*21)-10; // *21: 최댓값-최솟값+1 범위 지정할 때 사용. -10: 최솟값 지정 
		}
//		System.out.println(Arrays.toString(random)); // 배열 출력하는 메소드
		Grouping();
	}
	
	public void Grouping() { // 양수와 음수로 배열 각각 지정해서 나눔
		for(int i=0;i<random.length;i++) {
			if(random[i]>=0) { // i가 양수나 0일 때... 0은 더해도 안 더해도 그만이라 일단 양수 배열에 편입
				poNum[i] = random[i]; // positive number 양수 배열에 넣기
			} else { // 0보다 크거나 같지 않을 때 - 작을 때
				neNum[i] = random[i]; // Negative number 음수 배열에 넣기
			}
		}
//		System.out.println(Arrays.toString(poNum)); // 배열 내용물 출력
//		System.out.println(Arrays.toString(neNum));
		Sum();
	}
	
	public void Sum() { // 각각의 합 구하는 메소드
		int posum = 0; // 양수 배열 숫자들 더하기 위해 담을 변수 설정
		for(int i=0;i<poNum.length;i++) {
			posum += poNum[i];
		}
		System.out.println("양수 합 " + posum);
		
		int nesum = 0; // 음수 배열 숫자들 더하기 위해 담을 변수 설정
		for(int i=0;i<neNum.length;i++) {
			nesum += neNum[i];
		}
		System.out.println("음수 합 " + nesum);
	}
	
	public static void main(String[] args) {
//		RandomArray ra = new RandomArray(); // 생성자만 호출할 거면 인스턴스화가 없어도 되네...
		new RandomArray(); // 하지만 new가 없는 건 안 됨...
	}

}
