/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main(String[] args) throws Exception {

		// Get the input string from the command-line argument and declare some args
        String word = args[0];
        String reverseWord = "";
        int middleIndex = 0;

        // Calculate the middle index of the string
        middleIndex = (word.length()%2 == 0) ? (word.length()/2) : (word.length()/2) + 1;
        
        // Reverse the string
        for (int i = word.length() - 1; i >= 0; i--) {
            reverseWord = reverseWord + word.charAt(i);
        }
        
        // Print the reversed string and the middle char of the string
        System.out.println(reverseWord);
        System.out.println("The middle character is: " + word.charAt(middleIndex-1));
	}
}