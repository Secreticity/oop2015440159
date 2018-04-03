import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		//2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("정수입력: ");
		int input_i = input.nextInt();
		if(input_i%2 == 0)
			System.out.println("입력받은 정수는 짝수입니다");
		else
			System.out.println("입력받은 정수는 홀수입니다.");
	}

}
