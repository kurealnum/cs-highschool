import java.util.ArrayList;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many names would you like to add to the list? ");
        int numOfNames = scanner.nextInt();

        // clear scanner from nextInt
        scanner.nextLine();

        for (int i = 0; i < numOfNames; i++) {
            System.out.println("Enter a name: ");
            String name = scanner.nextLine();
            list.add(name);
        }

        int vowelCount = 0;
        for (String name : list) {
            String firstLetter = name.substring(0, 1);
            if (firstLetter.equalsIgnoreCase("a")
                    || firstLetter.equalsIgnoreCase("e")
                    || firstLetter.equalsIgnoreCase("i")
                    || firstLetter.equalsIgnoreCase("o")
                    || firstLetter.equalsIgnoreCase("u")
                    || firstLetter.equalsIgnoreCase("y")) {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels found: " + vowelCount);

        scanner.close();
    }
}
