import java.util.ArrayList;
import java.util.Scanner;

public class TraversingArrayList {
    public static void main(String[] args) {
        ArrayList<Double> myList = new ArrayList<Double>();
        Scanner myScanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Input a double: ");
            Double userInput = myScanner.nextDouble();
            myList.add(userInput);
        }

        Double sum = 0.0;
        for (Double num : myList) {
            sum += num;
        }

        System.out.println(myList);
        System.out.println("Sum: " + sum);

        myScanner.close();
    }
}
