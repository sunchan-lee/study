package inheritance;

public class CellPhone {
	//필드,,
	String model;
	String color;

	
	//메서드
	
	void powerOn() {
		System.out.println("전원 온");
	}
	void powerOff() {
		System.out.println("전원 오프");
	}
	void bell() {
		System.out.println("벨소리 ");
	}
	
	public CellPhone() {
		System.out.println("부모 생성자 ㅎ호출");
	}
	


}
