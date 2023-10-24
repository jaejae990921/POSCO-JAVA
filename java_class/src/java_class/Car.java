package java_class;

public class Car {
	// 접근제어자
	// public : 같은클래스o / 같은패키지o / 자식클래스o / 전체o
	// protected: 같은클래스o / 같은패키지o / 자식클래스o
	// default: 같은클래스o / 같은패키지o
	// private: 같은클래스o

	// 멤버 변수
	private int speed;

	// 생성자 (클래스명과 동일해야 함)
	public Car(int speed) {
		this.speed = speed;
	}

	public void start() {
		System.out.println("Car Start");
	}

	public void increseSpeed(int speed) {
		this.speed += speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		// 유효성 검사
		if (speed > 0) {
			this.speed = speed;
		}
	}

//	// setter 메서드
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//
//	// getter 메서드
//	public int getSpeed() {
//		return this.speed;
//	}

	// 우클릭 -> Source -> Generate Getters and Setters...
}