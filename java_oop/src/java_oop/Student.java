package java_oop;

public class Student extends Person {
	private String major;

	public Student(String name, int age, String major) {
		// super() : 하위클래스에서 상위클래스 생성자를 호출하는데 사용
		super(name, age);

		// 부모 클래스의 멤버에 접근 가능
		setName(name);
		setAge(age);

		this.major = major;
	}

	@Override
	public String toString() {
		// super 키워드는 상위 클래스의 오버라이드된 메서드를 호출하는데에 사용 가능
		return "Student / super : " + super.toString() + ", major : " + major;
	}
	// name, age는 상위클래스에 저장된 요소임. 직접 name, age를 접근할 수 없고,
	// getter로 접근하거나 부모의 toString()을 실행시켜서 출력
}