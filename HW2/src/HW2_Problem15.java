import java.util.Random;
import java.util.Scanner;

public class HW2_Problem15 {

	public static void main(String[] args) {
		
		Random random = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int qnum = random.nextInt(100)+1;
		int trynum = 10;
		
		while(trynum > 0)
		{
			System.out.print("���ڸ� �Է��Ͻÿ� : ");
			int guess = input.nextInt();
			
			if(guess == qnum)
			{
				System.out.println("�����Դϴ�!");
				break;
			}
			else if (guess > qnum)
				System.out.println("�Է��Ͻ� ���ں��� �۽��ϴ�.");
			else
				System.out.println("�Է��Ͻ� ���ں��� Ů�ϴ�.");
			trynum--;
		}
		if(trynum == 0)
			System.out.println("GAME OVER!");
	}
}
