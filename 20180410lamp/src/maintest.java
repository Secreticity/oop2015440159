
public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desklamp lamp = new Desklamp();
		
		//�ʱ�ȭ ���� �ʾ��� ���� ����
//		System.out.println(lamp.isOn());
		System.out.println(lamp);
		
		//������ �Ҵ�.
		lamp.turnOn();
		System.out.println(lamp);
//		System.out.println(lamp.isOn());
		
		//������ ����.
		lamp.turnOff();
		System.out.println(lamp);
//		System.out.println(lamp.isOn());
	}

}
