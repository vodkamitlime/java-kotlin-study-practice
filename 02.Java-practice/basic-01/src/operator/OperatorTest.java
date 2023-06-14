package operator;

import java.util.Scanner;

public class OperatorTest {

	public static void main(String[] args) {
		// 입력받기 위한 scanner 객체 
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		System.out.println(num);
		
		// 기존 switch-case
		switch(num) {
			case 1: 
				System.out.println("no 1");
				break;
			case 2: 
				System.out.println("no 2");
				break;
			default:
				System.out.println(num);
				break;
		}
		
		// Java 14 부터는 값을 반환하는 switch-case 사용 가능
		int month = 2;
		int day = switch(month) {
			case 1, 3, 5, 7, 8, 10, 12 -> 
				31;
			case 2 -> {
				yield 28;
			}
			default -> {
				yield 30;
			}
			
		};
		System.out.println(day);
	}
	
	/**
	 *  
	 */
	
}
