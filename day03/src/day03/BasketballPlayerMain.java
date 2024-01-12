package day03;

public class BasketballPlayerMain {
	
	public static void main(String[] args) {
		
		BasketballPlayer p1 = new BasketballPlayer("a", 180, 15, 3000);
		//p1.name = "a";
		//p1.height = 180;
		//p1.age = 15;
		//p1.salary = 3000;
		
		BasketballPlayer p2 = new BasketballPlayer("b", 200, 20, 2000);
		//p2.name = "b";
		//p2.height = 200;
		//p2.age = 20;
		//p2.salary = 2000;
		
		p1.showInfo();
		p1.dunkShoot();
		
		p2.showInfo();
		p2.dunkShoot();
	}

}
