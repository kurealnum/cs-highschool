import java.util.Scanner;

public class ComparingObjects {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise 1
        String input = myScanner.nextLine();

        if (input.equals("computer")) {
            System.out.println("Correct");
        } else {
            System.out.println("Wrong");
        }

        // exercise 2
        String wordOne = myScanner.nextLine();
        String wordTwo = myScanner.nextLine();

        if (wordOne.equals(wordTwo)) {
            System.out.println("Same");
        } else if (wordOne.equalsIgnoreCase(wordTwo)) {
            System.out.println("Almost");
        } else if (wordOne.length() == wordTwo.length()) {
            System.out.println("So close");
        } else {
            System.out.println("Denied");
        }

        myScanner.close();
    }
}
