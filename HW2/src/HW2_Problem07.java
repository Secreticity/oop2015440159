import java.util.Scanner;

public class HW2_Problem07 {

	public static void main(String[] args) {
		
		int sum = 0;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int inputnum;
		do {
			System.out.print("���� �Է�: ");
			inputnum = input.nextInt();
		
			if(inputnum != 0){
				sum = sum + inputnum;
			}
		}
		while(inputnum != 0);
		System.out.println(sum);
	}

}
