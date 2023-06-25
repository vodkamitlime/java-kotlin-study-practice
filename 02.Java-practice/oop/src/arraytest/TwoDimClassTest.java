package arraytest;

public class TwoDimClassTest {
	public static void main(String[] args) {
		int[][] arr = {{1,2,3}, {4,5,6}};
		
		for (int[] i : arr) {
			System.out.println(i[0]);
			System.out.println(i[1]);
			System.out.println(i[2]);
		}
	}
}
