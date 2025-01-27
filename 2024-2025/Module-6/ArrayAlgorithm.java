public class ArrayAlgorithm {
    public static void main(String[] args) {
        // exercise 1
        int[] numArray = {2, 5, 6, 7, 12, 45, 56, 57, 90};
        int max = numArray[0];
        for (int num : numArray) {
            if (max < num) {
                max = num;
            }
        }

        System.out.println(max);

        // exercise 2
        String[] words = {"Cat", "Ant", "Dog", "Bird", "Fish", "Bear"};

        // printing original array

        System.out.println("Original array");
        for (String word : words) {
            System.out.print(word + " ");
        }

        // reverse array

        for (int i = 0; i < words.length / 2; i++) {
            String tmp = words[i];
            words[i] = words[words.length - i - 1];
            words[words.length - i - 1] = tmp;
        }

        System.out.println();

        // printing reversed array

        System.out.println("Reversed array");
        for (String word : words) {
            System.out.print(word + " ");
        }

        System.out.println();
    }
}
