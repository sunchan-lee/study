package inheritance;

public class InheritanceTest01 {

	public static void main(String[] args) {
		
		DMBPhone dMBPhone = new DMBPhone(3, "자바폰", "검정");
		
		System.out.println("모델 : "+ dMBPhone.model);
		System.out.println("색상 : "+ dMBPhone.color);
		
		dMBPhone.powerOn();

		dMBPhone.bell();
		
		dMBPhone.dmbOn();
		dMBPhone.changeChannel(5);
		dMBPhone.changeChannel(45);
		dMBPhone.dmbOff();
		
		dMBPhone.powerOff();

	}

}
