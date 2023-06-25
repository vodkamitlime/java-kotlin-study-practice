package arraytest;

public class ArrayTest {

	public static void main(String[] args) {
		// array 선언 방법
		int[] arr1 = new int[10]; // 미리 메모리에 들어갈 element 사이즈 지정
		
		// array 초기화
		int[] numbers = new int[] {10, 20, 30}; // 개수 생략 
		int[] numbers2 = {10, 20, 30}; // new int[] 생략 가능
		int[] ids; 
		ids = new int[] {1,2,3}; 
		
		for (int i=0, num=1; i<arr1.length; i++) {
			arr1[i] = num++;
			System.out.println(arr1);
		}
		
		// element 처음부터 끝까지 순회할 때는? 
		for (int num : arr1) {
			System.out.println(num);
		}
		
		// 배열의 개수와 메모리 길이 (length) 는 다를 수 있음.
		// 50 개로 메모리 잡아놓고 실제 element 는 20개라면, length == 50 임 
		// 해결 방법? count 변수를 따로 둬서 element 추가할 때마다 증가
		int[] example = new int[50];
		int count = 0;
		example[0] = 100; count++;
		example[1] = 200; count++;
		example[2] = 300; count++;
		for (int i=0; i < count; i++) {
			System.out.println(example[i]);
		}
			
	}
/**
 * 배열의 특징:
 * 물리적 위치와 논리적 위치가 동일
 * A element 옆에 B element 가 있다 == 실제 메모리 상에도 그렇다 
 */
}
