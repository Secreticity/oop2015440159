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
			System.out.print("숫자를 입력하시오 : ");
			int guess = input.nextInt();
			
			if(guess == qnum)
			{
				System.out.println("정답입니다!");
				break;
			}
			else if (guess > qnum)
				System.out.println("입력하신 숫자보다 작습니다.");
			else
				System.out.println("입력하신 숫자보다 큽니다.");
			trynum--;
		}
		if(trynum == 0)
			System.out.println("GAME OVER!");
	}
}
