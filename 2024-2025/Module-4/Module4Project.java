import java.util.Scanner;

public class Module4Project {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        // algorithm 1

        System.out.println("Enter a phrase: ");
        String userInputOne = myScanner.nextLine();

        // init variables
        int i = 1;
        int total = 0;

        // new string needs to start with initial character, no matter if its a vowel
        String newString = Character.toString(userInputOne.charAt(0));

        while (i < userInputOne.length()) {
            String curChar = Character.toString(userInputOne.charAt(i));
            if (curChar.equalsIgnoreCase("a")
                    || curChar.equalsIgnoreCase("e")
                    || curChar.equalsIgnoreCase("i")
                    || curChar.equalsIgnoreCase("o")
                    || curChar.equalsIgnoreCase("u")) {
                total++;
            } else {
                newString = newString + curChar;
            }
            i++;
        }

        System.out.println("Final string: " + newString);
        System.out.println("Total characters removed: " + total);

        // algorithm 2
        // init variables
        System.out.println("Enter a phrase: ");
        String userInputTwo = myScanner.nextLine();

        // same thing as algorithm 1
        String newStringTwo = Character.toString(userInputTwo.charAt(0));
        int totalTwo = 0;

        for (int j = 1; j < userInputTwo.length(); j++) {
            if (userInputTwo.charAt(j) == userInputTwo.charAt(j - 1)) {
                totalTwo++;
            } else {
                newStringTwo = newStringTwo + Character.toString(userInputTwo.charAt(j));
            }
        }

        System.out.println("Final string: " + newStringTwo);
        System.out.println("Total characters removed: " + totalTwo);

        myScanner.close();
    }
}
