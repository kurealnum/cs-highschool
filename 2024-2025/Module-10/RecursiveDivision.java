import java.util.*;

public class RecursiveDivision {
    // Class variables to hold counts
    public static int odd;
    public static int divided;

    // Recursive method to perform the division and count the odd numbers and divisions
    public static void recursiveDivide(int number, List<Integer> results) {
        // Add the current number to the results list
        results.add(number);

        // If the number is odd, subtract 1 and count it
        if (number % 2 == 1) {
            number--;
            odd++;
            recursiveDivide(number, results);
        }

        // If the number is even and greater than 0, divide by 2 and count it
        else if (number % 2 == 0 && number > 0) {
            number = number / 2;
            divided++;
            recursiveDivide(number, results);
        }
    }

    // Method to search for a specific number in the results array.
    // Use a loop and if found return true, if not found return false.
    public static boolean searchNumber(List<Integer> results, int target) {
        int m = results.size() / 2;
        int l = 0;
        int r = results.size();

        while (l < r) {
            m = (l + r) / 2;
            int cur = results.get(m);
            if (cur == target) {
                return true;
            } else if (target > cur) {
                r = m - 1;
            } else if (target < cur) {
                l = m;
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = s.nextInt();
        List<Integer> results = new ArrayList<>();

        // Reset counts
        odd = 0;
        divided = 0;

        // Perform the recursive division
        recursiveDivide(number, results);

        // Convert List to array for demonstration
        Integer[] resultsArray = results.toArray(new Integer[0]);

        // Output the results
        System.out.println("Odd count: " + odd);
        System.out.println("Divide count: " + divided);
        System.out.println("Results array: " + Arrays.toString(resultsArray));

        // Search for a specific number
        int target = 12;
        boolean found = searchNumber(results, target);
        System.out.println(
                "Number " + target + (found ? " is " : " is not ") + "in the results array.");
        s.close();
    }
}
