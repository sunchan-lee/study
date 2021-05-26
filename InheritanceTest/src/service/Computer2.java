package service;

public class Computer2 extends Calculator {
	
	//부모 객체 에 있는것을 재정의 한다..
	@Override
	double area(double r) {
		System.out.println("Computer의 area 실행");
		return 3.14*r*r;
	}

}
