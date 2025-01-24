package assignment;

import java.util.ArrayList;

public class Assignment13_2 {

	public static void main(String[] args) {
		
		 // Input paragraph
        String paragraph = "Java is a popular programming language. Java is widely used in web development and mobile applications.";
        
        // Word to search for
        String searchWord = "Java";

        // Variables to store occurrences and their indexes
        int count = 0;
        ArrayList<Integer> indexes = new ArrayList<>();

        // Loop through the paragraph to find occurrences of the word
        int index = paragraph.indexOf(searchWord);
        while (index != -1) {
            count++;
            indexes.add(index);
            index = paragraph.indexOf(searchWord, index + 1);
        }

        // Print the results
        System.out.println("Total occurrences of \"" + searchWord + "\": " + count);
        System.out.println("Indexes: " + indexes);
    }
}