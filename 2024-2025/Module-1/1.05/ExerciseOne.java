import java.util.Scanner;

public class ExerciseOne {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Integer numerator = myScanner.nextInt();
        Integer denominator = myScanner.nextInt();
        Double result = (double) numerator / denominator;
        System.out.println(result);

        myScanner.close();
    }
}
