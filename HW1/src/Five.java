import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Choose one of the following\napple\norange\nbanana\npeach");
		System.out.print("\nenter your chioce here : ");
		String inputstr = input.nextLine();
		if (inputstr.matches("apple") || inputstr.matches("orange") || inputstr.matches("banana") || inputstr.matches("peach"))
			System.out.println("Your choice is " + inputstr);
		else
			System.out.println("There is no such fruit on the menu.");
		System.out.println(" ------------- 프로그램 종료 ------------- ");
	}
}
