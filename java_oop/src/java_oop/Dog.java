package java_oop;

public class Dog extends Animal {
	public Dog(String type, String name, int age) {
		super(type, name, age);
	}

	@Override
	public void makeSound() {
		System.out.printf("%s(%d세) : 멍 멍 멍\n", getName(), getAge());
	}
}