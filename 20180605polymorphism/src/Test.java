
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal aDog = new Dog("Tina");  //Upcasting
		Animal aCat = new Cat("Mango");
		
		aDog.sing();
		aCat.sing();

		((Dog) aDog).playFetch();  //Downcasting
		((Dog) aCat).playFetch();
	}

}
