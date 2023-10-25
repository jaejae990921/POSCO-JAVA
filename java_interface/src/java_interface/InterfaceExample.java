package java_interface;

interface Controller {
	void powerOn();
	void powerOff();
	// 새로운 내용 추가할 때 default로 추가 가능
	default void display() {
		System.out.println("디스플레이가 켜졌습니다.");
	}
}

class TV implements Controller {
	@Override
	public void powerOn() {
		System.out.println("TV power On");
	}

	@Override
	public void powerOff() {
		System.out.println("TV power Off");
	}
}

class Computer implements Controller {
	@Override
	public void powerOn() {
		System.out.println("Computer power On");
	}

	@Override
	public void powerOff() {
		System.out.println("Computer power Off");
	}
}

public class InterfaceExample {
	public static void main(String[] args) {
		TV tv = new TV();
		Computer cp = new Computer();
		
		tv.powerOn();
		tv.display();
		tv.powerOff();
		
		cp.powerOn();
		cp.display();
		cp.powerOff();
	}

}
