import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//1. �� ��(����)�� �Է� �޾�, �� �� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° �����Է�: ");
		int first_number = input.nextInt();
		System.out.print("�ι�° �����Է�: ");
		int second_number = input.nextInt();
		if (first_number > second_number)
			System.out.println("�� ū ���� ù��° ���� " + first_number + "�Դϴ�.");
		else if (second_number > first_number)
			System.out.println("�� ū ���� �ι�° ���� " + second_number + "�Դϴ�.");
		else
			System.out.println("�Է¹��� �� ���ڴ� " + first_number + "�� �����ϴ�.");
		System.out.println(" ========== ���α׷� ���� ========== ");
	}
}
