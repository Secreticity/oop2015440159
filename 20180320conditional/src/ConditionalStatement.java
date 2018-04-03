/** 20180320 ��ü���� ���α׷���
* ��������: ����(Statement), ���չ�(Compound Statement), ���ǹ�(Conditional Statement), �ݺ���(Loop), �б⹮(Bifurcation)
* ����
* ���ǹ�: if/else if/else; switch/case/break/default;
* �ݺ���: while, for,
* �б⹮: continue, break, return
* ������ (flow chart)
* �Լ�: �Լ�����, �Լ�����
* ������ ��ȿ����, �Ű����� ����
*/

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		
		int score;            //���� �Է�/����� ���� ����
		boolean whilekey = true;     //���α׷��� �ݺ������� ����ϱ� ���� ����
		//int good=0, bad=0;    //�հ�,���հݿ� ���� ���� �þ�� ����
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while(whilekey == true)
		{
			System.out.print("������ �Է��ϼ��� (���Ḧ ���ϸ� -1 �Է�): ");
			score = input.nextInt();  //Ű���忡�� ���� �Է�
			//System.out.println("���� : " + score + "�� �Դϴ�.");
		
			/*
			//������ 60�� �̻��̸� "�հ��Դϴ�", 60�� �̸��̸� "���հ��Դϴ�"�� ���
			if (score >= 60)
			{
				System.out.println("�հ��Դϴ�.");
				good++;
			}
			else if (score >= 0)
			{
				System.out.println("���հ��Դϴ�");
				bad++;
			}
			else if (score == -1)
			{
				System.out.println("========= ���α׷��� �����մϴ�. =========");
				whilekey = 1;
			}//���չ�(compound statement): ���� ������ �߰�ȣ{}�� ���� �ϳ��� �������� ó���Ѵ�.
			else
			{
				System.out.println("�ùٸ��� ���� ���� �Է��Դϴ�.");
			}
			*/
			
			/*
			//������ 80�� �̻��̸� A, 60�� �̻��̸� B, 60�� �̸��̸� F�� ���
			if (score > 100 || score <= -2)
				System.out.println("�ùٸ��� ���� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			else if (score >= 80)
				System.out.println("����� ������ A�Դϴ�.");
			else if (score >= 60)
				System.out.println("����� ������ B�Դϴ�.");
			else if (score < 60 && score >= 0)
				System.out.println("����� ������ F�Դϴ�. �� ����ϼ���.");
			else if (score == -1)
			{
				System.out.println("========= ���α׷��� �����մϴ�. =========");
				whilekey = false;
			}
			*/
			//switch���� ����Ͽ� 0->"����", 1->"�ϳ�", 2->"��", 0/1/2 �� �ƴ� ��� "����"�� ���
			switch(score) {
			case 0:
				System.out.println("����");
				break;                      //case������ break�� ���ָ� ���� case�� ������� ���� ����ȴ�.
			case 1:
				System.out.println("�ϳ�");
				break;
			case 2:
				System.out.println("��");
				break;
			case -1:
				System.out.println("========= ���α׷��� �����մϴ�. =========");
				whilekey = false;
				break;
			default:
				System.out.println("����");
				break;
			}
		}
	}
}
