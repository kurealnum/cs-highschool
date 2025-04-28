public class Unit8 {
    public static void main(String[] args) {
        // 8.1 2D Arrays
        // Task: Create a 2D integer array representing a 3x3 matrix.
        /* Assign values to each element such that the matrix looks like this:

        1 2 3
        4 5 6
        7 8 9

        Then, print the matrix in a formatted manner. */

        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int[] row : matrix) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        // 8.2 Traversing 2D Arrays
        // Task: Given a 2D array of integers, write a program that calculates and prints the sum of
        // each row and the sum of each column.

        // Rows
        for (int[] row : matrix) {
            int rowSum = 0;
            for (int col : row) {
                rowSum += col;
            }
            System.out.println(rowSum);
        }

        // Cols
        for (int i = 0; i < matrix[0].length; i++) {
            int colSum = 0;
            for (int j = 0; j < matrix.length; j++) {
                colSum += matrix[j][i];
            }
            System.out.println(colSum);
        }
    }
}
