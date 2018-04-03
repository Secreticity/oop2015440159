import java.util.Scanner;

public class HW2_Problem11 {

	public static void main(String[] args) {
		
		int inputnum, i;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("\n인수를 알아볼 정수입력 : ");
			inputnum = input.nextInt();
			if(inputnum == 0)
				System.out.println("---- 프로그램 종료 ----");
			else
			{
				System.out.print(inputnum + " => ");
				for(i = 2; i < inputnum; i++)
					if(inputnum % i == 0)
					{
						System.out.print(i);
						if(inputnum/2 > i)
							System.out.print(" , ");
					}
			}
		}
		while(inputnum != 0);
	}
}
