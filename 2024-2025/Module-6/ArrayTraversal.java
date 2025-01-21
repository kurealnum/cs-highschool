import java.util.Scanner;

public class ArrayTraversal {
    public static void main(String[] args) {
        // exercise one
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};
        int evenNumbers = 0;
        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] % 2 == 0) {
                evenNumbers++;
            }
        }
        System.out.println("There were " + evenNumbers + " even numbers.");

        // exercise two
        Scanner myScanner = new Scanner(System.in);
        String[] stringArray = new String[5];

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println("Enter a string: ");
            stringArray[i] = myScanner.nextLine();
        }

        // get words that start with a vowel

        int numberOfVowels = 0;

        for (int i = 0; i < stringArray.length; i++) {
            String firstLetter = stringArray[i].substring(0, 1);
            if (firstLetter.compareToIgnoreCase("a") == 0
                    || firstLetter.compareToIgnoreCase("e") == 0
                    || firstLetter.compareToIgnoreCase("i") == 0
                    || firstLetter.compareToIgnoreCase("o") == 0
                    || firstLetter.compareToIgnoreCase("u") == 0) {
                numberOfVowels++;
            }
        }

        String[] vowelWords = new String[numberOfVowels];
		int curVowelWordsIndex = 0;

        for (int i = 0; i < stringArray.length; i++) {
            String firstLetter = stringArray[i].substring(0, 1);
            if (firstLetter.compareToIgnoreCase("a") == 0
                    || firstLetter.compareToIgnoreCase("e") == 0
                    || firstLetter.compareToIgnoreCase("i") == 0
                    || firstLetter.compareToIgnoreCase("o") == 0
                    || firstLetter.compareToIgnoreCase("u") == 0) {
                vowelWords[curVowelWordsIndex] = stringArray[i];
				curVowelWordsIndex++;
            }
        }

        // print list of words and words that start with a vowel

        System.out.print("All words: ");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.print(stringArray[i] + " ");
        }

        System.out.println();
        System.out.print("Vowel words: ");
        for (int i = 0; i < vowelWords.length; i++) {
            System.out.print(vowelWords[i] + " ");
        }
        System.out.println();

        myScanner.close();
    }
}
