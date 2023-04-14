package day02;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex03 {
	public static void main(String[] args) {
		
		/*
		 자료현 변환
		  - 특정 자료형을 다른 자료형으로 변환하는 것
		 */
		
		char ch = 'a';
		int num = 65;
		System.out.println(num);
		System.out.println(ch);
		System.out.println();
		
//		char ch02 = num;
		// 2byte를 4byte를 넣겠다는 걸로 오류가 난다.
		char ch02 = (char)num; // 강제형변화
		// char로 변환시켜줘서 오류가 안난다.
		int num02 = ch; // 자동형 변환
		// 4byte를 2byte를 넣겠다는 걸로 오류가 안남.
		
		System.out.println(num02);
		System.out.println(ch02);
		
	}
	

}
