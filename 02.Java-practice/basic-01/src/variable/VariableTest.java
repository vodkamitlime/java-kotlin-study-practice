package variable;

public class VariableTest {

	public static void main(String[] args) {
		final int MAX_NUM = 100; // 값을 초기화하지 않고는 사용할 수 없음, 한 번 초기화하면 값 변경 불가
		
		byte a = 10;
		int b = a; // 자동 형변환
		
		int c = 100;
		float d = c; // 자동 형 변환
		
		int e = 10;
		byte f = (byte)e; // 수동 형 변환 
		
		
		// 그런데, byte 로 표현 가능한 수를 벗어나는 값을 캐스팅하면 이상한 값이 됨
		int test = 256;
		byte test2 = (byte)test;
		System.out.println(test2);
		
		double doub = 3.14; 
		int inNum = (int)doub;
		System.out.println(inNum); // truncated
		
		// 형 변환 순서는 결과에 영향을 미칠 수 있음 
		double no1 = 1.2;
		float no2 = 0.9F;
		int iNum1 = (int)no1 + (int)no2;
		int iNum2 = (int)(no1 + no2);
		System.out.println(iNum1);
		System.out.println(iNum2);
	}

}

/**
 * naming conventions:
 * - 패키지명은 소문자
 * - 클래스명은 대문자
 * - 변수명은 영문자나 숫자, 특수문자 ($ 와 _만)
 * - 변수명은 숫자로 시작 불가
 */

/**
 * 상수: 변하지 않는 수, final
 * 
 * type conversion (형 변환) 
 * 서로 다른 자료형 간의 연산을 수행하기 위해 자료형 통일 필요 
 * 묵시적 형 변환 : 자동으로 변환 (byte 크기가 작은 자료 -> 큰 자료에서는 자동 변환, 덜 정밀 (int) -> 더 정밀 (float) 로 자동 변환)  
 * 명시적 형 변환 : 강제 형 변환  ()
 * 
 */