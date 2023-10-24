package java_oop;

// 모든 class는 Object 상속받음
public class Person extends Object {
	private String name;
	private int age;

	// 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() { // Object의 toString을 오버라이딩
		return "Person / name : " + name + ", age : " + age;
	}
}