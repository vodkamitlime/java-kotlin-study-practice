package classtest;

public class StaticTest {
	
	public static int num = 1000;
	/**
	 * 여러 인스턴스에서 공통으로 사용하는 변수 
	 * 데이터 영역 메모리 내 선언되어, 여러 개의 인스턴스가 하나의 메모리에 접근하여 사용 
	 * 인스턴스 생성 시점에 메모리 할당되지 않고 처음 프로그램이 메모리에 올라갈 때 할당됨   
	 */
	
	// static method (클래스 메서드) 에서는 인스턴스 변수를 사용할 수 없다 
	// why? 인스턴스 생성 전에 호출될 수 있기 때문 
	private static int num2 = 2000;
	public static int getNum2() {
		return num2;
	}
	public static void setNum2(int num2) {
		StaticTest.num2 = num2;
	}
	
}
