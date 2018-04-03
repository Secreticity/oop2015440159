import java.util.Scanner;

public class HW2_Problem21 {

	public static void main(String[] args) {
		//21. 사용자로부터 한 숫자를 입력받아, 입력받은 숫자 이하의 소수들의 합을 구하는 프로그램을 작성하시오.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("숫자 입력: ");
		int i, j, sum = 0, inputnum = input.nextInt();
		
		for(i = inputnum; i > 1; i--)
		{
			for(j = 2; j < i; j++)
			{
				if(i%j == 0)
					break;
			}
			if(i == j)
				sum+=i;
		}
		System.out.println(sum);
	}
}
