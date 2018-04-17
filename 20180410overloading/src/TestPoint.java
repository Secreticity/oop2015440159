
public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point pnt = new Point();
		pnt.setX(1.0);
		pnt.setY(1.0);
		
		pnt.print();
	//	String str = pnt.toString();
	//	System.out.println(str);
	//	System.out.println(pnt);
	//	System.out.println("("+pnt.getX() + ", " + pnt.getY()+")");
		
		Point pnt1 = new Point();
		Point pnt2 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		pnt2.setX(3.0); pnt2.setY(3.0);

		System.out.println(pnt1);
		System.out.println(pnt1.distance());
		System.out.println(pnt1.distance(pnt2));
	}
}
