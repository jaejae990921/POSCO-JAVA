package java_class;

public class ClassPrac1 {
	private int width;
	private int height;
	private static int cnt = 0;

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
		cnt++;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int area() {
		return width * height;
	}

	public int getCnt() {
		return cnt;
	}
}
