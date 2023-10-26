package java_generic;

import java.util.ArrayList;

// 일반 클래스
class MyCustomList {
	ArrayList<String> list = new ArrayList<>();

	public void addElement(String element) {
		list.add(element);
	}

	public void removeElement(String element) {
		list.remove(element);
	}
}

// 제네릭 클래스
class MyCustomListGeneric<T> { // 객체 생성할 때도 MyCustomListGeneric<타입> 적으니깐 클래스에도 <T> 해줌
	ArrayList<T> list = new ArrayList<>();

	public void addElement(T element) {
		list.add(element);
	}

	public void removeElement(T element) {
		list.remove(element);
	}

	// <T> : 타입파라미터, 명시적으로 해당 메서드가 제네릭이라는 것을 표현
	public T get(int i) {
		return list.get(i); // 여기서 get은 원래 ArrayList에서 제공하는 메서드
	}
}

public class GenericExample {
	public static void main(String[] args) {
		MyCustomList list = new MyCustomList(); // 일반 클래스 객체 생성
		list.addElement("element");

		MyCustomListGeneric<String> list2 = new MyCustomListGeneric<>(); // 제네릭 클래스 생성 <>() 해줘야 함
		list2.addElement("element1");
		list2.addElement("element2");
		list2.addElement("element3");
		String text = list2.get(1); // MyCustomListGeneric 클래스의 get 메서드
		System.out.println(text);
	}
}
