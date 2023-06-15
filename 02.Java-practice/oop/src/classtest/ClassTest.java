package classtest;

public class ClassTest {

	public static void main(String[] args) {
		Person person = new Person("Kang");
		person.printName();
		
		System.out.println(person);
		// classtest.Person@7e774085
		// 패키지 full name @ memory 주소 (Heap) JVM 이 준 가상 address  
		// person (참조 변수) 은 Stack 에 저장되어 있는데, memory 주소를 (참조값) 가지고 있는 것임. 
		// 그 주소를 찾아가면 실제 instance 가 있음. 
		
		// overloading test
		OverloadingTest o = new OverloadingTest();
		OverloadingTest o2 = new OverloadingTest("this is 2");
		OverloadingTest o3 = new OverloadingTest("this is 3", "this is 4");
		
		System.out.println(StaticTest.num);
	}
	
	/**
	 * 생성된 인스턴스는 힙 (Heap) 동적 메모리에 저장됨
	 * C 나 C++ 에서는 동적 메모리를 해제해야 함 (free() or delete)
	 * Java 는 Garbage collector 있어서, 주기적으로 메모리 정리 
	 * 
	 * 지역 변수 -> 함수 내부 선언 -> 스택 메모리 (함수 호출 시 생성,종료 시 소멸) 
	 * 멤버 변수 (인스턴스 변수) -> 클래스 내부 선언 내/외부 참조 -> 힙메모리 (인스턴스 생성 시 생성, 종료 시 소멸) 
	 * static 변수 -> 클래스 내부 선언 내/외부 참조 -> 데이터 메모리(프로그램 시작 시 생성, 종료 시 소멸) 
	 */
}
