package service;
//추상클래스는 단일 상속만 가능하다.

//인터페이스는 class에 다중 구현이 가능하고
//같은 인터페이스간에 다중상속이 가능합니다.

public interface InterTest {
	//구성요소
	//클래스와 비교했을때 생성자는 존재하지 않는다..
	//InterTest(){}
		//Interfaces cannot have constructors
	
	void disp(); 			//abstract 키워드를 생략해서 써도 된다.
	abstract void disp2();
	//기본메서드가 추상메서드
	//추상메서드 : 바디가 없는 메서드
	
	//java8
	//{} 바디가 있는 메서드도 허용
	//대신 키워드를 사용:: default or static
	default void disp3() {}
	static void disp4() {}
	//단독으로 객체 생성이 불가능
	//객체를 생성하지않고 사용가능하도록 만들자.
	//static final 필드만 허용하는 상수
	// 키워드는 생략 가능합니다
	static final int a=10;
	static int b=10;
	final int c=30;
	int d=40;
	class AAA{}
	

}
