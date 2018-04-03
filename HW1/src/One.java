import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		//1. 두 수(정수)를 입력 받아, 그 중 큰 수를 출력하는 프로그램을 작성하시오.
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수입력: ");
		int first_number = input.nextInt();
		System.out.print("두번째 정수입력: ");
		int second_number = input.nextInt();
		if (first_number > second_number)
			System.out.println("더 큰 수는 첫번째 정수 " + first_number + "입니다.");
		else if (second_number > first_number)
			System.out.println("더 큰 수는 두번째 정수 " + second_number + "입니다.");
		else
			System.out.println("입력받은 두 숫자는 " + first_number + "로 같습니다.");
		System.out.println(" ========== 프로그램 종료 ========== ");
	}
}
