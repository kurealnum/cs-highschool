import java.util.HashMap;

public class Module6Project {
    public static void main(String[] args) {
        double[] gpaArray = {5.6, 3.4, 2.3, 1.1, 0.7, 3.7, 4.0, 4.1, 3.2, 2.6};
        String[] nameArray = {
            "Jan", "Jon", "Ken", "Kate", "Ed", "Al", "Tina", "Joe", "Tim", "Zack"
        };

        // 1
        int[] gradeLevel = {9, 10, 11, 12, 9, 10, 12, 9, 11, 11};

        // 2 & 7
        int sum = 0;
        for (double gpa : gpaArray) {
            sum += gpa;
        }
        System.out.println("Average GPA: " + sum / (gpaArray.length));

        // 3 & 8
        String longestName = nameArray[0];
        for (String name : nameArray) {
            if (longestName.length() < name.length()) {
                longestName = name;
            }
        }
        System.out.print("Longest name: " + longestName + " - ");
        System.out.println("Length of longest name: " + longestName.length());

        // 4 & 9
        int highestGpaIndex = 0;
        double highestGpa = gpaArray[0];
        String highestGpaName = nameArray[0];

        for (int i = 0; i < gpaArray.length; i++) {
            if (highestGpa < gpaArray[i]) {
                highestGpa = gpaArray[i];
                highestGpaIndex = i;
                highestGpaName = nameArray[i];
            }
        }
        System.out.print("Highest GPA: " + highestGpa + " - ");
        System.out.print("Index of highest GPA: " + highestGpaIndex + " - ");
        System.out.println("Person with highest GPA: " + highestGpaName);

        // 5 & 10
        HashMap<Integer, Integer> studentsInGradeLevels = new HashMap<Integer, Integer>();
        for (int grade : gradeLevel) {
            Integer cur = studentsInGradeLevels.get(grade);
            // cur is null if it doesn't yet exist, so we have to wrap it in a conditional
            if (cur != null) {
                studentsInGradeLevels.put(grade, cur + 1);
            } else {
                studentsInGradeLevels.put(grade, 1);
            }
        }

        for (int grade : studentsInGradeLevels.keySet()) {
            System.out.println(grade + "th grade: " + studentsInGradeLevels.get(grade));
        }

        // 6
        for (int i = 0; i < nameArray.length; i++) {
            System.out.println(nameArray[i] + ": " + gpaArray[i]);
        }
    }
}
