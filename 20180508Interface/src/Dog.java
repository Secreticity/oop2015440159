
public class Dog extends Animal implements Playable {

	@Override
	void sing() {
		System.out.println("A Dog barks");
	}
	void eat() {
		System.out.println("A dog eats");
	}
	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Walk with a Dog");
	}
	@Override
	public void fetch() {
		// TODO Auto-generated method stub
		System.out.println("Play fetch with a Dog");
	}
}
