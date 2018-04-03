
public class RememberC {

	public static void main(String[] args) {

		//변수: 메모리 저장공간의 이름
		/*
		 * 자료형:
		 * 1. 변수가 가질 숭 ㅣㅆ는 값의 범위를 정한다.
		 * 2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
		 * 3. 값을 메모리에 저장하기 위해 필요한 정보 (저장공간의 수, 저장포맷)을 정한다.
		 *변수 선언문 
		 * 변수를 사용하기 위해 필요한 아래의 정보를 표현한다.
		 *  1. 사용할 변수의 이름을 지정한다.
		 *  2. 사용할 변수의 자료형을 선언한다.
		 *  3. C언어와 마찬가지로 JAVA에서는 변수를 사용하기 전에 반드시 변수선언을 해야한다.
		 */
		
		int a; //변수 선언문: 1. a는 변수의 이름이다. 2. 변수 a의 자료형은 int 이다.
		int b;
		
		//리터럴(literal): 소스코드에서 값을 표현하는 방법
		//ex. a = 10;  a = 0x10;
		//연산자: 연산을 위한 기호
		//대입연산자 "=": 우변의 값을 좌변의 저장소로 이동한다.
		//수식:(expression):
		//연산자와 피연산자(리터럴, 변수, 수식)들의 조합. 모든 수식은 값을 반환(리턴)한다.
		//부수효과(Side Effect): 수식이 값을 반환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
		
		a = 10;
		a = a * 10 + 20;
		
		//post increment(a++): 반환값은 a, 부수효과는 a = a + 1;
		b = a++;
		
		//pre increment(++a): 반환값은 a+1, 부수효과는 a=a+1;
		b = ++a;
	 
		//Java는 부울 자료형과 true/false 리터럴을 사용한다.
		//논리연산자(&&, ||, !)의 피연산자는 부울 변수 또는 리터럴을 사용해야 한다.
		//관계연산자(>, <, <=, ==, !=)는 부울 값을 반환한다.
		boolean bb;
		bb = false;
		
		System.out.println("bb = " + bb);
		System.out.println("case = " + (0>1));
		
		//Java에서 상수를 선언하려면 final 키워드를 사용해야 한다.		
		final int c = 100;
		//c = 1000; 에러발생! 값을 바꿀 수 없음
		
		//float temperature = 25.6;
		//float temperature2 = 25.6F;
		
		System.out.println("b = "+b+" c =" +c);
		//형변환(casting): 유사한 자료형으로 변환한다.
		int x = 10;
		double y = 100.0;
		y = x; //implicit casting
		System.out.println("x = " + x +" y = " + y);
		
		int y2 = 10;
		double x2 = 100.0;
		y2 = (int) x2; //Explicit casting
		System.out.println("x2 = " + x2 +" y2 = " + y2);
		
		// 10 = a;
		// a = a; 좌변 a는 저장장소. 우변  a는 변수의 값.
		
		System.out.println("a = " + a);
		System.out.println("Hello " + "there");
	}
}
