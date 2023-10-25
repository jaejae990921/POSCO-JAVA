package java_class;

abstract class Student {
	private String name;
	private String school;
	private int age;
	private String stNum;

	public void setName(String name) {
		this.name = name;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setStNum(String stNum) {
		this.stNum = stNum;
	}

	abstract public void todo();
}

class Kim extends Student {
	public Kim(String name, String school, int age, String stNum) {
		setName(name);
		setSchool(school);
		setAge(age);
		setStNum(stNum);
	}

	@Override
	public void todo() {
		System.out.println("점심은 김가네 김밥");
	}
}

class Baek extends Student {
	public Baek(String name, String school, int age, String stNum) {
		setName(name);
		setSchool(school);
		setAge(age);
		setStNum(stNum);
	}

	public void todo() {
		System.out.println("점심은 백종원 피자");
	}
}

public class AbsPrac {
	public static void main(String[] args) {
		Kim a = new Kim("김씨", "연세대학교", 25, "20180948");
		Baek b = new Baek("백씨", "서강대학교", 22, "2018243048");

		a.todo();
		b.todo();
	}
}
