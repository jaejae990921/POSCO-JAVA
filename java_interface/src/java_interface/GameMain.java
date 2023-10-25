package java_interface;

public class GameMain {
	public static void main(String[] args) {
//		LoLGame game = new LoLGame();
		DiabloGame game = new DiabloGame();
		game.up();
		game.down();
		game.right();
		game.left();
	}
}
