package datatype3;

public class DataType3 {
	
	public static void main(String[] args) {
		char a = 'A';
		char a1 = 65; // char 도 정수로 저장되기 때문에 정수여도 character 출력. 양수만 가
		System.out.println(a);
		System.out.println((int)a);
		System.out.println(a1);
		
		int b = 66;
		System.out.println(b);
		System.out.println((char)b);
		
		char han = '한';
		char ch = '\uD55C'; // 유니코드 표기법
		System.out.println(han);
		System.out.println(ch);
				
	}
	
}

/** 
 * ASKII = 8bit (2^8, 256 개까지 표현 가능) 
 * A -> 65 encoding
 * 65 -> A decoding
 * 
 * 모든 나라 문자 표준화 -> unicode
 * utf-8 (1~byte 유동적으로 사용)
 * utf-16 (2byte) : 1 byte 는 askii 호환, 나머지 1 byte 는 기타 
 * 
 * Java: utf-16 표현 
 * 'A' : 2 byte 짜리 문자 
 * "A" : 문자열 (string), 식별 가능한 추가 characters 있음 
*/
