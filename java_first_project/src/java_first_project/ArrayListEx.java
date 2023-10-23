package java_first_project;
import java.util.ArrayList;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		// add(element): 맨 뒤에 element 추가
		list.add("Google");
		System.out.println(list); // [Google]

		// add(index, element): index 위치에 element 추가
		list.add(0, "Amazon");
		System.out.println(list); // [Amazon, Google]

		// addAll(ArrayList)
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsung");
		list.addAll(list2); // list에 list2 요소 전부 추가
		System.out.println(list); // [Amazon, Google, Apple, Samsung]

		// size()
		System.out.println(list.size()); // 4

		// contains(params): ArrayList가 params를 포함하고 있는지 여부
		System.out.println(list.contains("Hyundai"));

		// get(index)
		System.out.println(list.get(1)); // Google

		// set(index, element): 특정한 위치에 있는 값을 교체
		System.out.println(list.set(2, "Hyundai")); // Apple -> 현재 index 2를 출력하므로 Apple이 출력 됨
		System.out.println(list); // [Amazon, Google, Hyundai, Samsung]

		// indexOf(params): params의 index를 반환
		System.out.println(list.indexOf("Google")); // 1

		// isEmpty(): ArrayList 비어있는지 확인
		System.out.println(list.isEmpty()); // false

		// remove(index): index 요소를 삭제 -> String일 경우 값으로도 삭제할 수 있음
		list.remove(3);
		System.out.println(list); // [Amazon, Google, Hyundai]
		
		// clear()
		list.clear(); // 배열의 모든 요소 삭제
		System.out.println(list); // []
		System.out.println(list.isEmpty()); // true
	}

}
