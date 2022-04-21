package swing.template;

import javax.swing.JButton;
import javax.swing.JFrame;

// borderlayoutapp.java 소스는 하나인데 클래스는 두 개가 만들어짐
// BorderLayoutView.class랑 BorderLayoutApp.class
class BorderLayoutView{ 
	JFrame jf = new JFrame(); // 내가 만든 프로그램 띄우기 위해 JFrame 부르는 인스턴스화. 전역
	JButton jbtn_north = new JButton("북쪽");
	JButton jbtn_south = new JButton("남쪽");
	JButton jbtn_center = new JButton("중앙");
	JButton jbtn_east = new JButton("동쪽");
	JButton jbtn_west = new JButton("서쪽");
	int width = 700;
	int height = 300;
	public void initDisplay() {
		System.out.println("initDisplay 호출 성공"); // 실행문
		jf.add("North", jbtn_north);
		jf.add("South", jbtn_south);
		jf.add("Center", jbtn_center);
		jf.add("East", jbtn_east);
		jf.add("West", jbtn_west); // 위의 다섯 개 말고 다른 걸 넣으면 이클립스 자체에서는 밑줄 뜨지 않지만 컴파일 오류 생김. jbutton이라는 api? 안에 다섯 개 말고는 없어서 실행 불가
		jf.setSize(width, height); // 메소드 오버로딩
		jf.setVisible(true);
		
	}
}

public class BorderLayoutApp {
	
	public static void main(String[] args) {
		BorderLayoutView blv = new BorderLayoutView(); // 클래스명 변수명 = new 클래스명(); ?이걸 본인 클래스 써야 하나? 아니면 변수 가져올 메소드가 있는 클래스?
		blv.initDisplay(); // 메소드 호출. 주소번지.메소드명();

	}
}