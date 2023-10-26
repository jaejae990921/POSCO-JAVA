package java_generic;

import java.util.ArrayList;

public class GenericExample3 {
	// 와일드카드
	public void processList(ArrayList<? extends Number> list) {
		// 제네릭타입은 사용하는 순간 타입을 알게 되지만, ?는 아예 뭐가 올지 모를 때 사용
		// 근데 extends Number로 작성하면 어쨋든 Number 하위가 온다는 것을 의미 (Integer, Double 등)
		for (Number num : list) {
			System.out.println(num);
		}
	}

	// 타입파라미터
	public <T extends Number> void addToNumberList(ArrayList<T> list, T item) {
		list.add(item);
	}

	// ? super T
	public void processList2(ArrayList<? super Integer> list) {
		list.add(1);
		list.add(2);
		list.add(3);
	}

	public static void main(String[] args) {
		GenericExample3 example = new GenericExample3();
		ArrayList<Integer> integerList = new ArrayList<>();
		integerList.add(1);
		integerList.add(2);
		integerList.add(3);

		ArrayList<Double> doubleList = new ArrayList<>();
		doubleList.add(1.1);
		doubleList.add(2.2);
		doubleList.add(3.3);

		// 와일드카드 <? extends T>는 주로 읽기 전용으로 사용
		example.processList(integerList);
		example.processList(doubleList);

		// 값 넣어보기
		example.addToNumberList(integerList, 4);
		example.addToNumberList(doubleList, 4.4);

		// 다시출력
		System.out.println("--------------------");
		example.processList(integerList);
		example.processList(doubleList);

		// 와일드카드 <? suepr T>는 쓰기전용으로 주로 사용
		ArrayList<Number> numbers = new ArrayList<>();
		example.processList2(numbers);
		System.out.println(numbers);

		// 와일드카드 주의사항
		// 1. 복잡성 : 와일드카드를 과도하게 사용하게되면 복잡성이 증가하며, 협업에 알맞지 않음
		// 2. 제한된 작업 : <? extends T> 같은 경우 새로운 요소 추가 불가능
	}
}
