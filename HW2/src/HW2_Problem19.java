import java.util.Scanner;

public class HW2_Problem19 {

	public static void main(String[] args) {
		// 19. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���ڰ� �Ҽ����� �ƴ����� �˻��ϴ� ���α׷��� �ۼ��Ͻÿ�.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
		int i, prime = input.nextInt();
		if(prime == 1)
			System.out.println("�Ҽ��� �ƴմϴ�.");
		else
		{
			for(i = 2; i < prime; i++)
			{
				if(prime%i == 0)
				{
					System.out.println("�Ҽ��� �ƴմϴ�.");
					break;
				}
			}
			if(prime == i)
				System.out.println("�Ҽ��Դϴ�.");

		}
	}
}
