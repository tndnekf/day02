package day02;

public class Ex04 {
	public static void main(String[] args) {
		
		/*
		 상수 : 한 번 저장하면 변경할 수 없다.
		 */
		
		final int num = 100;
//		num = 200;
		// final : 한번 값을 지정하면 변경할 수 없다.
		System.out.println(num);
		
		String name = "홍길동";
		// string : 문자열을 저장할 수 있다.
		System.out.println(name);
		
		final String KOREA = "대한민국";
//		KOREA = "미국";
		System.out.println(KOREA);
		// 값을 변경하면 안될때 final을 사용해서 변경 못하게 한다.
		// 대분자로 상수화 시킨다.
		
		boolean bool = true;
		System.out.println(bool);
		
		bool = false;
		System.out.println(bool);
		// boolean 참 또는 거짓만 저장이 가능하다.
		
		String addr;
		addr = "산골짜기";
		System.out.println(addr);
		
		int n1, n2, sum;
		n1 = 10;
		n2 = 20;
		sum = n1 + n2;
		System.out.println(sum);
		System.out.println(n1+n2);
		// 변수를 저장해서 써도 되고 나중에 출력할때 변수를 대입해도 된다.
		
		int num1=0, num2=0, sum2=0;
//		sum2 = num1 + num2;
		System.out.println(sum2);
		// 변수를 아무것도 대입하지 않아서 알수없는 값을 출력하게 되므로 에러가 발생.
		// 무조건 선언하고 변수를 대입해야 한다.
		
//		String null;
//		System.out.println(null);
		// 첫글자가 대문자면 무조건 null로 
		// 첫글자가 소문자면 무조건 0으로 초기화를 해야한다.
		
		
	}
	
}
