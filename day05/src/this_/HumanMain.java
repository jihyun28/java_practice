package this_;

public class HumanMain {
	public static void main(String[] args) {
		Human kim = new Human("김자바", 20);
		kim.showInfo();
		
		Human park = new Human("박코딩");
		park.showInfo();
		
		Human noname = new Human();
		noname.showInfo();
	}
}
