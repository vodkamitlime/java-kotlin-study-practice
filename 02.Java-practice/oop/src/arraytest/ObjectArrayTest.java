package arraytest;

public class ObjectArrayTest {

	public static void main(String[] args) {
		ObjectExample[] library = new ObjectExample[5];
		
		for (int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new ObjectExample("테스트1", "작가");
		library[1] = new ObjectExample("테스트2", "작가");
		library[2] = new ObjectExample("테스트3", "작가");
		library[3] = new ObjectExample("테스트4", "작가");
		library[4] = new ObjectExample("테스트5", "작가");
		
		for (ObjectExample book : library) {
			System.out.println(book);
		}
		
		ObjectExample[] library2 = new ObjectExample[5];
		
		// 객체 배열 복사하기 (얕은 복사) 
		System.arraycopy(library, 0, library2, 0, 5);
		
		for (ObjectExample book : library2) {
			System.out.println(book);
		}
		
		// 객체 배열 복사하기 (깊은 복사) - 모든 element 마다 객체 새로 생성해서 값을 할당해줘야 함 
	}

}
