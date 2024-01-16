package has_a;

public class Police {
	// 상속 없이 Gun 기능을 사용하기 위해 멤버변수도 Gun을 가짐
	private Gun gun;
	private String name;
	private int height;
	
	public Police(Gun gun, String name, int height) {
		this.gun = gun;
		this.name = name;
		this.height = height;
	}
	
	public void shoot() {
		this.gun.shoot();
	}
	
	public void showStatus() {
		System.out.println("소유총기 : " + this.gun);
		System.out.println("총기이름 : " + this.name);
		System.out.println("총기크기 : " + this.height);
	}
}
