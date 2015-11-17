package adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String fileType, String fileName) {
		if (fileType.equalsIgnoreCase("mp3")) {
			System.out.println("plaing audio format mp3 " + fileName);

		} else if (fileType.equalsIgnoreCase("vlc")
				|| fileType.equalsIgnoreCase("mp4")) {
			mediaAdapter = new MediaAdapter(fileType);
			mediaAdapter.play(fileType, fileName);

		} else
			System.out.println("Invalid medeia format " + fileType);

	}

}
