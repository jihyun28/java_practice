package override;

public class OverrideEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programmer p1 = new Programmer();
		
		p1.name = "가";
		p1.age = 15;
		p1.devLang = "자바";
		p1.repoCnt = 40;
		
		p1.자기소개하기();
		p1.코딩하기();
	}
}
