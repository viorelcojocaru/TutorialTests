package morse;

import morse.audio.Audio;
import morse.text.Text;

public abstract class EncodeDecode {
	abstract Text getTextEncode(String textType);
	abstract Audio getAudioEncoder(String audioType);

}
