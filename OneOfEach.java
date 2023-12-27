
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

		// Initialize variables
		String str = "";
		boolean isGirl = false;
		boolean isBoy = false;
		int howManyChildren = 0;
		
		// Continue looping until at least one child of each gender is born
		while((isGirl && isBoy) != true) {
			
			// Generate a random number to represent the gender of the child
			double randomGender = Math.random();
			
			// Check if the random number represents a girl (less than 0.5)
			if(randomGender < 0.5) {
				isGirl = true;
				str += "g ";
			}

			else { 
				isBoy = true;
				str += "b ";
			}
			howManyChildren++; // Increment the total number of children
		}
		
		// Output the string representing the gender sequence and the total number of children
		System.out.println(str);
		System.out.println("You made it... and you now have " + howManyChildren + " children.");
	}
}
