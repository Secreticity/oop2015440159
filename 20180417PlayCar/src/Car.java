
public class Car {

	//Field Definition
	private String color;
	private int speed;
	
	//static field (��������)
	public static int numberofCars = 0;
	
	//Constructor(������): method ���� Ŭ�� �̸��� ����. ��ȯ���� ����.!
	//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ��ϵ� ���� �ʴ´�.
	public Car(String color, int speed){
		this.color = color;
		this.speed = speed;
		
		numberofCars++;
	}
	public Car() {
		this.color = "White";
		this.speed = 60;

		numberofCars++;
	}

	//Methods
	public static void NowStatus() {
		//static methods can access to static field ONLY. 
//		System.out.println(this.color +", "+this.speed); error
		System.out.println(numberofCars);
	}
	public String GetColor() {
		return this.color;
	}
	public int GetSpeed() {
		return this.speed;
	}
	public void SetColor(String color) {
		this.color = color;
	}
	public void SetSpeed(int speed) {
		this.speed = speed;
	}
	public String toString() {
		return ("Color is " + this.color+".\nSpeed is "+ this.speed+".");
	}
}
