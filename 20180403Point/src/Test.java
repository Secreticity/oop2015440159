
public class Test {

	public static void main(String[] args) {
		Point k = new Point();
		Point n = new Point();
		
//		k.x = 10;   //��ü�� �ʵ�(�Ӽ�) ����
//		k.y = 10;   //Java������ x, y�� field��� �Ѵ�.
		
//		n.x = 5;
//		n.y = 5;
		
		k.setX(1.0); //�����ڸ� ����� �ʵ尪 ����
		k.setY(1.0);
		
		k = k.move(n);
		System.out.println(k.getX() + ", " + k.getY());
		System.out.println(k.distance());
	}
}
