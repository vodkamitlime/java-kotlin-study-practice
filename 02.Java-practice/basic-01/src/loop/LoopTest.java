package loop;

public class LoopTest {

	public static void main(String[] args) {
		
		int i = 0;
		
		while(i < 5) {
			System.out.println(i);
			i++;
		}
		
		int j = 0;
		
		do {
			System.out.println(j);
			j++;
		} while (j < 0);
		
		int num;
		for (num = 10; num <= 15; num++) 
		{
			System.out.println(num);
		}
		
		int first;
		int second;
		for (first = 2; first <= 9; first++)
		{
			for (second = 1; second <= 9; second++) 
			{
				if (first * second > 50) 
				{
					System.out.println("inner break");
					break;
				}
				
				System.out.println(first * second);
			}
			
			if (first > 6)
			{
				System.out.println("outer break");
				break;
			}
		}
	}

}
