package java_class;

import java.util.Scanner;
import java.util.ArrayList;

public class ClassPrac1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<ClassPrac1> list = new ArrayList<>();

		while (true) {
			System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
			int width = sc.nextInt();
			int height = sc.nextInt();
			if (width == 0 && height == 0) {
				break;
			}
			ClassPrac1 r = new ClassPrac1();
			// 클래스는 참조 데이터 형식으로 실제 값은 힙영역, 스택영역에는 이를 참조하는 주소가 저장됨
			// 따라서 같은 이름으로 생성해도 아무런 지장이 없음
			r.setWidth(width);
			r.setHeight(height);
			list.add(r);
		}

		for (ClassPrac1 r : list) {
			// System.out.println(r); // 참조형 데이터라 주소값 뽑힘
			System.out.println("가로 길이는 : " + r.getWidth());
			System.out.println("가로 길이는 : " + r.getHeight());
			System.out.println("넓이는 : " + r.area());
			System.out.println("---------------------------------------");
		}

		System.out.println("Rectangle 인스턴스의 개수는 : " + list.get(0).getCnt());

		sc.close();
	}
}