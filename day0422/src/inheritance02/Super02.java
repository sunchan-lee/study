package inheritance02;
interface Super03{}
public interface Super02 {
	//구성요소로 추상메서드를 허용합니다.
	//abstract 키워드 생략 가능
	void disp();//추상 메서드
	
	//8버전 이상부터 허용
	//default 메서드 키워드 명시하세요
	default void disp2(){
		//a=20;
		System.out.println("default 메서드");
	}
	
	//static 메서드 키워드 명시하세요
	static void disp3(){
		System.out.println("static 메서드");
	}
	
	//final 생략 되어있어도 기본으로 final 필드입니다.
	//final 선언시 초기화가 되어야 하고 이후 대입불가 ..
	int a=10;
	final int b=20;
	final static int c = 30;
	//인터페이스의 멤버는 모두 final static 입니다
	//키워드는 생략.
	
	//인터페이스는 생성자가 존재하지 않는다.
	//Super01(){}
	
	

}
