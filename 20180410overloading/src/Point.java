
public class Point {

	private double x;
	private double y;
	
	//Methods
	public double distance() {
		
		double dis;   //지역 변수의 유효범위는 메소드 내부
		dis = Math.sqrt(x*x + y*y);
		return dis;
	}
	
	//Distance Method
	public double distance(Point p) {  //Method Overloading : Same method name, but different actions according to parameters.
		
		return Math.sqrt( (this.x - p.getX())*(this.x - p.getX())+(this.y - p.getY())*(this.y - p.getY()) );
	}
	public Point move(Point p) {    //매개 변수 p의 유효범위는 메소드 내부
		double a, b;  //지역 변수

		//C : P2 = move(p1, p);
		//Java: P2 = P1.move(p);
		
		//포인트 p  만큼 이동
		a = x + p.x;  //this.x , 혹은 x 로 사용가능. - 필드와 지역 변수간 혼동을 막기 위해 this. 를 사용
		b = y + p.y;

		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
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
