package inheritance;

public class InheritanceTest2 {

	public static void main(String[] args) {
		DMBPhone dmbPhone = new DMBPhone(10, "JSP", "검정");
		System.out.println(dmbPhone.channel);
		
		//다형성
		CellPhone cellPhone = new DMBPhone(10, "JSP", "검정");
		//자식객체로 생성하고 부모 변수로 접근한다.
		
		cellPhone.powerOn();
		cellPhone.powerOff();
		
		

	}

}
