package abstract_abs;

public class Store extends PopupStore {
	@Override
	public void orderApple() {
		System.out.println("착즙 사과주스를 20000원에 팝니다.");
	}

	@Override
	public void orderOrange() {
		System.out.println("착즙 오렌지주스 24000원에 팝니다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("가격은 못 정했습니다.");
	}
}
