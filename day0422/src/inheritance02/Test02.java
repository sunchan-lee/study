package inheritance02;

public class Test02 {
	
	public static void main(String [] args) {
		//추상메서드(미완성코드) 가 있으므로 단독으로 객체생성 불가
		//interface는 생성자가 존재하지 않습니다.
		//Super02 super02 = new Super02();
		
		//1. 클래스에 상속시켜서 접근...
		Super02 super02 = new Sub02();
		super02.disp();
		super02.disp2();
		//static 메서드
		Super02.disp3();
		
		//System.out.println("a : "+ super02.a);
		//System.out.println("b : "+ super02.b);
		
		System.out.println("a : "+ Super02.a);
		System.out.println("b : "+ Super02.b);
		System.out.println("c : "+ Super02.c);
		
		//이런 방법으로도 객체 생성이 가능하다
		Super02 super022 = new Super02() {
			
			@Override
			public void disp() {
				
			}
		};
		
		
	}
	
	
	

}
