/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main(String[] args) throws Exception {
        
        // Parse the command-line argument as an integer and declare some args
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        String divisor = "";

        // Iterate through potential divisors up to (num - 1) and check if i is a divisor of num
        for (int i=1; i<num; i++) {
            if (num % i == 0) {
                sum += i;
                divisor += i + " + ";
            }
        }

        // Remove the trailing " + " from the divisor string
        divisor = divisor.substring(0, divisor.length()-2);

        // Check if the sum of divisors equals the original number
        if (sum == num) {
            System.out.print(num + " is a perfect nubmer since " + num + " = " + divisor);
        }
        else {
            System.out.println(num + " is not a perfect number");
        }
    }
}

