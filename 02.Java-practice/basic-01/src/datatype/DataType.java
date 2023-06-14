package datatype;

public class DataType {

	public static void main(String[] args) {
		int num = 12345678;
		int num2 = 12345678900; // error (표현 범위 넘어섬) 
		long errorNum = 12345678900; // 리터럴이 int 로 저장되는데, 표현 범위를 벗어나서 에러 발생 
		long longNum = 12345678900L; // long 표현 위해서는 L 붙여줘야 함 
		
		// byte 표현 범위는 -128 ~ 127
		byte bnum = -128; 
		byte berrnum = 128; // error
		
	}

}

/** 
 * Java 에서 정수 표현하는 방법: byte (1byte), short (2byte), int (4byte), long (8byte)
 * 표현 가능한 수의 범위는 부호용 비트 1개를 뺀 비트수 (음, 양)
 * 그런데 0을 포함해야 하니, 양수의 범위는 1이 적음 
 * 예) byte 표현 범위: -2^7 ~ 2^7 - 1
 * 
 * 가장 많이 쓰는 자료형은 int, 프로그램에서 사용하는 모든 숫자 리터럴은 int 로 저장됨 (메모리에 할당되는 리터럴 수) 
 */