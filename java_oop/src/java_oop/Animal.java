package java_oop;

public class Animal {
	private String type;
	private String name;
	private int age;

	public Animal(String type, String name, int age) {
		this.type = type;
		this.name = name;
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void makeSound() {
		System.out.println("동물은 소리를 낸다");
	}
}