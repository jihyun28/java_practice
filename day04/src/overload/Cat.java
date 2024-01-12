package overload;

public class Cat {
	public String kind;
	public String name;
	
	public Cat(){
		kind = "품종이 확인되지 않았습니다.";
		name = "이름이 확인되지 않았습니다.";
	}
	
	public Cat(String k, String n) {
		kind = k;
		name = n;
		System.out.println("지금부터 이 아이의 이름은 " + n + "입니다.");
	}
	
	public void call() {
		System.out.println(name + "아 이리와");
	}
	
	public void call(String s) {
		System.out.println(s + "아 이리와");
	}
}