
public class Test {

	public static void main(String[] args) {
		Point k = new Point();
		Point n = new Point();
		
		k.x = 10;   //객체의 필드(속성) 접근
		k.y = 10;   //Java에서는 x, y를 field라고 한다.
		
		n.x = 5;
		n.y = 5;
		
		k = k.move(n);
		System.out.println(k.x + ", " + k.y);
		System.out.println(k.distance());
	}

}
