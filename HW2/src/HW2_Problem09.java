import java.util.Scanner;

public class HW2_Problem09 {

	public static void main(String[] args) {

		int inputnum;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		do {
			System.out.print("������ (1~9) �Է� : ");
			inputnum = input.nextInt();
			if(inputnum > 9 || inputnum < 1)
				System.out.println("���ڸ� �ٽ� �Է��ϼ���");
			else
			{
				for(int i = 1; i < 10; i++)
					System.out.println(inputnum + " * " + i + " = " + i*inputnum);
			}
		}
		while(inputnum > 9 || inputnum < 1);
	}

}
