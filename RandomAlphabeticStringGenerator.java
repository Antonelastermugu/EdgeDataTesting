package EdgeData.EdgeDataTesting;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomAlphabeticStringGenerator {
	private static final String AlphabeticCHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String AlphabeticNumericCHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final String AlphabeticNumericSpecialCHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-=+";

	public static String AlphabeticString(int length) {
		// This method generates a string type value with defined number of alphabetical
		// characters
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(AlphabeticCHARACTERS.length());
			char randomChar = AlphabeticCHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	public static String AlphanumericString(int length) {
		// This method generates a string type value with defined number of characters
		// including alphabetic and numerical
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(AlphabeticNumericCHARACTERS.length());
			char randomChar = AlphabeticNumericCHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}

	public static String AlphanumericSpecialCharactesString(int length) {
		// This method generates a string type value with defined number of characters
		// including alphabetic, numerical and special characters
		Random random = new Random();
		StringBuilder sb = new StringBuilder(length);

		for (int i = 0; i < length; i++) {
			int randomIndex = random.nextInt(AlphabeticNumericSpecialCHARACTERS.length());
			char randomChar = AlphabeticNumericSpecialCHARACTERS.charAt(randomIndex);
			sb.append(randomChar);
		}
		return sb.toString();
	}
	//This method generates different String cases
	public static List<String> generateDifferentStringCases(String word){
		List<String> cases = new ArrayList<>();
		generateCases(word.toCharArray(), 0, cases);
		return cases;
	}
	
	private static void generateCases(char[] chars, int index, List<String> cases) {
		if (index == chars.length) {
			cases.add(String.valueOf(chars));
			return;
		}
		generateCases(chars, index + 1, cases);
		if (Character.isLetter(chars[index])) {
			chars[index] = Character.toUpperCase(chars[index]);
			generateCases(chars, index + 1, cases);
			chars[index] = Character.toLowerCase(chars[index]);
		}
	}
}

