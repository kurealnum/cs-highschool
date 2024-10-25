import java.util.Scanner;

public class CompoundBooleans {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise one
        int age = myScanner.nextInt();

        if (age >= 64 && age <= 100) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // exercise two
        int inputOne = myScanner.nextInt();
        int inputTwo = myScanner.nextInt();

        if (inputOne % 2 == 0 && inputTwo % 2 == 0 && inputOne >= 0 && inputTwo >= 0) {
            System.out.println("Both are positive and even.");
        } else {
            System.out.println("One is negative or odd.");
        }

        // exercise three
        double decimalInput = myScanner.nextDouble();

        if (decimalInput > -100 && decimalInput < 100) {
            if (decimalInput > 0) {
                System.out.println("You entered a positive number");
            } else {
                System.out.println("You entered a negative number");
            }
        } else {
            System.out.println("Invalid number");
        }

        myScanner.close();
    }
}
