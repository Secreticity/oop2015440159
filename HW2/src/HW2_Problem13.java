import java.util.Scanner;

public class HW2_Problem13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("��(month)�� �Է�: ");
		int month = input.nextInt();
		System.out.print("��(day)�� �Է�: ");
		int day = input.nextInt();
		int totaldate = 0;
		for(int i = 1; i <= month; i++) {
			if(month > i)
				if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					totaldate = totaldate + 31;
				else if(i == 4 || i == 6 || i == 9 || i == 11)
					totaldate = totaldate + 30;
				else
					totaldate = totaldate + 28;
			else
				totaldate = totaldate + day;
		}
		System.out.println(totaldate);
	}
}
