package cyk1;

public class Dog extends Animal{
	public String name;
	@SuppressWarnings("unused")
	private String IDN;
	String nickName; //*package 접근지정: 패키지 내에서만 public
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
