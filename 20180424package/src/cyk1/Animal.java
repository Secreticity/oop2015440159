package cyk1;

public class Animal {
	
	public String publicField;
	@SuppressWarnings("unused")
	private String privateField;
	String packageField;
	
	//protected: 패키지 여부와 상관없이 상속됨.
	//           동일 패키지 내에서는 public
	//           타 패키지에서는 private
	protected String protectedField;

	Animal() {
		publicField = "Public";
		privateField = "Private";
		packageField = "Package";
		protectedField = "Protected";
	}
}
