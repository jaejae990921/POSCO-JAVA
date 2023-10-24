package java_class;

// static 변수가 없는 경우
class WithoutStatic {
	private int registered = 0;
	private String name;

	public WithoutStatic(String name) {
		this.name = name;
		registered++;
	}

	public int getRegistered() {
		return registered;
	}
}

// static 변수가 있는 경우
class WithStatic {
	private static int registered = 0;
	private String name;

	public WithStatic(String name) {
		this.name = name;
		registered++;
	}

	public int getRegistered() {
		return registered;
	}
}

// static 메서드
class MathUtil {
	private static double PI = 3.14;
	private int num = 1;

	// static 메서드
	public static double circle(double radius) {
		return PI * radius * radius;
		// return PI * radius * radius * num;
		// static 메서드에서 non-static에 접근 X
		// 객체를 생성해도 접근 못함
	}

	// non-static
	public int test(int a) {
		return a;
	}
}

public class CompareStatic {
	public static void main(String[] args) {
		// static 없는 경우
		WithoutStatic a = new WithoutStatic("홍길동");
		WithoutStatic b = new WithoutStatic("이몽룡");
		System.out.println("Without Static");
		System.out.println("홍길동 : " + a.getRegistered());
		System.out.println("이몽룡 : " + b.getRegistered());

		// static 있는 경우
		WithStatic c = new WithStatic("성춘향");
		WithStatic d = new WithStatic("임꺽정");
		System.out.println("With Static");
		System.out.println("성춘향 : " + c.getRegistered());
		System.out.println("임꺽정 : " + d.getRegistered());

		// static 메서드
//		MathUtil math = new MathUtil();
//		math.circle(3.3);
		MathUtil.circle(3.3); // static 메서드는 객체를 따로 생성하지 않아도 접근 가능
	}
}
