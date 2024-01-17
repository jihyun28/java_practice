package exception.runtime;

public class NullPointerEx {
	public static void main(String[] args) {
		String str = null;
		//str = "HELLO";
		
		// .toLowercase()는 모든 문자를 소문자로 만들어줌
		System.out.println(str.toLowerCase());
	}
}
