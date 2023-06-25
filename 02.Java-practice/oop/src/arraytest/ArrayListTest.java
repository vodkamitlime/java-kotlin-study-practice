package arraytest;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<ObjectExample> library = new ArrayList<ObjectExample>();
		library.add(new ObjectExample("book test 1", "author1"));
		library.add(new ObjectExample("book test 2", "author2"));
		library.add(new ObjectExample("book test 3", "author3"));
		library.add(new ObjectExample("book test 4", "author4"));
		library.add(new ObjectExample("book test 5", "author5"));
		
		for (int i=0; i<library.size(); i++) {
			library.get(i).showInfo();
		}
	}
/**
 * Java.util 패키지에서 ArrayList 제공 
 * 일반 배열은 메모리 사이즈 미리 지정해야 해서 배열 길이가 커지면 재할당, 복사해야 함 
 * ArrayList 통해 이를 더 효율적으로 할 수 있음 
 */
}
