
public class TestCar {

	public static void main(String[] args) {
		//���� �޼ҵ� (Math.cos(0)) - ��ü�� �������� �ʰ� ����� �� �ִ� �޼ҵ�
		System.out.println(Math.cos(0));
		// TODO Auto-generated method stub

		Car myCar = new Car("Space Blue",300);
		System.out.println(Car.numberofCars);
		Car yourCar = new Car();
		System.out.println(Car.numberofCars);
//		myCar.SetColor("Black");
//		myCar.SetSpeed(100);
		
		System.out.println(myCar);
		System.out.println(yourCar);
	}

}
