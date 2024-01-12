package overload;

public class CatMain {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		c1.call();
		c1.call("슈냥");
		
		Cat c2 = new Cat("가","나");
		c2.call();
		c2.call("슈냥");
	}
}
