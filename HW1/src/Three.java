import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		//3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수입력: ");
		int fnum = input.nextInt();
		System.out.print("두번째 정수입력: ");
		int snum = input.nextInt();
		System.out.print("세번째 정수입력: ");
		int tnum = input.nextInt();
		
		if (fnum >= snum)
		{
			if(fnum >= tnum)
				System.out.println("제일 큰 수는 "+fnum+"입니다.");
			else
				System.out.println("제일 큰 수는 "+tnum+"입니다.");					
		}
		else
		{
			if(snum >= tnum)
				System.out.println("제일 큰 수는 "+snum+"입니다.");
			else
				System.out.println("제일 큰 수는 "+tnum+"입니다.");
		}
		System.out.println("----------프로그램종료-----------");
	}
}
