
public class Point {

	public double x;  //필드의 유효범위(scope)은 class 전체.
	public double y;
	
	public double distance() {
		double dis;   //지역 변수의 유효범위는 메소드 내부
		dis = Math.sqrt(x*x + y*y);
		return dis;
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
}
