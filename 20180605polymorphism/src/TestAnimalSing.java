
public class TestAnimalSing {

	public static void main(String[] args) {
		AnimalSing as = new AnimalSing();
		as.add(new Dog("Tina"));
		as.add(new Dog("Happy"));
		as.add(new Dog("Baduk"));
		as.add(new Dog("Mint"));
		as.add(new Cat("Beni"));
		as.add(new Cat("Inmun"));
		as.add(new Cat("Ruru"));
		as.add(new Cat("Nero"));

//		Animal aDog = new Dog("Tina");  //Upcasting
//		Animal aCat = new Cat("Mango");

		as.sing();
	}

}
