package morse.text;

import java.util.HashMap;

public class MorseDictionary {
	protected final HashMap<String, String> dictionary = new HashMap<String, String>();

	public MorseDictionary() {
		dictionary.put("a", ".-");
		dictionary.put("b", "-...");
		dictionary.put("c", "-.-.");
		dictionary.put("d", "-..");
		dictionary.put("e", ".");
		dictionary.put("f", "..-.");
		dictionary.put("g", "--.");
		dictionary.put("h", "....");
		dictionary.put("i", "..");
		dictionary.put("j", ".---");
		dictionary.put("k", "-.-");
		dictionary.put("l", ".-..");
		dictionary.put("m", "--");
		dictionary.put("n", "-.");
		dictionary.put("o", "---");
		dictionary.put("p", ".--.");
		dictionary.put("q", "--.-");
		dictionary.put("r", ".-.");
		dictionary.put("s", "...");
		dictionary.put("t", "-");
		dictionary.put("u", "..-");
		dictionary.put("v", "...-");
		dictionary.put("w", ".--");
		dictionary.put("x", "-..-");
		dictionary.put("y", "-.--");
		dictionary.put("z", "--..");
		dictionary.put("0", "-----");
		dictionary.put("1", ".----");
		dictionary.put("2", "..---");
		dictionary.put("3", "...--");
		dictionary.put("4", "....-");
		dictionary.put("5", ".....");
		dictionary.put("6", "-....");
		dictionary.put("7", "--...");
		dictionary.put("8", "---..");
		dictionary.put("9", "----.");
		dictionary.put(".", ".-.-.-");
		dictionary.put(",", "--..--");
		dictionary.put(":", "---...");
		dictionary.put("?", "..--..");
		dictionary.put("=", "-...-");
		dictionary.put("-", "-....-");
		dictionary.put("(", "-.--.");
		dictionary.put(")", "-.--.-");
		dictionary.put("\"", ".-..-.");
		dictionary.put("'", ".----.");
		dictionary.put("/", "-..-.");
		dictionary.put("@", ".--.-.");
		dictionary.put("!", "-.-.--");
		dictionary.put(" ", " ");
		dictionary.put(" ", "|");

	}

}
