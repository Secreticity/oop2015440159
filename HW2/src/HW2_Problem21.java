import java.util.Scanner;

public class HW2_Problem21 {

	public static void main(String[] args) {
		//21. ����ڷκ��� �� ���ڸ� �Է¹޾�, �Է¹��� ���� ������ �Ҽ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("���� �Է�: ");
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
