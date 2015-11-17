package adapterPattern;

public class VLCPlayer implements AdvansedMediaPlayer{

	@Override
	public void playMP4(String fileName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playVCL(String fileName) {
		System.out.println("Playing VLC Player "+fileName);
		
	}


}
