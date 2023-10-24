package java_oop;

public class ExtendsPrac1 {

	public static void main(String[] args) {
		Cat cat1 = new Cat("고양이", "냥아치", 4);
		Dog dog1 = new Dog("강아지", "만두", 2);

		cat1.makeSound();
		dog1.makeSound();
	}
}