package datatype2;

public class DataType2 {
	
	public static void main(String[] args) {
		double dnum = 3.14; // no error
		float fnum = 3.14; // error
		float fnoerrNum = 3.14f; // no error
	}
	
	/**
	 *  why fnum error?
	 *  리터럴이 어딘가에 저장되어 있는데, 모든 실수 리터럴은 기본적으로 double (8바이트) 에 저장됨
	 *  float 는 4바이트인데, 리터럴인 8바이트를 할당하려니 사이즈 안 맞아서 불가능 
	 */
	
}
