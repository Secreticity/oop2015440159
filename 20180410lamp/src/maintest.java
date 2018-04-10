
public class maintest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desklamp lamp = new Desklamp();
		
		//초기화 하지 않았을 때의 상태
//		System.out.println(lamp.isOn());
		System.out.println(lamp);
		
		//램프를 켠다.
		lamp.turnOn();
		System.out.println(lamp);
//		System.out.println(lamp.isOn());
		
		//램프를 끈다.
		lamp.turnOff();
		System.out.println(lamp);
//		System.out.println(lamp.isOn());
	}

}
