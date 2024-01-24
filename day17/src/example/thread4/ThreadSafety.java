package example.thread4;

public class ThreadSafety extends Thread {
	
	static int share;
	
	public static void main(String[] args) {
		ThreadSafety t1 = new ThreadSafety();
		ThreadSafety t2 = new ThreadSafety();
	
		t1.start();
		t2.start();
	}
	
	// 쓰레드 안전을 위해서 사용하는 키워드
	public synchronized static void sharePlus() {
		System.out.println(share++);
	}
	
	@Override
	public void run() {
		for(int cnt = 0; cnt < 10; cnt++) {
			sharePlus(); // 동시성 제어가 되는 메서드로 1씩 증가
			try {Thread.sleep(1);}
			catch(Exception e) {}
		}
	}
}
