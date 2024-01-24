package example.thread3;

public class HighChef implements Runnable {

	@Override
	public void run() {
		System.out.println("후임들에게 일하라고 시킵니다.");
		try {
			Thread.sleep(1000);
			mainMenu();
		} catch(Exception e) {}
	}
	
	public void mainMenu() {
		System.out.println("주메뉴를 만들기 시작합니다.");
		try {
			Thread.sleep(5000);
			System.out.println("주메뉴 완성");
		} catch(Exception e) {}
	}
}
