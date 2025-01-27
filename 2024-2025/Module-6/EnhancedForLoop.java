public class EnhancedForLoop {
    public static void main(String[] args) {
        // exercise 1
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};
        int sum = 0;

        for (int num : numArray) {
            sum += num;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / numArray.length);

        // exercise 2
        String[] words = {"Cat", "Ant", "Dog", "Bird", "Fish", "Bear"};
        String acronym = "";

        for (String word : words) {
            acronym += word.substring(0, 1);
        }

        System.out.println("Acronym: " + acronym);
    }
}
