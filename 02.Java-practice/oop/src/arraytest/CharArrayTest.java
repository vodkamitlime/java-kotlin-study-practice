package arraytest;

public class CharArrayTest {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		
		for (int i=0; i<alphabets.length; i++) {
			System.out.println(ch);
			alphabets[i] = ch++;
		}
	}

}
