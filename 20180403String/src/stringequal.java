
public class stringequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		str1 = str2;  //str1�� �ִ� �ּҰ� ������� ������ str1�� ����Ǿ��ִ� Hello ��ü�� �ּҸ� �Ҿ������ �ȴ�.
		//garbage collector ���μ����� ���� �־� java virtual machine���� 1�ʿ� 10������ û�Ҹ� �Ѵ�.
		//�������� stack��, ��ü�� heap ������.
		
		System.out.println("str1 == str2 : " + (str1 == str2));
	}

}
