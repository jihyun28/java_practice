package example.thread4;

public class ThreadNotSafety extends Thread {

	// static으로 선언된 변수는 자동으로 0 할당
	static int share;
	
	public static void main(String[] args) {
		ThreadNotSafety t1 = new ThreadNotSafety();
		ThreadNotSafety t2 = new ThreadNotSafety();

		t1.start();
		t2.start();
	}
	
	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			System.out.println(share++);
			
			try {Thread.sleep(10);}
			catch(Exception e) {}
		}
	}
}
