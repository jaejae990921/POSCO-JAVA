package java_first_project;
import java.util.Scanner;

public class ConditionPrac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();

		switch (name) {
		case "홍길동":
			System.out.print("남자");
			break;
		case "성춘향":
			System.out.print("여자");
			break;
		default:
			System.out.print("모르겠어요.");
		}
		
		sc.close();
	}
}
