import java.util.Scanner;

public class Unit3 {
    public static void main(String[] args) {

        // 3.1 Boolean Expressions
        // Task:
        // Create a program that stores two numbers in variables. Use Boolean expressions to check:
        // a) If the first number is greater than the second
        // b) If they are equal
        // Print the result of each check.

        int x = 3;
        int y = 5;

        if (x > y) {
            System.out.println("First number is greater than second");
        } else if (x == y) {
            System.out.println("Numbers are equal");
        }

        // 3.2 The if Statement
        // Task:
        // Write a program that stores a person’s age in a variable.
        // If the age is 18 or older, print "You're an adult!". Otherwise, do nothing.

        int age = 19;
        if (age >= 18) {
            System.out.println("You're an adult!");
        }

        // 3.3 if-else Statements
        // Task:
        // Create a program that stores the temperature in a variable. If it’s above 75, print "It’s
        // warm!". Otherwise, print "It’s cold!".

        int temp = 75;
        if (temp > 75) {
            System.out.println("It's warm!");
        } else {
            System.out.println("It's cold!");
        }

        // 3.4 else-if Statements
        // Task:
        // Write a program that stores a test score.
        // Print a letter grade based on the score using the following:
        // a) 90 and above: A
        // b) 80 to 89: B
        // c) 70 to 79: C
        // d) 60 to 69: D
        // e) Below 60: F

        int score = 80;
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {

            System.out.println("C");
        } else if (score >= 60) {

            System.out.println("D");
        } else {

            System.out.println("F");
        }

        // 3.5 Compound Boolean Expressions
        // Task:
        // Create a program that checks if a person can access a secure area. They must be at least
        // 18 and have an access card (boolean hasCard = true).
        // Print "Access granted" if both are true. Otherwise, print "Access denied".

        int secureAge = 18;
        boolean hasCard = true;
        if (secureAge >= 18 && hasCard) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }

        // 3.6 Equivalent Boolean Expressions
        // Task:
        // Given two boolean variables isRainy and isSnowy, write two equivalent if-statements to
        // check if neither is true.
        // Use both the original expression and an equivalent using De Morgan's Law.

        boolean isRainy = true;
        boolean isSnowy = false;

        if (!(isRainy || isSnowy) || !(isRainy) && !(isSnowy)) {
            System.out.println("It is both rainy and snowy");
        }

        // 3.7 Comparing Objects
        // Task:
        // Create two String variables that contain the same text but are different objects.
        // Use both == and .equals() to compare them. Print the results and explain the difference
        // in a comment.

        String str1 = "Hello";
        String str2 = "Hello";

        // Compares memory addresses
        if (str1 == str2) {
            System.out.println("Memory addresses are the same");
        }

        // Compares contents of strings
        if (str1.equals(str2)) {
            System.out.println("Contents of strings are equal");
        }

        // Extra: Boolean Expressions and if Statements Quiz
        // Task:
        // Write a program that asks for a username and password.
        // If the username equals "admin" and the password equals "pass123", print "Login
        // successful".
        // Otherwise, print "Access denied".

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username = myScanner.nextLine();
        System.out.print("Enter your password: ");
        String password = myScanner.nextLine();

        if (username.equals("admin") && password.equals("pass123")) {
            System.out.println("Login successful");
        } else {
            System.out.println("Access denied");
        }

        myScanner.close();
    }
}
