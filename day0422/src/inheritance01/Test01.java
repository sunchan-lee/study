package inheritance01;
//클래스대 클래스 상속 관계
//추상메서드를 포함하는 클래스는 추상 클래스가 되어야합니다.
 abstract class Super{
	 //추상 메서드
	 //{} body 가 없다.
	 //abstract 키워드
	 abstract void disp();

	 }
 
 abstract class Sub02 extends Super{ 
 }
 
 class Sub03 extends Super{

	@Override
	void disp() {	
		System.out.println("sub03의 disp");
	} 
 }
 
 
 class Sub extends Super{
	 @Override
	 //메서드의 재정의 표현
	 void disp() {
		 System.out.println("sub의 disp입니다");
	 } 
	 
	 void display() {
		 System.out.println("sub의 display입니다");
	 }
	 
	 public Sub() {
		 super();
	 }
	
}


public class Test01 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.disp();
		sub.display();
		System.out.println("---------");
		
		//상속관계에서 sub클래스로 인스턴스화 하고, 변수선언은 super클래스로 객체를 만들었을때
		//1. 멤버의 접근은 super클래스에 존재하는 멤버에만 접근 가능하다.
		//2. sub 클래스에서 메서드 Override(재정의) 가 가능합니다.
		//3. 오버라이드 했을경우 메서드 실행시 오버라이드 된 메서드가 실행됩니다.
		Super su = new Sub();
		su.disp();
		//su.display();
		
		//추상클래스는 단독으로 객체를 생성할수 없다.
		//Super su2 = new Super();
		
		su = new Sub03();
		su.disp();

	}

}
