/**
 *  Gets a command-line argument (int), and prints all the divisors of the given number.
 */
public class Divisors {
	public static void main (String[] args) {
		// Parse the command-line argument as an integer
		int number = Integer.parseInt(args[0]);

		// Iterate through numbers from 1 to the given number and prints the divisors
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i);
			}
		}
	}
}
