import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("�����Է�: ");
		int input_i = input.nextInt();
		if(input_i%2 == 0)
			System.out.println("�Է¹��� ������ ¦���Դϴ�");
		else
			System.out.println("�Է¹��� ������ Ȧ���Դϴ�.");
	}

}
