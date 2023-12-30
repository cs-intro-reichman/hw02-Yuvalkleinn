/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
        // Generate the two integers
        int num1 = (int) (Math.random()*(10));
        int num2 = (int) (Math.random()*(10));

        // Print the first random integer
        System.out.print(num1 + " ");

        // Generate and print subsequent random integers in a non-decreasing sequence
        while (num2>=num1) {
            System.out.print(num2 + " ");
            num1 = num2;
            num2 = (int) (Math.random()*(9)) + 1;
        }
	}
}
