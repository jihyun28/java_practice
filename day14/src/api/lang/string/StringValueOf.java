package api.lang.string;

public class StringValueOf {

	public static void main(String[] args) {
		int a = 10;
		double b = 8.79;
		System.out.println(a + b);
		
		String str1 = String.valueOf(a); // int -> String
		String str2 = String.valueOf(b); // double -> String
		System.out.println(str1 + str2);
	}
}