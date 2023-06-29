package oopConcepts;

public class VIPCustomer extends Customer {
	public VIPCustomer() {
		// 하위 클래스가 상위 클래스의 참조값을 가지게 됨, 직접 안 써도 디폴트로 컴파일러가 넣어주게 됨 
		// but, 디폴트 매개변수가 필수라면, 꼭 추가해줘야 함 
		super();
		
		System.out.println("VIPCustomer() called");
	}
	
	public void getAgentId() {
		System.out.println(super.customerID);
	}
}
