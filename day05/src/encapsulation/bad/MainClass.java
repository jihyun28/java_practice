package encapsulation.bad;

public class MainClass {

	public static void main(String[] args) {
		// 같은 패키지 내부 클래스파일을 가져다 쓸 때는 import 필요 없음
		MyBirthday b = new MyBirthday();
		
		b.year = 2024;
		b.month = 13;  // 13월을 넣어도 그냥 동작
		b.day = 32;    // 32일을 넣어도 그냥 동작
		
		b.showDateInfo();
	}
}