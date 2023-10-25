package java_class;

// 추상클래스
abstract class Animals {
	// 추상메서드
	abstract public void sound();

	// 일반메서드
	public void sleep() {
		System.out.println("동물이 잠을 잔다");
	}
}

// 추상클래스 Animals를 상속받는 Chicken 클래스
class Chicken extends Animals {
	
	
	
	@Override // 추상메서드는 서브클래스에서 무조건 오버라이딩 해줘야 한다!
	public void sound() {
		System.out.println("꼬꼬댁");
	}

}

public class AbsEx {
	public static void main(String[] args) {
		// 추상클래스는 인스턴스화 할 수 없음 (객체 생성X)
		// Animals animal = new Animals();
		Chicken chicken = new Chicken();
		chicken.sound();
		chicken.sleep();
	}

}
