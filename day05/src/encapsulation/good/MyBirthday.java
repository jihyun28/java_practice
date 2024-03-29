package encapsulation.good;

public class MyBirthday {
	// 은닉(캡슐화) 시 변수는 무조건 private으로 처리
	private int year;
	private int month;
	private int day;
	
	// alt+shift+s 혹은 마우스 우클릭 후 source
	// generate constructor using fields 선택
	public MyBirthday(int year, int month, int day) {
		this.year = year;
		setMonth(month);
		setDay(day);
	}
	
	// 은닉된 변수에 접근하기 위해서는
	// 클래스 설계 시 미리 설정해둔 setter/getter 메서드를 이용해 접근

	// setter 메서드 선언
	// 1. setter 메서드는 은닉변수에 값을 저장(세팅)하기 위해 선언
	// 2. 메서드의 접근제한자는 public으로 설정하고, 이름은 일반적으로 set+변수명으로 지정
	
	// setMonth를 설계하여 오로지 1~12 중 하나만 받아서 저장하도록 지정
	public void setMonth(int month) {
		if(month < 1) {
			this.month = 1;
		} else if (month > 12) {
			this.month = 12;
		} else {
			this.month = month;
		}
	}
		
	public void setDay(int day) {
		if(day < 1 || day > 31) {
			this.day = 1; // 범위를 벗어나는 값이 들어올 경우 1로 고정
		} else {
			this.day = day; // 범위 내의 값이면 그대로 지정
		}
	}
	
	void showDateInfo() {
		System.out.println("내 생일은");
		System.out.println(year + "년");
		System.out.println(month + "월");
		System.out.println(day + "일");
		System.out.println("이니까 선물을 준비하세요!");
	}
}
