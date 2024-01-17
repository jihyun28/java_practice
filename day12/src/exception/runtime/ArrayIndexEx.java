package exception.runtime;

public class ArrayIndexEx {
	public static void main(String[] args) {
		int [] arr = {3, 6, 9};
		int i = 4;
		
		
		// 있지도 않은 인덱스 번호 조회하기, 그러나 문법상 오류는 없음
		System.out.println(arr[i]);
	}
}
