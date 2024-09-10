import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Double doubleOne = myScanner.nextDouble();
        Double doubleTwo = myScanner.nextDouble();

        // not sure if this is the intended way to to do this; hopefully it is
        Integer roundedOne = (int) Math.round(doubleOne);
        Integer roundedTwo = (int) Math.round(doubleTwo);

        System.out.println(roundedOne - roundedTwo);

        myScanner.close();
    }
}
