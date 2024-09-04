import java.util.Scanner;

public class ExpAndAssign {
    public static void main(String[] args) {
        Integer integerOne = 3;
        Integer integerTwo = 7;
        Double doubleOne = 6.5;
        Double doubleTwo = 9.2;
        Boolean booleanOne = true;
        Boolean booleanTwo = false;
        String stringOne = "book";
        String stringTwo = "bag";
        Scanner myScanner = new Scanner(System.in);

        // exercise 1
        System.out.println(integerOne + doubleOne);

        // exercise 2
        System.out.println(integerOne % integerTwo);
        System.out.println(integerTwo % integerOne);

        // exercise 3
        System.out.println(stringOne + stringTwo);

        // exercise 4
        System.out.println(booleanOne == booleanTwo);

        // exercise 5
        Integer intUserInput = myScanner.nextInt();
        System.out.println(intUserInput);

        // exercise 6
        Double doubleUserInput = myScanner.nextDouble();
        System.out.println(doubleUserInput);

        // exercise 7
        Boolean booleanUserInput = myScanner.nextBoolean();
        System.out.println(booleanUserInput);

        // exercise 8
        myScanner.nextLine(); // need this to consume the left over newline from pressing enter
        String stringUserInput = myScanner.nextLine();
        System.out.println(stringUserInput);

        // exercise 9
        // System.out.println(integerOne / 0);
        // cant divide by 0

        // exercise 10
        System.out.println((integerOne + integerTwo) * doubleOne);

        myScanner.close();
    }
}
