package oopConcepts;

public class InheritanceTest {
	public static void main(String[] args) {
		// 하위, 상위 클래스 호출 순서 확인 
		VIPCustomer test = new VIPCustomer();
		
		// 업캐스팅
		// 하위 클래스는 상위 클래스로 묵시적 형 변환 가능하나, 그 역은 성립되지 않음 
		// 실제 사용할 수 있는 메서드도 다 상위 클래스 메서드 뿐임 
		Customer test1 = new VIPCustomer(); 
		
	}
	/**
	 * - Java 는 단일 상속 (inherits only single class) 만 지원 
	 * - 상위 클래스는 하위 클래스보다 더 일반적인 개념과 기능을 가짐 (하위 - 구체적) 
	 * - 하위 클래스 생성하면 상위 클래스가 먼저 생성 됨
	 * - 하위 클래스 생성자() 호출 시 상위 클래스 생성자() 먼저 생성 
	 * - 힙 메모리에 저장됨 
	 */

}
