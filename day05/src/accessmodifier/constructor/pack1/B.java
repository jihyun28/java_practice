package accessmodifier.constructor.pack1;

public class B {
	A a1 = new A(false); // public 호출 가능
	A a2 = new A(55); // default 호출 가능
	//A a3 = new A("안돼"); // private은 A 내부에서만 호출 가능
}
