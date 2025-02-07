import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListAlgorithm {
    public static void main(String[] args) {
        // 1
        ArrayList<Integer> myList = new ArrayList<Integer>();
        Scanner myScanner = new Scanner(System.in);

        // 2
        int numOfUserInput = 10;
        for (int i = 0; i < numOfUserInput; i++) {
            Integer userInput = myScanner.nextInt();
            myList.add(userInput);
        }

        // 3 & 4
        Integer minNumber = myList.get(0);
        int numbersLessThanFive = 0;

        for (int num : myList) {
            // 3
            if (num < 5) {
                numbersLessThanFive++;
            }

            // 4
            if (num < minNumber) {
                minNumber = num;
            }
        }

        // 5, 6, and 7
        System.out.println(myList);
        System.out.println("Minimum number in myList: " + minNumber);
        System.out.println("# of elements less than 5: " + numbersLessThanFive);

        myScanner.close();
    }
}
