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
		
		//�캯�� Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ��������. �º� <-- �캯
		Animal aaa = new Dog();
		// = Animal aaa = (Animal) new Dog(); Upcasting ����� ĳ����
		//overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//Polymorphism
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. SuperClass SuperRefVar = new SubClass();
		//3. superRefVar.overridedMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ҵ带 �����Ѵ�.
		
		Scanner ss = new Scanner(System.in);
		System.out.println("print:");
		String str = ss.next();
		if (str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); //Dynamic Binding ���� ���ε�: ���α׷� ���� �� ȣ���� �޼ҵ带 �����Ѵ�.
		// �߻� Ŭ���� ��ü�� ���� �� ����: aaa = new Animal();
	}

}
