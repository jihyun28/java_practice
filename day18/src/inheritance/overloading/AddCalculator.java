package inheritance.overloading;

public class AddCalculator {

	// 메서드 오버로딩 요건
	// 1. 메서드 이름을 중복하여 여러 개 선언
	// 2. 단, 선언된 같은 이름의 메서드 간 요구 파라미터의 개수나 타입은 달라야 함
	// 3. 리턴타입의 동일여부는 오버로딩에 영향을 주지 않음
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	// return 타입만 다르게 오버로딩 하는 것은 불가능
	// public long add(int num, int num2){
    //   	return num1 + num2;
	//}
	
	public double add(double num1, double num2) {
		return num1 + num2;
	}
	
	public long add(long num1, long num2) {
		return num1 + num2;
	}
}