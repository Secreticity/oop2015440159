package cyk1;

public class Dog extends Animal{
	public String name;
	@SuppressWarnings("unused")
	private String IDN;
	String nickName; //*package ��������: ��Ű�� �������� public
	void print() {
		System.out.println(publicField);
		//System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}
}
