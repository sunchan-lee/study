package generic.method;

import generic.NewBox;

//와일드카드<?>, 		:제한이 없음 * 모든것
//타입파라미터를 대치하는 구체적인 타입으로 모든 클래스나 인터페이스 타입이 올수 있다..
//타입 파라미터를 대치하는 구체적인 타입으로 상위 타입이나 ㅐ하위타입만 올수 있다.
//<? extends ...>,  : upper bounded wildcard(상위클래스 제한) -> .. 타입 상속받은(하위) 타입만 허용
//<? super ...>     : lower bounded wildcard(하위클래스 제한) -> .. 타입 위로 혀용

public class Test04 {
	
	public static void disp(NewBox<?> box) {
		System.out.println(box.getT());
		
	}
	
	public static void disp2(NewBox<? extends Number> box) {
		System.out.println(box.getT());
		
	}
	
	public static void disp3(NewBox<? super Integer> box) {
		System.out.println(box.getT());
		
	}

	public static void main(String[] args) {
		NewBox<Integer> box=new NewBox<>();
		box.setT(10);
		disp(box);
		
		NewBox<String> box2=new NewBox<>();
		box2.setT("문자열");
		disp(box2);
		
		NewBox<Double> box3=new NewBox<>();
		box3.setT(3.14);
		disp(box3);
		
		System.out.println("==========");
		disp2(box);		//숫자 포함, 상속 가능
		//disp2(box2);	//숫자 미포함, 상속 불가능
		disp2(box3);	//숫자 포함, 상속 가능
		
		System.out.println("==========");
		disp3(box);		
		//disp3(box2);	
		//disp3(box3);	

	}

}
