package java_generic;

import java.util.*;

public class CollectionPrac2 {
	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("이름과 나이를 입력해주세요");
			String name = sc.next();

			if (name.equals("종료")) {
				break;
			}

			int age = sc.nextInt();

			hashMap.put(name, age);
		}

		// entrySet() : 해당 맵에 저장된 모든 키-값 쌍을 Set<Map.Entry<K,V>> 형태로 반환
		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			System.out.println("이름 : " + entry.getKey() + ", 나이 : " + entry.getValue());
		}

		sc.close();
	}
}
