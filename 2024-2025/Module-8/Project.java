import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        // 1
        int rows = 5;
        int cols = 4;
        Integer[][] testScores = new Integer[rows][cols];

        Scanner scanner = new Scanner(System.in);

        // 2
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int input = scanner.nextInt();
                testScores[i][j] = input;
            }
        }

        // 3
        int sum = 0;
        for (Integer[] outer : testScores) {
            for (Integer inner : outer) {
                sum += inner;
            }
        }

        // 4 (total = 20)
        Double average = (double) (sum) / 20;

        // 5
        int intAverage = (int) Math.round(average);
        Boolean found = false;

        for (Integer[] outer : testScores) {
            for (int inner : outer) {
                if (inner == intAverage) {
                    found = true;
                }
            }
        }

        // 6
        int testScoresAboveAverage = 0;
        int testScoresBelowAverage = 0;
        for (Integer[] outer : testScores) {
            for (int inner : outer) {
                if (inner < intAverage) {
                    testScoresBelowAverage++;
                }
                if (inner > intAverage) {
                    testScoresAboveAverage++;
                }
            }
        }

        // 7
        // a
        System.out.println("Scores: ");
        for (Integer[] outer : testScores) {
            for (int inner : outer) {
                System.out.print(inner + " ");
            }
            System.out.println("");
        }

        // b
        System.out.println("Average test scores: " + average);

        // c
        if (found) {
            System.out.println("The average was found in the test scores!");
        } else {
            System.out.println("The average was not found in the test scores.");
        }

        // d
        System.out.println("# of elements above average score: " + testScoresAboveAverage);
        System.out.println("# of elements below average score: " + testScoresBelowAverage);

        scanner.close();
    }
}
