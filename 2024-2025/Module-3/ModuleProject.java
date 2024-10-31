import java.util.Scanner;

public class ModuleProject {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // ask the user if they would like to guess the code
        System.out.println("Would you like to guess the code?");
        String guessCode = myScanner.nextLine();
        if (guessCode.toLowerCase().equals("yes")) {
            // first part of the code ("the code" refers to the code that the user inputs)
            System.out.println("The first input is an integer. Enter your number:");
            Integer inputOne = myScanner.nextInt();

            if (inputOne >= 70 && inputOne < 80 || inputOne == 7) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Better luck next time.");
                myScanner.close();
                return;
            }

            // second part of the code
            myScanner.nextLine();
            System.out.println("The second input is a word. Enter your word:");
            String inputTwo = myScanner.nextLine();

            if (inputTwo.length() == 5) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Better luck next time.");
                myScanner.close();
                return;
            }

            // third part of the code
            System.out.println("The final input is an integer. Enter your number:");
            Integer inputThree = myScanner.nextInt();

            if (inputThree % 2 == 0) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Better luck next time.");
                myScanner.close();
                return;
            }

            System.out.println("Outstanding, you guessed the code!");

            myScanner.close();
            return;
        }
        myScanner.close();
        return;
    }
}
