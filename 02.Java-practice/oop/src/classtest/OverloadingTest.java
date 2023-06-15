package classtest;

public class OverloadingTest {
	/**
	 * overloading: 여러가지 생성자를 정의하는 것
	 * 사용하는 쪽에서 필요에 따라 생성자 호출 
	 */
	public OverloadingTest() {}
	public OverloadingTest(String test) {
		System.out.println(test);
	}
	public OverloadingTest(String test, String test2) {
		System.out.println(test2);
	}
}
