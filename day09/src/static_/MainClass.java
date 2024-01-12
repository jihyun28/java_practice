package static_;

public class MainClass {

	public static void main(String[] args) {
		// 인스턴스생성 전부터 이미 조회 가능한 팀점수
		//System.out.println(Asean.presentationScore);
		// 스태틱 메서드도 스태틱 변수처럼 호출 가능
		Asean.showPresentationScore();
		
	
		// 학생 4명 생성
		Asean a1 = new Asean("가", 20, 43);
		Asean a2 = new Asean("나", 15, 30);
		Asean a3 = new Asean("다", 10, 35);
		Asean a4 = new Asean("라", 18, 40);
	
		a1.showStudentScore();
		a2.showStudentScore();
		a3.showStudentScore();
		a4.showStudentScore();
	
		// 어떤 인스턴스를 활용해도 팀 점수 조회 가능
		//System.out.println(a1.presentationScore);
		//System.out.println(a2.presentationScore);
		//System.out.println(a3.presentationScore);
		//System.out.println(a4.presentationScore);
	}
}
