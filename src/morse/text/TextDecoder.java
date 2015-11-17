package morse.text;

import java.util.Map.Entry;


public class TextDecoder implements Text {
	static MorseDictionary container = new MorseDictionary();

	@Override
	public String stringConvert(String userString) {
		String convertedString = "";
		String[] phrase = userString.replaceAll("\\s+", " ").split(" ");
		for (String  one: phrase) {
			convertedString = convertedString + convert(one);
		}
		return convertedString;
	}

	private static String convert(String value) {
		for (Entry<String, String> entry : container.dictionary.entrySet()) {
				if (value.equalsIgnoreCase(entry.getValue())) {
					return entry.getKey();
				}
		}
		return null;
	}
	

}
