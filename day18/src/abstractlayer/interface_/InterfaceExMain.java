package abstractlayer.interface_;

public class InterfaceExMain {

	public static void main(String[] args) {
		SomeInterface someInterface = new ImplementsClass();
		AnotherInterface anotherInterface = new ImplementsClass();
		
		someInterface.someMethod();
		anotherInterface.anotherMethod();
		
		ImplementsClass implementClass = new ImplementsClass();
		
		// SomeInterface, anotherInterface로는 양쪽 모두를 호출할 수 없음
		//someInterface.anotherMethod();
		//anotherInterface.someMethod();
		
		// ImplementsClass 구현체 타입으로는 양쪽 모두 호출 가능
		implementClass.anotherMethod();
		implementClass.someMethod();
	}
}