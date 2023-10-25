package java_interface;

import java.util.ArrayList;

abstract class Vehicle_ {
	private String name;
	private int maxSpeed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	abstract public void move();
}

interface Flyable_ {
	void fly();
}

class Car_ extends Vehicle_ {
	public Car_(String name, int maxSpeed) {
		setName(name);
		setMaxSpeed(maxSpeed);
	}

	@Override
	public void move() {
		System.out.println("도로를 따라 이동 중");
	}
}

class Airplane_ extends Vehicle_ implements Flyable_ {
	public Airplane_(String name, int maxSpeed) {
		setName(name);
		setMaxSpeed(maxSpeed);
	}

	@Override
	public void fly() {
		System.out.println("고도 10,000피트에서 비행 중");
	}

	@Override
	public void move() {
		System.out.println("하늘을 날아가는중");
	}
}

public class FinalPrac {
	public static void main(String[] args) {
		Vehicle_[] list = { new Car_("벤츠", 180), new Airplane_("보잉", 1200) };

		for (Vehicle_ v : list) {
			System.out.printf("%s속도는 : %d\n", v.getName(), v.getMaxSpeed());
			v.move();
			// instanceof : 객체가 특정 클래스나 인터페이스의 인스턴스인지 확인하는 연산자
			if (v instanceof Flyable_) {
				((Flyable_) v).fly(); // Flyable_에는 move 없어서 이렇게 변환하면 move()는 못씀
				((Airplane_) v).move(); // Airplane_는 move(), fly() 다 있어서 이렇게도 가능
			}
		}
	}
}