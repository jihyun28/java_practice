package inheritance.extend;

public class ExtendsExMain {

	public static void main(String[] args) {
		Parent parent = new Parent(); // 부모타입 변수에 부모타입 객체 대입
		Parent parentTypeChild = new Child(); // 부모타이 변수에 자식타입 객체 대입, 다형성
		Child child = new Child();
		
		parent.process();
		System.out.println("--------------");
		parentTypeChild.process(); 
		//parentTypeChild.childProcess(); // Child 타입객체 내부에 선언된 요소는 Parent로 호출 불가
		System.out.println("--------------");
		child.process();
		child.childProcess();
	}
}
