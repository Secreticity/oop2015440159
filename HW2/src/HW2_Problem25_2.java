
public class HW2_Problem25_2 {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 11; i++)
		{
			for(j = 1; j <= 13-i*2; j++)
			{
				if(j <= (13-i*2)/2)
					System.out.print((13-i*2)/2-j+1);
				else
					System.out.print(j-(13-i*2)/2-1);
				
			}
			for(j = 0; i > 6 && j <= (i-6)*2; j++)
				if(j <= (i-6)*2/2)
					System.out.print((i-6)*2/2-j);
				else
					System.out.print(j-(i-6)*2/2);
			System.out.print("\n");
		}

	}
}
