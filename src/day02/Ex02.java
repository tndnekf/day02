package day02;

public class Ex02 {
	public static void main(String[] args) {
		
		int num = 123;
		char ch = 'a';
		// 문자 하나는 작은 따옴표를 쓴다.
		
		System.out.println("변경전");
		System.out.println("num : " +num);
		System.out.println("ch : " +ch);
		System.out.println("변경후");
		
		num = 500;
		ch = 'B';
		
		System.out.println("num : " +num);
		System.out.println("ch : " +ch);
		
//		int num = 500;
		// 똑같은 변수의 이름을 생성할수는 없다.
		// 함수는 제거 후 변수 이름만 쓰면 적용 가능.
		
		num = num + 200;
		System.out.println("num : " +num);
		// num변수이름 선언 후 현재 num값에 200을 더해준다.
		// 700
		
		
	}
	

}
