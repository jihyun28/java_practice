package accessmodifier.protec.pack2;

import accessmodifier.protec.pack1.A;

public class C {

	public C() { // 다른 패키지에 있으므로 호출 불가
		//A a = new A();
		//a.s = "hihihi";
		//a.method();
	}
}