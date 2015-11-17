package morse.audio;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class AudioEncoder implements Audio {
	Thread thread =new Thread();
	@Override
	public void play(String morse) {		 
		
		try {
			for (int i = 0; i < morse.length(); i++) {
				char ch = morse.charAt(i);
				String a=String.valueOf(ch);
				if (a.equals("-")) {
					longBeep();
				}else if (a.equals(".")){
					beep();
				}else if(a.equals(" ")){				
					thread.sleep(200L);	
				}else if (a.equals("|")){
					thread.sleep(500L);
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	void beep() throws InterruptedException {
		generateSound(1000L);		
			thread.sleep(60L);		
	}

	void longBeep() throws InterruptedException {
		generateSound(3000L);
			thread.sleep(60L);
	}

	void generateSound(Long lungimea) {

		long Hz = 20000;
		long speed = 9500;

		try {
			byte[] buf = new byte[1];
			AudioFormat af = new AudioFormat((float) 44100, 8, 1, true, false);
			SourceDataLine sdl;
			sdl = AudioSystem.getSourceDataLine(af);

			sdl.open();
			sdl.start();
			for (int i = 0; i < lungimea * (float) Hz / speed; i++) {
				double angle = i / ((float) Hz / 440) * 2.0 * Math.PI;
				buf[0] = (byte) (Math.sin(angle) * 100);
				sdl.write(buf, 0, 1);
			}
			System.out.print(buf[0]);
			sdl.drain();
			sdl.stop();

		} catch (LineUnavailableException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
