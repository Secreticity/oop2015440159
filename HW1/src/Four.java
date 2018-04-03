import java.util.Scanner;

public class Four {

	public static void main(String[] args) {
		//4. 점수(정수)를 입력 받아서 등급(A, B, C, D, E)을 출력하는 프로그램을 작성하시오.
		//(A : 100-80, B: 79-60, C: 59-40, D: 39-20, E: 19-0)

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("점수 입력(정수): ");
		int grade = input.nextInt();
		if(grade <= 100 && grade >= 80)
			System.out.println("등급은 A 입니다.");
		else if(grade <= 79 && grade >= 60)
			System.out.println("등급은 B 입니다.");
		else if(grade <= 59 && grade >= 40)
			System.out.println("등급은 C 입니다.");
		else if(grade <= 39 && grade >= 20)
			System.out.println("등급은 D 입니다.");
		else if(grade <= 19 && grade >= 0)
			System.out.println("등급은 E 입니다.");
		else
			System.out.println("올바르지 않은 입력입니다.");
	}
}
