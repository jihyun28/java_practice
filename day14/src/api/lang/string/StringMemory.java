package api.lang.string;

public class StringMemory {
	public static void main(String[] args) {
		// String의 경우 내용이 다른 문자는 항상 새롭게 할당
		//String a = "0";
		
		// StringBuilder, StringBuffer는 문자도 메모리 저장 시 변경 가능하게 저장
		// 따라서 문자 내용이 바뀌어도 새로운 할당이 잘 일어나지 않으므로 성능상 우위에 있음
		// StringBuilder는 Thread safety하지 않지만 StringBuffer보다 근소하게 성능이 좋음
		//StringBuilder sb = new StringBuilder("0");
		StringBuffer sb = new StringBuffer("0");
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1_000_000; i++) {
			//a += "0"; // a 문자에 0을 100만번 더함 -> 힙 할당도 100만번
			sb.append("0"); // sb에 0을 100만번 더함 -> 힙 할당은 거의 새롭게 일어나지 않음
		}
		 
		long end = System.currentTimeMillis();
		System.out.println("소요시간(밀리초 : " + (end - start));
	}
}