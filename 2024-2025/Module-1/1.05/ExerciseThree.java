import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Double input = myScanner.nextDouble();
        Double next = (input % 1);
        System.out.print((int) (next * 10) + " ");
        next = (next * 10) % 1;
        System.out.print((int) (next * 10) + " ");
        next = (next * 10) % 1;
        System.out.print((int) (next * 10));
        System.out.println();

        myScanner.close();
    }
}
