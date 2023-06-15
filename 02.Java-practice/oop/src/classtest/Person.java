package classtest;

public class Person {
	
	public String name;
	public int age;
	
	// 생성자 
	public Person(String lastName) {
		this.name = "Haeun " + lastName;
		this.age = 28;
	}
	
	public static int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public String printName() {
		System.out.println("My name is: " + this.name);
		return name;
	}
	
	/**
	 * 함수가 호출될 때는 스택에 지역 변수들이 저장됨
	 * 1. 함수가 사용할 메모리 공간이 생성됨 
	 * 2. 내부에 있는 함수의 메모리 공간이 생성됨 
	 * 3. 함수 실행 후에는 해당 공간은 사라짐 
	 */
}

