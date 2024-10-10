import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise one
        Double input = myScanner.nextDouble();
        if (input == 17.7) {
            System.out.println("EQUAL");
        }

        // exercise two
        Integer inputTwo = myScanner.nextInt();
        if (inputTwo == 25) {
            System.out.println("EQUAL");
        }

        // exercise three
        Integer intOne = myScanner.nextInt();
        Integer intTwo = myScanner.nextInt();
        if (intOne == intTwo * 2) {
            System.out.println("Doubled");
        }

        // exercise four
        Integer divisibleInt = myScanner.nextInt();
        if (divisibleInt % 2 == 0) {
            System.out.println("Integer is divisible by 2");
        }
        if (divisibleInt % 10 == 0) {
            System.out.println("Integer is divisible by 10");
        }
        if (divisibleInt % 2 == 0 || divisibleInt % 10 == 0) {
            System.out.println("Integer is divisible by 2 and 10");
        }
        myScanner.nextLine();

        // exercise five
        String userString = myScanner.nextLine();
        if (userString.compareTo("Nice") == 0) {
            System.out.println("Same");
        }
        myScanner.close();
    }
}
