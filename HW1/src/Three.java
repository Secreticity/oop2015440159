import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. �� ��(������)�� �Է� �޾� ���� ū ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("ù��° �����Է�: ");
		int fnum = input.nextInt();
		System.out.print("�ι�° �����Է�: ");
		int snum = input.nextInt();
		System.out.print("����° �����Է�: ");
		int tnum = input.nextInt();
		
		if (fnum >= snum)
		{
			if(fnum >= tnum)
				System.out.println("���� ū ���� "+fnum+"�Դϴ�.");
			else
				System.out.println("���� ū ���� "+tnum+"�Դϴ�.");					
		}
		else
		{
			if(snum >= tnum)
				System.out.println("���� ū ���� "+snum+"�Դϴ�.");
			else
				System.out.println("���� ū ���� "+tnum+"�Դϴ�.");
		}
		System.out.println("----------���α׷�����-----------");
	}
}
