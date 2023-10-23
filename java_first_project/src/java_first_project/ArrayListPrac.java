package java_first_project;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<>();

		while (true) {
			System.out.println("문자를 입력해주세요. : ");
			String str = sc.next();
			if (str.equals("exit")) {
				break;
			}
			arr.add(str);
		}

		for (String str : arr) {
			System.out.println(str);
		}

		sc.close();
	}

}
