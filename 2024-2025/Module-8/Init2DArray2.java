import java.util.Scanner;

public class Init2DArray2 {
    public static void main(String[] args) {
        // 1 & 2 (assuming the "a.v. 13, 15, 15" was meant to be "a.v. 13, 14, 15")
        int[][] array = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15}};

        // 3
        for (int i = 0; i < array.length; i++) {
            for (int num : array[i]) {
                System.out.print(num + " ");
            }
            System.out.println("");
        }

        // 4
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        // 5, 6, & 7
        Boolean found = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == userInput) {
                    System.out.println("Your number was found at row " + i + ", col " + j);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("Your number was not found in the array");
        }

        scanner.close();
    }
}
