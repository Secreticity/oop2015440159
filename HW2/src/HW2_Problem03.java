
public class HW2_Problem03 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		while(i <= 100)
		{
			if(i%3 == 0)
				sum = sum + i;
			i++;
		}
		System.out.println(sum);

	}

}
