import java.util.Random;

/**
 * Computes statistics about families in which the parents decide 
 * to have children until they have at least one child of each gender.
 * The program expects two command-line arguments: the number of families to simulate
 * and the seed for the random number generator.
 * Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
    public static void main(String[] args) {
        // Parse command-line arguments
        int numFamiliesToSimulate = Integer.parseInt(args[0]);
        int randomSeed = Integer.parseInt(args[1]);

        // Initialize variables
        int totalExperiments = 0;
        int totalChildren = 0;
        int childrenInCurrentFamily = 0;
        int familiesWithTwoChildren = 0;
        int familiesWithThreeChildren = 0;
        int familiesWithFourOrMoreChildren = 0;
        boolean hasGirl = false;
        boolean hasBoy = false;

        // Initialize a random number generator with the given seed value
        Random randomGenerator = new Random(randomSeed);

        // Simulate different cases of families until they have a boy and a girl
        while (totalExperiments < numFamiliesToSimulate) {
            while (!(hasGirl && hasBoy)) { // Check until there is a boy and a girl in the family
                double randomGender = randomGenerator.nextDouble();
                if (randomGender < 0.5) {
                    hasGirl = true;
                } else {
                    hasBoy = true;
                }
                totalChildren++;
                childrenInCurrentFamily++;
            }

            // Update statistics based on the number of children in the family
            if (childrenInCurrentFamily == 2) {
                familiesWithTwoChildren++;
            } else if (childrenInCurrentFamily == 3) {
                familiesWithThreeChildren++;
            } else {
                familiesWithFourOrMoreChildren++;
            }

            // Reset flags and counters for the next family
            totalExperiments++;
            hasGirl = false;
            hasBoy = false;
            childrenInCurrentFamily = 0;
        }

        // Calculate the average number of children in a family
        double averageChildren = (double) totalChildren / (double) numFamiliesToSimulate;

        // Output the results
        System.out.println("Average: " + averageChildren + " children to get at least one of each gender.");
        System.out.println("Number of families with 2 children: " + familiesWithTwoChildren);
        System.out.println("Number of families with 3 children: " + familiesWithThreeChildren);
        System.out.println("Number of families with 4 or more children: " + familiesWithFourOrMoreChildren);

        // Determine the most common number of children in a family
        if (familiesWithTwoChildren >= familiesWithThreeChildren && familiesWithTwoChildren >= familiesWithFourOrMoreChildren) {
            System.out.println("The most common number of children is 2.");
        } else if (familiesWithThreeChildren > familiesWithTwoChildren && familiesWithThreeChildren >= familiesWithFourOrMoreChildren) {
            System.out.println("The most common number of children is 3.");
        } else {
            System.out.println("The most common number of children is 4 or more.");
        }
    }
}