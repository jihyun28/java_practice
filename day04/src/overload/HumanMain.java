package overload;

public class HumanMain {

	public static void main(String[] args) {
		// void 생성자
		Human h1 = new Human();
		System.out.println("이름: " + h1.name);
		System.out.println("나이: " + h1.age);
		
		// (String, int) 생성자
		Human h2 = new Human("가", 23);
		System.out.println("이름: " + h2.name);
		System.out.println("나이: " + h2.age);
	}
}
