package api.lang.system;

public class SystemTimeEx {
	public static void main(String[] args) {
		// currentTimeMilllis()와 nanoTime() 메서드는 UNIX 시간 사용
		// UNIX 시간 : 1970/01/01 00:00:00을 기점으로 얼마나 시간이 지났는지 숫자로 표현
		// 현재까지의 시간을 1000분의 1초로 변환한 에폭시간과 10억분의 1초로 변환한 에폭시간을 long 타입으로 리턴
		
		long start = System.currentTimeMillis();
		System.out.println("시작시간 : " + start);
		long sum = 0;
		
		for(long i = 1; i < 10_000_000_000L; i++) {
			sum += i;
		}
		long end = System.currentTimeMillis();
		System.out.println("종료시간 : " + end);
		System.out.println("계산에 소요된 시간 : " + (end - start));
	}
}