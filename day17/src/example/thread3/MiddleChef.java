package example.thread3;

public class MiddleChef implements Runnable {

	@Override
	public void run() {
		subMenu();
		boil();
	}
	
	public void subMenu() {
		System.out.println("부찬을 만들기 시작합니다.");
		try {
			Thread.sleep(5000);
			System.out.println("부찬 완성");
		} catch(Exception e) {}
	}
	
	public void boil() {
		System.out.println("국을 끓이기 시작합니다.");
		try {
			Thread.sleep(6000);
			System.out.println("국 완성");
		} catch(Exception e) {}
	}
}
