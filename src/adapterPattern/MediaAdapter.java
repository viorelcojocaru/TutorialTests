package adapterPattern;

public class MediaAdapter implements MediaPlayer {

	AdvansedMediaPlayer advansedMediaPlayer;

	@Override
	public void play(String fileType, String fileName) {
		if (fileType.equalsIgnoreCase("vlc")) {
			advansedMediaPlayer.playVCL(fileName);

		} else if (fileType.equalsIgnoreCase("mp4")) {
			advansedMediaPlayer.playMP4(fileName);
		}

	}

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advansedMediaPlayer = new VLCPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advansedMediaPlayer = new MP4Player();
		}
	}
}
