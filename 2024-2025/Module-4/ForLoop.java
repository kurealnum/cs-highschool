import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // exercise one
        Integer sum = 0;
        for (int i = 1; i < 6; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // exercise two
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }

        // exercise three
        Integer userSum = 0;
        for (int i = 0; i < 5; i++) {
            userSum += myScanner.nextInt();
        }
        System.out.println("User average: " + userSum / 5);

        // exercise four
        Integer evens = 0;
        Integer odds = 0;
        for (int i = 0; i < 4; i++) {
            Integer userEnteredInt = myScanner.nextInt();
            if (userEnteredInt % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
        }
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);
        myScanner.close();
    }
}
