
public class stringequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		str1 = str2;  //str1에 있는 주소가 사라지기 때문에 str1과 연결되어있던 Hello 객체는 주소를 잃어버리게 된다.
		//garbage collector 프로세스가 따로 있어 java virtual machine에서 1초에 10번가량 청소를 한다.
		//변수들은 stack에, 객체는 heap 영역에.
		
		System.out.println("str1 == str2 : " + (str1 == str2));
	}

}
