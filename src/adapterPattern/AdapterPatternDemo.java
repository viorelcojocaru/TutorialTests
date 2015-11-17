package adapterPattern;

public class AdapterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AudioPlayer audioPlayer=new AudioPlayer();
		audioPlayer.play("mp3", "Seara albastra");
		audioPlayer.play("mp4", "ARMAGHEDON");
		audioPlayer.play("VLC", "INTERSTELAR");
		audioPlayer.play("avi", "Nunta mea");

	}

}
