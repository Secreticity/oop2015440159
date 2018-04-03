import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("2자리 정수 입력: ");
		int switchnum = input.nextInt();
		
		if(switchnum > 99 || switchnum < 10)
			System.out.println("2자리 정수가 아닙니다.");
		else
		{
			int resultnum = switchnum%10*10 + switchnum/10;
			System.out.println("자리값이 바뀐 정수: "+resultnum);
		}
	}
}
