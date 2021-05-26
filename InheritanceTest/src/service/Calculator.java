package service;


//class가 추상메서드를 포함하고 있으면 추상 클래스 입니다.
abstract class Calculator {
	
	//추상메서드 {} 바디가 없는 메서드abstract 키워드를 사용해야한다.
	abstract double area(double r);
	
	/*
	 * double area(double r) { System.out.println("calculator의 area 실행"); return
	 * 3.14*r*r; }
	 */

}

//추상 클래스가 꼭 추상메서드를 꼭 포함하는것은 아니다, 없어도 된다.
abstract class AAA{
	void disp() {
		System.out.println("추상메서드는 없는더ㅏ ,");
	}
}
