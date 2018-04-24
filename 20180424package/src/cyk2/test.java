package cyk2;

import cyk1.*;

@SuppressWarnings("unused")
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Basil aBasil = new Basil();
		aBasil.name = "JYoung";
//		aBasil.age = "2";  ERROR: age is a private field.
		
		//타 패키지의 클라스를 사용하려면,
		//1. 패키지명.클라스명 으로 접근
		//2. import cyk1.*;
		//   import cyk1.Dog;
		
		cyk1.Dog aDog = new cyk1.Dog();
		aDog.name = "happy";
		//error aDog.IDN = "23232";
//		aDog.nickName = "tt"; ERROR: nickName은 패키지 접근지정
	}

}
