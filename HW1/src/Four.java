import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		//4. ����(����)�� �Է� �޾Ƽ� ���(A, B, C, D, E)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�(����): ");
		int grade = input.nextInt();
		if(grade <= 100 && grade >= 80)
			System.out.println("����� A �Դϴ�.");
		else if(grade <= 79 && grade >= 60)
			System.out.println("����� B �Դϴ�.");
		else if(grade <= 59 && grade >= 40)
			System.out.println("����� C �Դϴ�.");
		else if(grade <= 39 && grade >= 20)
			System.out.println("����� D �Դϴ�.");
		else if(grade <= 19 && grade >= 0)
			System.out.println("����� E �Դϴ�.");
		else
			System.out.println("�ùٸ��� ���� �Է��Դϴ�.");
	}
}
