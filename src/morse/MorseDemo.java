package morse;

import java.util.Scanner;

import morse.audio.Audio;
import morse.text.Text;

/*
 * 
 * https://github.com/MatBenetti/morse-audio-decoder decoder morse
 * */
public class MorseDemo {

	/**
	 * @param args
	 * @throws InterruptedException
	 */

	public static void main(String[] args) throws InterruptedException {

		Scanner userInput = new Scanner(System.in);
		System.out.println("Please enter a phrase to convert to morse codes: ");
		String userString = userInput.nextLine();
		System.out.println("");

		DecoderFactory decodeFactory = new DecoderFactory();
		Text encodertext = decodeFactory.getTextEncode("ENCODER");
		String morse = encodertext.stringConvert(userString);
		System.out.println(morse);

		System.out.println();
		Text decodertext = decodeFactory.getTextEncode("DECODER");
		System.out.println(decodertext.stringConvert(morse));
		 Audio encodeAudio =decodeFactory.getAudioEncoder("ENCODER");
		 encodeAudio.play(morse);

		
	}
	
}
