package classtest;

public class AccessModifierTest {
 /**
  * class 외부에서 접근 가능한 범위 지정 
  * private: 같은 클래스 내부에서만 (상속 클래스도 x)
  * 아무것도 없음 default: 같은 패키지 내부에서만 (상속 클래스도 패키지 다르면 x)
  * protected: 같은 패키지나, 상속관계만 가능 
  * public: 클래스 외부 어디서나 가능 
  */
	
/**
 * this :
 * - 자신의 메모리 가리킴, return 시 자신의 메모리 주소 반환함 
 * - 생성자에서 또 다른 생성자 호출 
 */
	
	public AccessModifierTest() {
		this("test works"); // this 호출 전에는 다른 선언 불가 
	}
	
	public AccessModifierTest(String test) {
		System.out.println(test);
	}
}
