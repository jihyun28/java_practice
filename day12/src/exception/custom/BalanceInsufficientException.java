package exception.custom;

// 잔고 불충분 예외
// 사용자 정의 예외 클래스 생성 시 Exception 클래스나 RuntimeException 클래스 상속
public class BalanceInsufficientException extends RuntimeException {
	// 일반적으로 사용자 정의 예외 클래스를 만들 때는 
	// 기본 생성자와 예외원인 메세지를 받는 생성자를 두 개 오버로딩하여 선언만 해줌
	public BalanceInsufficientException() {};
	
	public BalanceInsufficientException(String message) {
		super(message);
	}
}