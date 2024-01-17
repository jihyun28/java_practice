package exception.trycatch;

public class TryCatchEx1 {
	public static void main(String[] args) {
		int i = 10;
		int j = 0;
		
		try { // 예외가 발생할 가능성이 있는 코드를 넣는 구역
			System.out.println(i / j); // 예외 발생 가능성이 있음
			System.out.println("예외 발생하지 않을 때만 실행됨");
		} catch(Exception e) { //catch 블럭에는 Exception의 종류를 기입
			System.out.println("0으로 나눠서 catch 블럭으로 넘어왔습니다.");
		} finally { // try, catch 둘 중 어느 블럭이라도 실행되면 마무리 블럭 실행
			System.out.println("어쨌든 잘 마무리 했습니다.");
		}
	}
}
