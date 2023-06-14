package datatype4;

public class DataType4 {

	public static void main(String[] args) {
		boolean isMarried = false;
		System.out.println(isMarried);
		
		var str = "hello"; // var 선언형은 java 10 부터 지원됨. 할당 시 타입 추론함 
		var str2 = str;
		System.out.println(str2);
		
//		str2 = 3; // error (타입 호환 안됨) 
	}

}

/**
 * boolean: 1 byte 사용 true/false
 * 
 * 
 */
