package basic.importex;

import basic.fruit.Apple;

public class ImportExample {

	public static void main(String[] args) {
		// 같은 패키지 내의 다른 클래스를 호출할 때는 어떤 참조설정도 필요하지 않음
		Test test = new Test();
		// 외부 패키지 참조 시 import (자동완성 기능 이용)
		Apple apple = new Apple();
		
	}

}
