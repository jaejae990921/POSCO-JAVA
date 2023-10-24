package java_class;

public class CarContainer {

	public static void main(String[] args) {
		Car bmw = new Car(30); // 초기값 안넣으면 빨간줄
		Car kia = new Car(20); // 초기값 넣어주면 됨

		bmw.start();
		kia.start();

		// 잘못된 접근방법
		// bmw.speed = 120;
		// kia.speed = 90;

		// setter로 접근
//		bmw.setSpeed(120);
//		kia.setSpeed(90);

		// 잘못된 값에 대해 객체를 보호
		// bmw.setSpeed(-120);
		// kia.setSpeed(-90);

		// 비효율적인 방법
//		int bmwSpeed = bmw.getSpeed();
//		bmwSpeed += 100;
//		bmw.setSpeed(bmwSpeed);
//		
//		int kiaSpeed = kia.getSpeed();
//		kiaSpeed += 80;
//		kia.setSpeed(kiaSpeed);

		// 효율적인 방법 -> 메서드 생성
		bmw.increseSpeed(140);
		kia.increseSpeed(110);

		System.out.println("bmw : " + bmw.getSpeed()); // getter로 접근
		System.out.println("kia : " + kia.getSpeed()); // getter로 접근
	}
}