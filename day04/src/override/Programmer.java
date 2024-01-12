package override;

public class Programmer extends Human{

	public String devLang;
	public int repoCnt;
	
	// 오버라이드는 부모측 메서드와 이름, 파라미터, 리턴타입이 같게 자식쪽에 다시 선언
	//오버라이드 애너테이션은 붙어뎌 되고 안붙여도 됨
	@Override
	public void 자기소개하기(){
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("개발언어: " + devLang);
		System.out.println("레포지토리 개수: " + repoCnt);
	}
	
	@Override
	public void 코딩하기() {
		System.out.println(devLang + "을 이용해 코딩");
	}
}
