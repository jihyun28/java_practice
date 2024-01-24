package example.thread3;

public class LowChef implements Runnable {

	@Override
	public void run() {
		side();
		rice();
		ingredient();
	}
	
	public void side() {
		System.out.println("반찬을 만들기 시작합니다.");
		try {
			Thread.sleep(2000);
			System.out.println("반찬 완성");
		} catch(Exception e) {}
	}
	
	public void rice() {
		System.out.println("밥을 짓기 시작합니다.");
		try {
			Thread.sleep(10000);
			System.out.println("밥 완성");
		} catch(Exception e) {}
	}
	
	public void ingredient() {
		System.out.println("재료 손질을 시작합니다.");
		try {
			Thread.sleep(3000);
			System.out.println("재료 손질 완성");
		} catch(Exception e) {}
	}
}
