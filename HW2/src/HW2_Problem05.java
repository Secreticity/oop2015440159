
public class HW2_Problem05 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
		
		do{
			if(i%3 == 0)
				sum = sum + i;
			i++;
		}
		while(i <= 100);
			
		System.out.println(sum);

	}

}
