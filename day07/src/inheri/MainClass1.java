package inheri;

public class MainClass1 {

	public static void main(String[] args) {
		// 전사 생성
		Warrior w1 = new Warrior("전사1");
		// 상태 조회
		w1.showStatus();
		// 토끼 생성
		Rabbit r1 = new Rabbit();
		// 전사와 교전 2회
		w1.hunt(r1);
		w1.hunt(r1);
		
		// 쥐 생성
		Rat r2 = new Rat();
		w1.hunt(r2);
		w1.hunt(r2);
		w1.hunt(r2);
		w1.showStatus();
	}
}