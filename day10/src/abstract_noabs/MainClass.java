package abstract_noabs;

public class MainClass {
	public static void main(String[] args) {
		// 2가지 문제점 체크
		// 1. 정식매장이 존재하는데 팝업스토어 생성 가능
		PopupStore ps = new PopupStore();
		
		// 2. 팝업스토어 클래스 내부에서 오버라이딩이 필수인 메서드가 누락될 수도 있음
		PopupStore s = new Store();
		s.orderApple();
		s.orderOrange();
		s.orderGrape();
	}
}
