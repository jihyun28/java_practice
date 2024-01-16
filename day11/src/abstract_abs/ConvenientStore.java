package abstract_abs;

public class ConvenientStore extends PopupStore {
	@Override
	public void orderApple() {
		System.out.println("가당 사과주스 4000에 팝니다.");
	}

	@Override
	public void orderOrange() {
		System.out.println("가당 오렌지주스 5000에 팝니다.");
	}

	@Override
	public void orderGrape() {
		System.out.println("가당 포도주스 3500에 팝니다.");
	}
}
