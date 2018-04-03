
public class loop {

	public static void main(String[] args) {
		
		/*
		//1 ~ 10 정수를 화면에 출력
		
		int i;                      //i 는 루프변수
		i = 1;                      //1. 루프변수 초기화
		while(i<=10)                //2. 루프 조건식
		{
			System.out.println(i);  //3. 루프문
			i++;                    //4. 루프변수 변화
		}
		
		System.out.println("------------프로그램 종료 -------------");
		*/
		
		/*
		int i;               //i 는 루프변수
		int sum;
		i = 1;               //1. 루프변수 초기화
		sum = 0;
		while(i<=10)         //2. 루프 조건식
		{
			sum = sum + i;   //3. 루프문
			i++;             //4. 루프변수 변화
		}
		System.out.println("Sum is " + sum);
		*/
		
		//continue문을 사용하여 문자열에서 특정 문자 개수 세기
		String str = "hello darkness my old friend";
		int count = 0;
		for (int i = 0; i <str.length(); i++) {
			if(str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견된 l의 개수 " +count);
	}
}
