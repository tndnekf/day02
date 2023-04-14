package day02;

import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name; 
		int a;
		int b;
		int c;
		
		
		System.out.print("이름 입력 : ");
		name = input.next();
		
		System.out.print("국어점수 입력 : ");
		a = input.nextInt();
		
		System.out.print("영어점수 입력 : ");
		b = input.nextInt();
		
		System.out.print("수학점수 입력 : ");
		c = input.nextInt();
		
		System.out.println("==============================");
		
		System.out.println("이 름 : " +name);
		
		System.out.println("==============================");
		
		System.out.println("국어점수 : " +a);
		System.out.println("영어점수 : " +b);
		System.out.println("수학점수 : " +c);
		
		System.out.println("==============================");
		
		System.out.println("합계 : " +(a+b+c));
		
		System.out.println("==============================");
		
	}

}
