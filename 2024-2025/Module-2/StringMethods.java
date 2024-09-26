import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise 1
        System.out.println("Enter a string");
        String userInput = myScanner.nextLine();
        System.out.println("Enter an integer");
        Integer n = myScanner.nextInt();

        System.out.println(
                userInput.substring(0, n) + userInput.substring((userInput.length() - n)));

        // exercise 2
        System.out.println("Enter a word");
        myScanner.nextLine(); // consume left over newline
        String wordOne = myScanner.nextLine();
        System.out.println("Enter another word");
        String wordTwo = myScanner.nextLine();

        wordOne = wordOne.toLowerCase();
        wordTwo = wordTwo.toLowerCase();

        System.out.println(wordTwo.compareTo(wordOne));

        // exercise 3
        System.out.println("Input a sentence");
        String sentence = myScanner.nextLine();

        Integer firstSpace = sentence.indexOf(" ");
        String firstWord = sentence.substring(0, firstSpace);

        System.out.println("The first word in the sentence is " + firstWord);
        System.out.println("The length of the first word in the sentence is " + firstWord.length());

        myScanner.close();
    }
}
