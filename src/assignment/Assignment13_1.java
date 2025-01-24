package assignment;

public class Assignment13_1 {

	public static void main(String[] args) {

		String sentence = "Java programming is fun and challenging";

		String[] word = sentence.split(" ");

		/*
		 * 1. Count the total number of words in the sentence. 2. Print the sentence
		 * words in reverse order. 3. Convert the first character of each word to
		 * uppercase and print original sentence
		 */

		for (int i = 0; i < word.length; i++) {
			System.out.println("words " + (i + 1) + ": " + word[i]);
		}

		System.out.println("Total number of words in the sentence : " + word.length);

		// Print the sentence words in reverse order.

		for (int j = word.length - 1; j >= 0; j--) {
			System.out.println("Sentence words in reverse order : " + word[j]);

		}

		// Convert the first character of each word to uppercase and print original
		// sentence

		StringBuilder uppercase = new StringBuilder();

		for (String words : word) {
			
			String uppercaseWord = words.substring(0, 1).toUpperCase() + words.substring(1);
		
			uppercase.append(uppercaseWord).append(" ");
		}

		System.out.println("Original sentence : " + sentence);
		System.out.println("first character of each word to uppercase : " + uppercase.toString().trim());
	}

}
