
public class Point {

	private double x;
	private double y;
	
	//Methods
	public double distance() {
		
		double dis;   //���� ������ ��ȿ������ �޼ҵ� ����
		dis = Math.sqrt(x*x + y*y);
		return dis;
	}
	
	//Distance Method
	public double distance(Point p) {  //Method Overloading : Same method name, but different actions according to parameters.
		
		return Math.sqrt( (this.x - p.getX())*(this.x - p.getX())+(this.y - p.getY())*(this.y - p.getY()) );
	}
	public Point move(Point p) {    //�Ű� ���� p�� ��ȿ������ �޼ҵ� ����
		double a, b;  //���� ����

		//C : P2 = move(p1, p);
		//Java: P2 = P1.move(p);
		
		//����Ʈ p  ��ŭ �̵�
		a = x + p.x;  //this.x , Ȥ�� x �� ��밡��. - �ʵ�� ���� ������ ȥ���� ���� ���� this. �� ���
		b = y + p.y;

		//���ο� ����Ʈ ����
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//���ο� ����Ʈ ��ȯ
		return pnt;
	}	
	public void print() {
		System.out.println("("+this.getX() + ", " + this.getY()+")");
		System.out.println("("+this.x + ", " + this.y+")");
		System.out.println("("+x + ", " + y+")");		
	}
	public String toString() {
		return ("("+this.x+", "+this.y + ")");
	}
	//Getters & Setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}	
}
