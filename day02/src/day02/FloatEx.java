package day02;

public class FloatEx {

	public static void main(String[] args) {
		//매직넘버 실수는 double이기 때문에 float 자료형에 저장할 때는
		//뒤에 f를 붙여서 float으로 바꿔야 함
		float f1 = 7.12345f;
		System.out.println(f1);
		
		//과학표기법
		System.out.println(0.12345e+7); // 0.12345를 7자리 올리기
		System.out.println(100e-5); //100을 5자리 내리기
	}

}
