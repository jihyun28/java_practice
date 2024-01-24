package example.thread2;

public class LowChef {
	
	public void side() {
		System.out.println("반찬을 만들기 시작합니다.");
		try {
			Thread.sleep(2000);
		} catch(Exception e) {}
	}
	
	public void rice() {
		System.out.println("밥을 짓기 시작합니다.");
		try {
			Thread.sleep(10000);
		} catch(Exception e) {}
	}
	
	public void ingredient() {
		System.out.println("재료 손질을 시작합니다.");
		try {
			Thread.sleep(3000);
		} catch(Exception e) {}
	}
}
