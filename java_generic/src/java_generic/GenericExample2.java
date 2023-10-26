package java_generic;

// 타입을 숫자로 제한 해보기 (double, short, int 등)
class Box<T extends Number> {
	private T item;

	public void setItem(T item) {
		this.item = item;
	}

	public T getItem() {
		return item;
	}
}

// 인터페이스 생성
interface Movable {
	void move();
}

// Movable 인터페이스를 구현하는 Car
class Car implements Movable {
	@Override
	public void move() {
		System.out.println("자동차 출발");
	}
}

// 제네릭 클래스
// extends에 특정 클래스나 인터페이스를 넣는 것도 가능하다.
class Container<T extends Movable> {
	private T item;

	public Container(T item) {
		this.item = item;
	}

	public void makeItMove() {
		item.move();
	}
}

public class GenericExample2 {
	public static void main(String[] args) {
		// 타입에 우클릭 후 Open Type Hierarchy 하면 상위 요소가 뭔지 나옴
		// Box 클래스가 <T extends Number> 이므로 String은 오류 발생
//		Box<String> stringBox = new Box<>();
//		stringBox.setItem("Hello World");
//		String value = stringBox.getItem();
//		System.out.println(value);

		Box<Double> doubleBox = new Box<>();
		Box<Short> shortBox = new Box<>();

		Container<Car> container = new Container<>(new Car());
		container.makeItMove();
	}
}
