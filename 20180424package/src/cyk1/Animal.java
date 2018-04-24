package cyk1;

public class Animal {
	
	public String publicField;
	@SuppressWarnings("unused")
	private String privateField;
	String packageField;
	
	//protected: ��Ű�� ���ο� ������� ��ӵ�.
	//           ���� ��Ű�� �������� public
	//           Ÿ ��Ű�������� private
	protected String protectedField;

	Animal() {
		publicField = "Public";
		privateField = "Private";
		packageField = "Package";
		protectedField = "Protected";
	}
}
