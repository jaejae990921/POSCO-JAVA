package java_first_project;
import java.math.BigDecimal;

public class Deciaml {
	public static void main(String[] args) {
		BigDecimal a = new BigDecimal("0.2");
		BigDecimal b = new BigDecimal("0.1");

		BigDecimal sum = a.add(b); // 덧셈
		BigDecimal diff = a.subtract(b); // 뺄셈
		BigDecimal multi = a.multiply(b); // 곱셈
		BigDecimal divi = a.divide(b); // 나눗셈

		System.out.println(sum);
		System.out.println(diff);
		System.out.println(multi);
		System.out.println(divi);
	}
}
