package example.thread2;

public class HighChef {
	public void mainMenu() {
		System.out.println("주메뉴를 만들기 시작합니다.");
		try {
			Thread.sleep(5000);
		} catch(Exception e) {}
		System.out.println("주메뉴 완성");
	}
	
	public void orderSubMenu() {
		MiddleChef mcf = new MiddleChef();
		mcf.subMenu();
		mcf.boil();
		
		LowChef lcf = new LowChef();
		lcf.rice();
		lcf.ingredient();
		lcf.side();
	}
}
