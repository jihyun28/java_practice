package instanceof_;

public class Human {
	
	public String name;
	public int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public Human() {
		this("noname", 0);
		// this.name = "noname";
		// this.age = 0;
	}
	
	public void showInfo() {
		System.out.println("이름: " + this.name);
		System.out.println("나이: " + this.age);
		System.out.println("---------------");
	}
}
