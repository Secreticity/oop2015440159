import java.util.Scanner;

public class HW2_Problem09 {

	public static void main(String[] args) {

		int inputnum;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("구구단 (1~9) 입력 : ");
			inputnum = input.nextInt();
			if(inputnum > 9 || inputnum < 1)
				System.out.println("숫자를 다시 입력하세요");
			else
			{
				for(int i = 1; i < 10; i++)
					System.out.println(inputnum + " * " + i + " = " + i*inputnum);
			}
		}
		while(inputnum > 9 || inputnum < 1);
	}

}
