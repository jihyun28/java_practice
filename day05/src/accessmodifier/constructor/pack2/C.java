package accessmodifier.constructor.pack2;

import accessmodifier.constructor.pack1.A;

public class C {

	A a1 = new A(true); // public 접근 가능
	//A a2 = new A(33);   // default 접근 불가
	//A a3 = new A("no"); // private 접근 불가
}
