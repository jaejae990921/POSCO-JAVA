package java_interface;

interface Move {
	void moveForward();

	void moveBackward();
}

interface Power {
	void powerOn();

	void powerOff();
}

// 인터페이스는 인터페이스를 상속 받을 수 있음 (다중 상속도 OK)
interface Car extends Move, Power {
	void changeGear(int gear);
}

class Suv implements Car {
	@Override
	public void moveForward() {
		System.out.println("앞으로 이동");
	}

	@Override
	public void moveBackward() {
		System.out.println("뒤로 이동");
	}

	@Override
	public void powerOn() {
		System.out.println("시동 ON");
	}

	@Override
	public void powerOff() {
		System.out.println("시동 OFF");
	}

	@Override
	public void changeGear(int gear) {
		System.out.println("기어변경 : " + gear);
	}
}

public class InterfaceExample2 {
	public static void main(String[] args) {
		Suv ms = new Suv();
		ms.powerOn();
		ms.changeGear(2);
		ms.moveForward();
		ms.moveBackward();
		ms.powerOff();
	}
}
