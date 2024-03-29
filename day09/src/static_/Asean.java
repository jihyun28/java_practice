package static_;

public class Asean {
	// 출석 20, 발표 30, 기말 50
	public String name; 
	private int attendanceScore; // 출결점수
	private int finalTermScore;   // 기말점수

	private static int presentationScore; // 29
	
	public Asean(String name, int attendanceScore, int finalTermScore) {
		this.name = name;
		this.attendanceScore = attendanceScore;
		this.finalTermScore = finalTermScore;
	}
	
	// static 블록 내부 코드는 프로그램 시작 시 즉시 자동으로 한 번 호출
	static {
			presentationScore = 29;
	}
	
	// 스태틱 메서드도 객체 없이 바로 호출 가능
	public static void showPresentationScore() {
		System.out.println(presentationScore);
	}
	
	public void showStudentScore() {
		System.out.println("학생명 : " + this.name);
		System.out.println("출결점수 : " + this.attendanceScore);
		System.out.println("발표점수 : " + presentationScore);
		System.out.println("기말점수 : " + this.finalTermScore);
		System.out.println("최종점수 : " + (this.attendanceScore + presentationScore + this.finalTermScore));
		System.out.println("===========================================");
		
	}
}
