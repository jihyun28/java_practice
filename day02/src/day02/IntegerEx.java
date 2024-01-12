package day02;

public class IntegerEx {

	public static void main(String[] args) {
		int maxInt = 2147483647;
		//01111111 11111111 11111111 11111111
		//00000000 00000000 00000000 00000010 +
		//1~~~~~~~ ~~~~~~~~ ~~~~~~~~ ~~~~~~~~
		
		System.out.println(maxInt + 10);
	
		int minInt = -2147483648;
		System.out.println(minInt - 1);
	}

}
