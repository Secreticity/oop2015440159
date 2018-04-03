
public class Point {

	public double x;  //�ʵ��� ��ȿ����(scope)�� class ��ü.
	public double y;
	
	public double distance() {
		double dis;   //���� ������ ��ȿ������ �޼ҵ� ����
		dis = Math.sqrt(x*x + y*y);
		return dis;
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
}
