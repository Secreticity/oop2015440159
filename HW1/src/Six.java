import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("2�ڸ� ���� �Է�: ");
		int switchnum = input.nextInt();
		
		if(switchnum > 99 || switchnum < 10)
			System.out.println("2�ڸ� ������ �ƴմϴ�.");
		else
		{
			int resultnum = switchnum%10*10 + switchnum/10;
			System.out.println("�ڸ����� �ٲ� ����: "+resultnum);
		}
	}
}
