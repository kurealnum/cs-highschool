import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        // exercise one
        Integer sum = 0;
        Integer x = 0;

        while (x < 5) {
            x++;
            sum += x;
        }

        System.out.println("Sum: " + sum);

        // exercise two
        Integer countdown = 10;
        while (countdown >= 0) {
            System.out.println(countdown);
            countdown--;
        }

        // exercise three
        Scanner myScanner = new Scanner(System.in);
        Integer count = 3;
        // reusing old variable
        sum = 0;

        while (count > 0) {
            sum += myScanner.nextInt();
            count--;
        }

        System.out.println("Sum: " + sum);

        // exercise four
        Integer odds = 0;
        Integer evens = 0;
        // reusing old variable again
        count = 6;

        while (count > 0) {
            Integer userInput = myScanner.nextInt();
            if (userInput % 2 == 0) {
                evens++;
            } else {
                odds++;
            }
            count--;
        }

        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

        myScanner.close();
    }
}
