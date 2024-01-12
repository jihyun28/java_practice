package day01;

public class IdentifierEx {

	public static void main(String[] args) {
		// 자바의 식별자 이름은 대소문자 구분
		int age = 20;
		int AGE = 30;
		
		System.out.println("age");
		System.out.println("AGE");
		
		//식별자 이름은 숫자로 시작할 수 없음
		int number9 = 9;
		//int 9number = 9;
		
		// 식별자의 이름에는 공백 포함 X
		int birthDay = 88;
		//int birth Day = 88;
		
		//키워드(예약어, 보라색 글씨로 잡히는 것들)는 식별자로 사용 불가
		//int static = 50;
	}

}
