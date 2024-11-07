import java.util.Scanner;

public class StringsAndLoops {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise one
        String userInput = myScanner.nextLine();
        int eCount = 0;

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.substring(i, i + 1).equals("e")) {
                eCount++;
            }
        }

        System.out.println("Number of e's: " + eCount);

        // exercise two
        String userInputTwo = myScanner.nextLine();
        String reversedString = "";
        String nextLetter = "";

        for (int i = 0; i < userInputTwo.length(); i++) {
            nextLetter = userInputTwo.substring(i, i + 1);
            reversedString = nextLetter + reversedString;
        }

        System.out.println("Original input: " + userInputTwo);
        System.out.println("Reversed string: " + reversedString);

        // exercise three
        String userInputThree = myScanner.nextLine();
        for (int i = 0; i < userInputThree.length(); i++) {
            if (userInputThree.substring(i, i + 1).equals("a")) {
                System.out.println("Index of first a: " + i);
                break;
            }
        }

        myScanner.close();
    }
}
