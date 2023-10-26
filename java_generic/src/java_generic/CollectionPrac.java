package java_generic;

import java.util.*;

public class CollectionPrac {
	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			int num = sc.nextInt();

			if (num == -1) {
				break;
			}

			hashSet.add(num);
		}

		System.out.println(hashSet);

		sc.close();
	}
}
