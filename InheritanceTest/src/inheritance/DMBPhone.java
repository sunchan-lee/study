package inheritance;

public class DMBPhone extends CellPhone {
	//필드,,

	int channel;
	
	//메서드
	
	void dmbOn() {
		System.out.println("DMB 방송 온 . 채널 : " + channel);
	}
	void changeChannel(int channel) {
		this.channel=channel;
		System.out.println("DMB 채널 변경 . 채널 : " + channel);
	}
	void dmbOff() {
		System.out.println("DMB 방송 오프");
	}
	
	public DMBPhone(int channel, String model, String color) {
		super(); //생략이 되어있다.
		this.channel=channel;
		this.model=model;
		this.color=color;
		System.out.println("새성자 호출");
	}



}
