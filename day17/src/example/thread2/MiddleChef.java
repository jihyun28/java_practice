package example.thread2;

public class MiddleChef {

	public void subMenu() {
		System.out.println("부메뉴를 만들기 시작합니다.");
		try {
			Thread.sleep(3500);
		} catch(Exception e) {}
	}
	
	public void boil() {
		System.out.println("국을 끓이기 시작합니다.");
		try {
			Thread.sleep(2500);
		} catch(Exception e) {}
	}
}
