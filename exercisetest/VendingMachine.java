package exerciseTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class VendingMachine {
	int price[] = new int[5];
	String menu[] = new String[5];
	int input;
	int select;
	boolean program = true;
	int min = 9999;

	public VendingMachine() { // 생성자로 자판기 초기화
		menu[0] = "콜라";
		price[0] = 1200;
		menu[1] = "오렌지주스";
		price[1] = 900;
		menu[2] = "초코우유";
		price[2] = 700;
		menu[3] = "생수";
		price[3] = 500;
		menu[4] = "커피";
		price[4] = 1100;
		for(int i=0;i<price.length;i++) {
			if(min > price[i]) {
				min = price[i];
			}
		}
		System.out.println("============자판기============");
		for (int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + ". " + menu[i] + " : " + price[i] + "원");
		}
		System.out.println("============자판기============");
		System.out.println("돈을 넣어 주세요.");
		Scanner scan = new Scanner(System.in);
		input = scan.nextInt();
		userInput(input);
	}

	public void userInput(int input) {
		loop1:
		while (program == true) {
			int count = 0;
		System.out.println("투입한 금액은 " + input + "원입니다.");
		while(input <= min) { // 최소 금액보다 투입 금액이 작을 때
			System.out.println("잔액이 부족합니다. 돈을 추가로 넣으시겠습니까? 1. 투입 2. 종료");
			System.out.println("현재 금액 : " + input + "원");
			Scanner scan3 = new Scanner(System.in);
			int ans = scan3.nextInt();
			if(ans == 1) {
				System.out.println("투입할 금액을 입력해 주세요.");
				input += scan3.nextInt();
				continue;
			} else if (ans == 2) {
				System.out.println("프로그램을 종료합니다.");
				break loop1; // 여기서 문자 와안전히 빠져나가야 하는데 어떻게?
			}
		}
		
		System.out.println("============구매 가능============");
		for (int i = 0; i < menu.length; i++) {
			if (price[i] <= input) {
				System.out.println(i + 1 + ". " + menu[i] + " : " + price[i] + "원");
				count++;
			}
		}
			System.out.println("구매할 상품의 번호를 입력해 주세요.");
			Scanner scan = new Scanner(System.in);
			select = scan.nextInt();
			while(input <= min) { // 최소 금액보다 투입 금액이 작을 때
			System.out.println("잔액이 부족합니다. 돈을 추가로 넣으시겠습니까? 1. 투입 2. 종료");
			System.out.println("현재 금액 : " + input + "원");
			Scanner scan3 = new Scanner(System.in);
			int ans = scan3.nextInt();
			if(ans == 1) {
				System.out.println("투입할 금액을 입력해 주세요.");
				input += scan3.nextInt();
				continue;
			} else if (ans == 2) {
				System.out.println("프로그램을 종료합니다.");
				break loop1; // 여기서 문자 와안전히 빠져나가야 하는데 어떻게?
			}
		}
			input = input - price[select - 1];
			System.out.println(menu[select - 1] + "이 구매되었습니다.");
			System.out.println("잔액은 " + input + "원입니다.");
			System.out.println("1. 계속 구매하기 2. 돈 추가 투입 3. 거스름돈 반환 + 프로그램 종료");
			Scanner scan1 = new Scanner(System.in);
			int s = scan1.nextInt();
			if (s == 1) {
				continue;
			} else if (s == 2) {
				System.out.println("투입할 금액을 입력해 주세요.");
				Scanner scan2 = new Scanner(System.in);
				input += scan2.nextInt();
				System.out.println("잔액은 " + input + "원입니다.");
				continue;
			} else if (s == 3) {
				System.out.println("거스름돈은 " + input + "원입니다.");
				program = false;
			}
			System.out.println("프로그램을 종료합니다.");
		}
	}
	
	
	
	public void admin() {
		
	}

	public static void main(String[] args) {
		new VendingMachine();
	}

}
