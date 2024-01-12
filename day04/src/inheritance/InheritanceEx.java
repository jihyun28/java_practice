package inheritance;

public class InheritanceEx {
	
	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name = "나";
		st1.age = 20;
		st1.major = "기계";
		
		Salaryman sm1 = new Salaryman();
		
		sm1.name = "라";
		sm1.age = 30;
		sm1.salary = 8000;
	}

}
