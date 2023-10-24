package java_oop;

public class Cat extends Animal {
	public Cat(String type, String name, int age) {
		super(type, name, age);
	}

	@Override
	public void makeSound() {
		System.out.printf("%s(%d세) : 야옹야옹\n", getName(), getAge());
	}
}