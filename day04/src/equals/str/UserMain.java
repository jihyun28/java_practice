package equals.str;

public class UserMain {
	public static void main(String[] args) {
		// 같은 클래스 안에서 동일한 문자열을 직접 대입하는 형식으로
		// String 객체를 생성할 시 같은 주소값을 공유하게 된다.
		String s1 = "hello";
		String s2 = "hello";
		System.out.println(s1 == s2);
		String s3 = new String("hello");
		System.out.println(s1 == s3);
		
		// 문자열도 참조형 변수이므로 단순 비교는 주소값 비교만 함
		// 주소가 아닌 자료의 동등성을 따질 때는 .equals() 이용
		System.out.println(s1.equals(s3));
	}
}
