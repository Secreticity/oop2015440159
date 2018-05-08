import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Animal aaa = new Animal();
//		aaa.sing();
//		Dog tina = new Dog();
//		tina.sing();
//		tina.eat();
//		aaa.eat();
		
		//우변의 클라스가 좌변 클라스의 subclass이면 전혀 문제없다. 좌변 <-- 우변
		Animal aaa = new Dog();
		// = Animal aaa = (Animal) new Dog(); Upcasting 상향식 캐스팅
		//overriding한 메소드를 호출하면 subclass의 메소드를 수행한다.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//Polymorphism
		//1. 하나의 클라스로부터 여러 서브클라스를 만들 경우
		//2. 모든 서브클라스는 수퍼클라스의 메소드를 override한다.
		//3. SuperClass SuperRefVar = new SubClass();
		//3. superRefVar.overridedMethod() -> 객체의 클라스가 구현한 메소드를 실행한다.
		
		Scanner ss = new Scanner(System.in);
		System.out.println("print:");
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); //Dynamic Binding 동적 바인딩: 프로그램 수행 시 호출할 메소드를 결정한다.
		// 추상 클라스의 객체를 만들 수 없다: aaa = new Animal();
	}

}
