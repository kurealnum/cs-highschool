import java.util.Scanner;

public class ModuleOneProject {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        // gathering data
        System.out.println("Input the name of your course");
        String courseName = myScanner.nextLine();

        System.out.println("Input the number of minutes spent in your classroom");
        Integer classroomTime = myScanner.nextInt();

        System.out.println("Input your two classwork scores");
        Integer classroomScoreOne = myScanner.nextInt();
        Integer classroomScoreTwo = myScanner.nextInt();

        System.out.println("Input your three quiz scores");
        Double quizScoreOne = myScanner.nextDouble();
        Double quizScoreTwo = myScanner.nextDouble();
        Double quizScoreThree = myScanner.nextDouble();

        System.out.println("Input your one test score");
        Double testScore = myScanner.nextDouble();

        // calculations
        Double averageClassroomGrade = (double) (classroomScoreOne + classroomScoreTwo) / 2;
        Double averageQuizGrade = (double) (quizScoreOne + quizScoreTwo + quizScoreThree) / 3;
        Double testGrade = testScore;

        // + 0.5 for rounding
        Integer overallGrade =
                (int)
                        ((averageClassroomGrade * 0.25)
                                + (averageQuizGrade * 0.35)
                                + (testGrade * 0.40)
                                + 0.5);

        // outputting data
        System.out.println("Grades for " + courseName);
        System.out.println("Time spent in " + courseName + " (minutes): " + classroomTime);
        System.out.println("Average classwork grade: " + averageClassroomGrade);
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Test grade: " + testGrade);
        System.out.println("Overall grade: " + overallGrade);

        myScanner.close();
    }
}
