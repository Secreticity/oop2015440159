
public class loop {

	public static void main(String[] args) {
		
		/*
		//1 ~ 10 ������ ȭ�鿡 ���
		
		int i;                      //i �� ��������
		i = 1;                      //1. �������� �ʱ�ȭ
		while(i<=10)                //2. ���� ���ǽ�
		{
			System.out.println(i);  //3. ������
			i++;                    //4. �������� ��ȭ
		}
		
		System.out.println("------------���α׷� ���� -------------");
		*/
		
		/*
		int i;               //i �� ��������
		int sum;
		i = 1;               //1. �������� �ʱ�ȭ
		sum = 0;
		while(i<=10)         //2. ���� ���ǽ�
		{
			sum = sum + i;   //3. ������
			i++;             //4. �������� ��ȭ
		}
		System.out.println("Sum is " + sum);
		*/
		
		//continue���� ����Ͽ� ���ڿ����� Ư�� ���� ���� ����
		String str = "hello darkness my old friend";
		int count = 0;
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("���忡�� �߰ߵ� l�� ���� " +count);
	}
}
