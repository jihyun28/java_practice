package exception.throws_;

public class ThrowEx {
	public static String[] greetings = {"안녕", "싸왓디", "헬로"};
	
	// 예외의 원인이 메서드 선언부가 아닌 호출부에 있을 경우
	// 메모리 영역이 다르므로 예외처리를 메서드 호출지역으로 떠넘겨줘야 함
	// 이를 throws라고 하고, 메서드 혹은 생성자 호출 시 예외처리를 강요할 때 사용
	
	// 해당 예외가 발생하면 호출부(여기서는 main)에게 처리를 떠넘기는 것				
	public static void greet(int idx) throws Exception {
		System.out.println(greetings[idx]);
	}
	
	public static void main(String[] args) {
		// throws가 붙어 있는 메서드나 생성자 호출 시에는
		// 해당 메서드를 try 블록 내부에서 호출해야 예외처리를 진행해줌
		try {
			greet(2);
		} catch(Exception e) {
			// .printSackTrace()는 예외발생 경로를 추적하는 메세지 출력
			// 주로 개발 과정에서 예외의 원인을 역추적할 때 유용
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료!");
	}
}