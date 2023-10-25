package java_interface;

interface Playable {
	void play();
	void pause();
	void stop();
}

class MP3Player implements Playable {
	@Override
	public void play() {
		System.out.println("MP3에서 노래를 재생합니다.");
	}

	@Override
	public void pause() {
		System.out.println("MP3에서 노래를 멈춥니다.");
	}

	@Override
	public void stop() {
		System.out.println("MP3Player를 정지합니다.");
	}
}

class DVDPlayer implements Playable {
	@Override
	public void play() {
		System.out.println("DVD에서 영화를 재생합니다.");
	}

	@Override
	public void pause() {
		System.out.println("DVD에서 영화를 멈춥니다.");
	}

	@Override
	public void stop() {
		System.out.println("DVDPlayer를 정지합니다.");
	}
}

public class InterPrac {
	public static void main(String[] args) {
		MP3Player mp3 = new MP3Player();
		DVDPlayer dvd = new DVDPlayer();
		
		mp3.play();
		mp3.pause();
		mp3.stop();
		
		dvd.play();
		dvd.pause();
		dvd.stop();
	}
}
