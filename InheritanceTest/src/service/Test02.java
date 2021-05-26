package service;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		//Calculator calculator = new Calculator();
		//System.out.println(calculator.area(10));
		
		//Computer computer = new Computer();
		//System.out.println(computer.area(10));
		
		//다형성 재생성
		Calculator calculator2 = new  Computer();
		//오버라이드 메서드를 호춣하면 자식클래스에서 재정의한 로직이 실행된다.
		System.out.println(calculator2.area(10));
		Computer computer=(Computer) calculator2;
		
		Computer computer10=new Computer();
		
		//추상클래스는 인스턴스화가 불가능합니다. 미완성 코드가 포함되었다.
		//Calculator calculator3= new Calculator();
		//클래스에 상속해서 추상메서드는 오버라이드(메서드의{}바디를 구현) 해서 객체생성하세요.
		
		System.out.println("1. 정밀용 2. 표준 3. 학생");
		System.out.println("컴퓨터 선택 : ");
		int n=new Scanner(System.in).nextInt();
		
		Calculator cal=null;
		switch (n) {
		case 1:
			cal=new Computer(); break;
		case 2:
			cal=new Computer3(); break;
		case 3:
			cal=new Computer2(); break;
		}
		System.out.println(cal.area(10));
		
		System.out.println(InterTest.a);
		System.out.println(InterTest.b);
		System.out.println(InterTest.c);
		System.out.println(InterTest.d);
	}

}
