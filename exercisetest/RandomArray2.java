package exerciseTest;

import java.util.ArrayList;
import java.util.List;

public class RandomArray2 {

	public RandomArray2() { // 디폴트 생성자

	}

	List<String> list = new ArrayList<>();
	List<String> poList = new ArrayList<>();
	List<String> neList = new ArrayList<>();

	public void setList() { // list에 랜덤 숫자 10개 넣기
		for (int i = 0; i < 10; i++) { // 0~9라 i<10 하면 숫자 10개 뽑힘.
			list.add((int)(Math.random() * 21) - 10 + ""); // List에는 String만 넣을 수 있어서 공백 문자열인 "" 붙여 주면 int가 String 됨
		}
	}
	
	public void Grouping() {
		for (int i = 0; i < list.size(); i++) { // 0부터 list.size인 9까지 반복문
			if(Integer.parseInt(list.get(i)) >= 0) { // String 형식인 list 내용물을 int형으로 바꾸기 위해 Integer.parseInt(문자열) 사용
				poList.add(list.get(i)); // poList에 list의 i번째를 저장
//				System.out.println(i + " 양수 " + list.get(i)); // list의 i번째는 양수고 결과값 출력
			} else { // list의 i번째 값이 0보다 크거나 같지 않을 때 = 음수일 때
				neList.add(list.get(i)); // neList에 list의 i번째를 저장
//				System.out.println(i + " 음수 " + list.get(i)); // list의 i번째는 음수고 결과값 출력
			}
		}
	}
	
	public String sum() {
		int poSum = 0; // poList 담아서 더할 변수 설정
		int neSum = 0; // neList 담아서 더할 변수 설정
		
		for(int i=0;i<poList.size();i++) { // poList 양수 리스트 크기만큼 반복문 실행. 고정 길이 정해진 배열과는 달리 양수 숫자와 딱 맞음
			poSum += Integer.parseInt(poList.get(i)); // poList에 들어 있는 String형 int형으로 변환하여 poSum에 더해 넣음
		}
		System.out.println("양수의 개수: " + poList.size()); // poList(양수의 개수) 출력
		System.out.println("양수 리스트: " + poList); // 양수 목록 출력
//		System.out.println("양수의 합: " + poSum); // 양수의 합 출력
		
		for(int i=0;i<neList.size();i++) { // neList 양수 리스트 크기만큼 반복문 실행
			neSum += Integer.parseInt(neList.get(i)); // neList에 들어 있는 String형 int형으로 변환하여 neSum에 더해 넣음
		}
		System.out.println("음수의 개수: " + neList.size()); // neList의 길이(음수의 개수) 출력
		System.out.println("음수 리스트: " + neList); // 음수 목록 출력
//		System.out.println("음수의 합: " + neSum); // 음수의 합 출력
		
		return ("양수의 합: " + poSum + ", 음수의 합: " + neSum); // 반환 타입 바꾸려고 리턴 값 줘 봄
	}
	
	public static void main(String[] args) {
		RandomArray2 ra2 = new RandomArray2();
		ra2.setList();
		ra2.Grouping();
		System.out.println(ra2.sum()); // 리턴 없으면 sum해도 외부로 출력 안 됨... sop 필요
	}
}
