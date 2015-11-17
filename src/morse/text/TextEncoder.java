package morse.text;


public class TextEncoder implements Text {

	MorseDictionary morse=new MorseDictionary();

	@Override
	public String stringConvert(String userString) {
		String currentChar;
		String getMorseChar;
		String convertedString = "";

		for (int i = 0; i < userString.length(); i++) {
			// Get character at i position
			currentChar = userString.charAt(i) + "";

			// convert character to morse code
			getMorseChar = convert(currentChar.toLowerCase());

			// seperate words with the | symbol
			if (getMorseChar.equals(" ")) {
				convertedString = convertedString + " |  ";
			}

			else {
				// concat the converted letter
				convertedString = convertedString + getMorseChar;

				// Add a space between each letter
				if (!getMorseChar.equals(" ")) {
					convertedString = convertedString + " ";
				}
			}
		}

		return convertedString;
		
	}
	private String convert(String str){
		return morse.dictionary.get(str);
	}

}
