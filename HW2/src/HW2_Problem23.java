
public class HW2_Problem23 {

	public static void main(String[] args) {
		//23.***** *
		//*** ***
		//* *****
		//�� ����Ͻÿ�(�ݺ��� �Ἥ!)

		int i, j;
		for(i = 1; i <= 3; i++)
		{
			for(j = 7; j >= 1; j--)
			{
				if(j == (i*2))
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
