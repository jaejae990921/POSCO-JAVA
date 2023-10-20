package java_first_project;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("안녕하세요");
		System.out.printf("%d * %d = %d", 10, 2, 10 * 2).println();
		System.out.printf("%.3f", 1.12345).println();

		// 형식 지정자
		// %d : 정수
		// %f : 실수 ( %.3f : 소수점 숫자자리까지)
		// %s : 문자열
		// %c : 문자
		// %b : boolean
	}
}
