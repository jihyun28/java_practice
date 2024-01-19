package api.lang.string;

public class StringIndexOf {
	public static void main(String[] args) {
		// 특정 문자열의 시작 인덱스값을 반환
		String to = "tomatos";
		
		// 단일 파라키터로 조회만 할 경우 0번에서 제일 가까운 단어 하나만 조회
		System.out.println(to.indexOf(to));

		// 두 번째 파라미터로 조회 시작 파라미터 지정 가능
		System.out.println(to.indexOf("to", 1)); // 0번부터가 아닌 1번부터 조회
		
		// 없는 단어 조회 시 -1
		System.out.println(to.indexOf("na"));
	}
}
