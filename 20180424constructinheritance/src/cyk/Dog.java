package cyk;

public class Dog extends Animal {

	public Dog() {
		// ����� ����Ŭ���� ������ ȣ�� super();
		super();
		System.out.println("Dog Default Constructor\n");
	}
	public Dog(int a) {
		super(a);
		System.out.println("Dog Integer-type Constructor\n");
	}
}
