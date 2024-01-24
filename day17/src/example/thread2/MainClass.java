package example.thread2;

public class MainClass {

	public static void main(String[] args) {
		// 객체 생성 후 할 일 호출 시
		// High 객체가 Middle과 Low에게 일을 시켜놓고 자기도 할 일을 해야 하는데
		// 멀티쓰레드 환경이 아니기 때문에 한 번에 한 객체만 일을 함
		HighChef hcf = new HighChef();
		hcf.orderSubMenu();
		hcf.mainMenu();
	}
}