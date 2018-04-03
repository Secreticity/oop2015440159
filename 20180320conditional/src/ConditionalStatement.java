/** 20180320 객체지향 프로그래밍
* 순서제어: 문장(Statement), 복합문(Compound Statement), 조건문(Conditional Statement), 반복문(Loop), 분기문(Bifurcation)
* 문장
* 조건문: if/else if/else; switch/case/break/default;
* 반복문: while, for,
* 분기문: continue, break, return
* 순서도 (flow chart)
* 함수: 함수선언, 함수정의
* 변수의 유효범위, 매개변수 전달
*/

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int score;            //성적 입력/출력을 위한 변수
		boolean whilekey = true;     //프로그램을 반복적으로 사용하기 위한 변수
		//int good=0, bad=0;    //합격,불합격에 따라 수가 늘어나는 변수
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while(whilekey == true)
		{
			System.out.print("성적을 입력하세요 (종료를 원하면 -1 입력): ");
			score = input.nextInt();  //키보드에서 숫자 입력
			//System.out.println("성적 : " + score + "점 입니다.");
		
			/*
			//성적이 60점 이상이면 "합격입니다", 60점 미만이면 "불합격입니다"를 출력
			if (score >= 60)
			{
				System.out.println("합격입니다.");
				good++;
			}
			else if (score >= 0)
			{
				System.out.println("불합격입니다");
				bad++;
			}
			else if (score == -1)
			{
				System.out.println("========= 프로그램을 종료합니다. =========");
				whilekey = 1;
			}//복합문(compound statement): 여러 문장을 중괄호{}로 묶어 하나의 문장으로 처리한다.
			else
			{
				System.out.println("올바르지 않은 점수 입력입니다.");
			}
			*/
			
			/*
			//성적이 80점 이상이면 A, 60점 이상이면 B, 60점 미만이면 F가 출력
			if (score > 100 || score <= -2)
				System.out.println("올바르지 않은 입력입니다. 다시 입력해주세요.");
			else if (score >= 80)
				System.out.println("당신의 학점은 A입니다.");
			else if (score >= 60)
				System.out.println("당신의 학점은 B입니다.");
			else if (score < 60 && score >= 0)
				System.out.println("당신의 학점은 F입니다. 더 노력하세요.");
			else if (score == -1)
			{
				System.out.println("========= 프로그램을 종료합니다. =========");
				whilekey = false;
			}
			*/
			//switch문을 사용하여 0->"없음", 1->"하나", 2->"둘", 0/1/2 가 아닌 경우 "많음"을 출력
			switch(score) {
			case 0:
				System.out.println("없음");
				break;                      //case문에서 break를 없애면 다음 case의 내용까지 같이 수행된다.
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case -1:
				System.out.println("========= 프로그램을 종료합니다. =========");
				whilekey = false;
				break;
			default:
				System.out.println("많음");
				break;
			}
		}
	}
}
