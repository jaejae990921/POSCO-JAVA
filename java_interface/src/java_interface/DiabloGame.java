package java_interface;

public class DiabloGame implements GameConsole {

	@Override
	public void up() {
		System.out.println("점프");
	}

	@Override
	public void down() {
		System.out.println("앉기");
	}

	@Override
	public void right() {
		System.out.println("우로 구르기");
	}

	@Override
	public void left() {
		System.out.println("좌로 구르기");
	}
}
