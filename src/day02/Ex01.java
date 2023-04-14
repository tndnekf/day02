package day02;

public class Ex01 {
	public static void main(String[] args) {
		/*
		 변수 : 데이터를 저장하는 공간
		 자료형 : 데이터가 어떤 값인지에 따라 사용하는 값
		  - int : 정수를 표현 : 4byte(byte : 데이터의 크기)
		  - float / double : 실수를 표현 : 4 / 8 byte
		  - char : 문자 표현 : 2byte
		  - boolean : true 또는 false 표현 : 1byte
		  
		 변수 생성
		  - 자료형 변수명; 또는 자료형 변수명 = 값;
		  - lnumber(x), n22u33m(o)(제일 앞에 숫자가 들어오면 안됨)
		  - changenumber => changeNumber
		    (합성을 사용해서 할 경우에는 첫 시작은 대문자로 해야 한다.)
		  - 예약어는 사용할 수 없다.
		 */
		
		int age = 50;
		float height = 150.0f;
		// 숫자 뒤에 f를 붙이면 4byte를 사용한다는 뜻
		double weight = 20.0;
		
		System.out.println("나의 나이는" + age + "살 입니다.");
		System.out.println(age + "50살의 홍길동 입니다.");
		System.out.println(age + "50살이지만 만으로는 49살입니다.");
		
		// 함수 사용 print 쓰는법.
		System.out.println("나의 나이는" + age + "살 입니다.");
		System.out.println("나의 키는" + height + "(cm)입니다.");
		System.out.println("나의 몸무게" + weight + "(kg)입니다.");
		
		
	}
}
