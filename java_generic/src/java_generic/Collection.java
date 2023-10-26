package java_generic;

import java.util.*;

public class Collection {

	public static void main(String[] args) {
		// ArrayList
		List<String> arrayList = new ArrayList<>();

		// LinkedList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add(1, "C"); // index 1에 "C" 삽입
		System.out.println(linkedList); // [A, C, B]

		// HashSet
		Set<String> hashSet = new HashSet<>(); // 순서를 보장 X, 중복된 값 저장 X
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("A"); // HashSet은 중복된 값 저장 X
		System.out.println(hashSet); // [A, B]

		// LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>(); // 요소의 삽입 순서를 기억
		linkedHashSet.add("C");
		linkedHashSet.add("B");
		linkedHashSet.add("A");
		System.out.println(linkedHashSet); // [C, B, A]

		// TreeSet
		Set<String> treeSet = new TreeSet<>(); // 자동으로 정렬
		treeSet.add("B");
		treeSet.add("C");
		treeSet.add("A");
		System.out.println(treeSet); // [A, B, C]

		// HashMap
		Map<String, Integer> hashMap = new HashMap<>(); // 키와 값이 쌍으로 저장되는 구조. 각 키는 고유
		hashMap.put("one", 1);
		hashMap.put("two", 2);
		hashMap.put("three", 3);
		System.out.println(hashMap); // {one=1, two=2, three=3}
		System.out.println(hashMap.get("one")); // 1 // key로 value 찾음

		// LinkedHashMap
		Map<String, Integer> link = new LinkedHashMap<>(); // 순서대로 저장
		link.put("two", 2);
		link.put("three", 3);
		link.put("one", 1);
		System.out.println(link); // {two=2, three=3, one=1}

		// TreeMap
		Map<String, Integer> treeMap = new TreeMap<>(); // key를 기준으로 자동 정렬
		treeMap.put("C", 1);
		treeMap.put("A", 2);
		treeMap.put("B", 3);
		System.out.println(treeMap); // {A=2, B=3, C=1}
	}
}
