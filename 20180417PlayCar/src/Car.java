
public class Car {

	//Field Definition
	private String color;
	private int speed;
	
	//static field (정적변수)
	public static int numberofCars = 0;
	
	//Constructor(생성자): method 명이 클라스 이름과 같다. 반환형이 없다.!
	//만약 생성자를 정의하지 않으면 매개변수 없는 생성자를 자바에서 자동으로 생성해준다.
	//하지만, 생성자를 하나라도 정의하면 자바는 아무일도 하지 않는다.
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
