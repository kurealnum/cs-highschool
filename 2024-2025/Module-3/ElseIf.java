import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise 1
        Integer input = myScanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Even");
        } else if (input % 2 == 1) {
            System.out.println("Odd");
        } else {
            System.out.println("Neither");
        }

        // exercise 2
        Integer inputTwo = myScanner.nextInt();
        if (inputTwo > 0) {
            System.out.println("Positive");
        } else if (inputTwo < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        // exercise 3
        myScanner.nextLine();
        String strInput = myScanner.nextLine();
        if (strInput.equals("John")) {
            System.out.println("I know him");
        } else if (strInput.equals("Jane")) {
            System.out.println("I know her");
        } else {
            System.out.println("I don't know that person");
        }

        myScanner.close();
    }
}
