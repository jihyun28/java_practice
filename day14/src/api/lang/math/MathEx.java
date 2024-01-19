package api.lang.math;

public class MathEx {
	public static void main(String[] args) {
		// 수학 관련된 연산이나 혹은 상수를 저장해둔 Math 클래스는 정적 변수와 메서드를 가지므로
		// 굳이 Math 객체를 생성하지 않아도 활용 가능
		
		// 절대값 : 부호 무시
		System.out.println(Math.abs(-15.294));
		
		// 올림 : 소수점 아래자리가 존재하면 1 증가
		System.out.println(Math.ceil(10.0));
		System.out.println(Math.ceil(10.00001));
		
		// 내림 : 소수점 아래자리가 존재하면 없애버림
		System.out.println(Math.floor(10.0));
		System.out.println(Math.floor(10.99999));
		
		// 최대값 : 제시된 수 중 가장 큰 값 하나만 남김
		System.out.println(Math.max(99.9, 12.34));
		
		// 최소값 : 제시된 수 중 가장 작은 값 하나만 남김
		System.out.println(Math.min(99.9, 12.34));
		
		// 랜덤값 : 컴퓨터 시스템은 완벽한 난수가 아닌 시득닶에 따른 의사난수를 사용
		System.out.println(Math.random());
		
		// 가장 가까운 실수 구하기
		System.out.println(Math.rint(12.500001));
		
		// 반올림 : 소수점 아래값이 0.5 미만이면 정수를 그대로, 이상이면 1 증가
		System.out.println(Math.round(24.604));
		
		// 혹은 Math 클래스 내에 정적변수로 자주 사용하는 상수값(원주율, 자연상수 등)도 제공
		System.out.println(Math.PI);
		System.out.println(Math.E);
	}
}