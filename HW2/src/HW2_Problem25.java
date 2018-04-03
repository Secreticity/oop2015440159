
public class HW2_Problem25 {

	public static void main(String[] args) {
		int i, j;
		for(i = 1; i <= 11; i++)
		{
			for(j = 1; j <= 13-i*2; j++)
				System.out.print("*");
			for(j = 0; i > 6 && j <= (i-6)*2; j++)
				System.out.print("*");
			System.out.print("\n");
		}

	}
}
