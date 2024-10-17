import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exericse 1
        Integer input = myScanner.nextInt();
        if (input % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // exercise 2
        Integer inputTwo = myScanner.nextInt();
        if (inputTwo > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("0 or Negative");
        }

        // exercise 3
        myScanner.nextLine();
        String inputThree = myScanner.nextLine();
        if (inputThree.equals("John")) {
            System.out.println("Same");
        } else {
            System.out.println("Different");
        }

        myScanner.close();
    }
}
