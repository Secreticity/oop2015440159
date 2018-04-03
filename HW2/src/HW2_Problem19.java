import java.util.Scanner;

public class HW2_Problem19 {

	public static void main(String[] args) {
		// 19. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자가 소수인지 아닌지를 검사하는 프로그램을 작성하시오.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i, prime = input.nextInt();
		if(prime == 1)
			System.out.println("소수가 아닙니다.");
		else
		{
			for(i = 2; i < prime; i++)
			{
				if(prime%i == 0)
				{
					System.out.println("소수가 아닙니다.");
					break;
				}
			}
			if(prime == i)
				System.out.println("소수입니다.");

		}
	}
}
