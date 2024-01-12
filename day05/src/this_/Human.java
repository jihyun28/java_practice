package this_;

public class Human {
	public String name;
	public int age;
	
	// 생성자 선언 
	// this 키워드 -> 전달받은 값을 멤버변수에 대입
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// 메서드 오버로딩으로 이름만 입력받는 생성자 정의
	public Human(String name) {
		this(name, 0); // 아래 두 줄과 같은 의미
		//this.name = name;
		//this.age = 0; 
	}
	
	// 아무것도 입력하지 않았을 때 name에는 "이름없음", age에는 -1이 대입
	public Human() {
		this("이름없음", -1);
		//this.name = "이름없음";
		//this.age = -1;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + this.name + ", 나이: " + this.age);
	}
}
