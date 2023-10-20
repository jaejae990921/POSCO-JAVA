package java_first_project;
import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("수를 입력하세요 : ");
		int num = sc.nextInt();

		// if-else문
//		if (num % 3 == 0) {
//			System.out.println("3의 배수 입니다.");
//		} else {
//			System.out.println("3의 배수가 아닙니다.");
//		}

		// switch문
//		switch (num % 3) {
//		case 0:
//			System.out.println("3의 배수 입니다.");
//			break;
//		default:
//			System.out.println("3의 배수가 아닙니다.");
//		}

		// 문자열 비교
		// 자바에서 문자열은 String 자료형(레퍼런스자료형)이므로, 변수로 접근할 수 있는 값은
		// 문자열이 저장된 메모리 주소값입니다. 따라서 == 연산자로는 비교가 불가능.
		// 변수.equals("문자열") 형태로 비교해야함

		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();

		if (name.equals("코딩온")) {
			System.out.println("코딩온님 환영합니다!!!");
		} else {
			System.out.printf("%s님 환영합니다.", name).println();
		}

		sc.close();
	}
}
