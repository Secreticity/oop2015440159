package cyk1;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog tina = new Dog();
		tina.name = "Tina";
		//tina.IDN = "30942394"; ERROR: IDN is a private field.
		tina.nickName = "tt";
		tina.publicField = "U2";
		//tina.privateField = "Sting";
		tina.packageField = "Ed";
		tina.protectedField = "Beatles";
		
	}
}
