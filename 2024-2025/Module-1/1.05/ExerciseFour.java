import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Integer inputOne = myScanner.nextInt();
        Integer inputTwo = myScanner.nextInt();
        Integer inputThree = myScanner.nextInt();

        System.out.println((double) (inputOne + inputTwo + inputThree) / 3);

        myScanner.close();
    }
}
