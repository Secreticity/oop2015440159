
public class TestCar {

	public static void main(String[] args) {
		//정적 메소드 (Math.cos(0)) - 객체를 생성하지 않고 사용할 수 있는 메소드
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
