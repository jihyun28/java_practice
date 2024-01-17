package exception.trycatch;

public class TryCatchEx2 {
	public static void main(String[] args) {
		int arr[] = {1, 2, 3};
		int i = 2;
		
		try {
			System.out.println(arr[i]);
			System.out.println("배열의 인덱스 값을 조회했습니다.");
		} catch(Exception e) {
			System.out.println("인덱스 범위가 배열 크기를 초과했습니다.");
		} finally {
			System.out.println("어쨌든 잘 마무리 했습니다.");
		}
	}
}
