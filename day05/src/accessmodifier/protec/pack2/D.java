package accessmodifier.protec.pack2;

import accessmodifier.protec.pack1.A;

public class D extends A {
	public D() {
		//A a = new A();
		//a.s = "hi";
		//a.method();
		 
		// protected는 패키지가 다를 경우
		// 두 클래그 사이에 상속관계가 있다면
		// super 키워드를 이용해 부모쪽 참조 허용
		super ();
		super.s= "hi";
		super.method();
	}
}
