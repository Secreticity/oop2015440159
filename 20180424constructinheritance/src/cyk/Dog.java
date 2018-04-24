package cyk;

public class Dog extends Animal {

	public Dog() {
		// 명시적 수퍼클라스의 생성자 호출 super();
		super();
		System.out.println("Dog Default Constructor\n");
	}
	public Dog(int a) {
		super(a);
		System.out.println("Dog Integer-type Constructor\n");
	}
}
