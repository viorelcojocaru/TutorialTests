package morse;

import morse.audio.Audio;
import morse.audio.AudioDecoder;
import morse.audio.AudioEncoder;
import morse.text.Text;
import morse.text.TextDecoder;
import morse.text.TextEncoder;

public class DecoderFactory extends EncodeDecode {

	@Override
	Text getTextEncode(String textType) {
		if (textType.equalsIgnoreCase("ENCODER")) {
			return new TextEncoder();
		} else if (textType.equalsIgnoreCase("DECODER")){
			return new TextDecoder();
		}
		return null;
	}

	@Override
	Audio getAudioEncoder(String audioType) {
		if (audioType.equalsIgnoreCase("ENCODER")) {
			return new AudioEncoder();
		} else if (audioType.equalsIgnoreCase("DECODER")){
			return new AudioDecoder();
		}
		return null;
	}


}
