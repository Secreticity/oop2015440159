
public class TestPolygon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle tri = new Triangle();
		tri.height = 2.0;
		tri.width = 3.0;
		
		System.out.println(tri.area());
		
		Rectangle rect = new Rectangle();
		rect.height = 2.0;
		rect.width = 3.0;
		
		System.out.println(rect.area());
	}
}
