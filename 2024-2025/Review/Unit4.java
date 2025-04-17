public class Unit4 {
    public static void main(String[] args) {
        // 4.1 while Loops
        // Task: Write a program that counts down from 10 to 1 using a while loop, printing each
        // number.

        int count = 10;
        while (count >= 1) {
            System.out.println(count);
            count--;
        }

        System.out.println();

        // 4.2 for Loops
        // Task: Write a program that prints the first 10 even numbers using a for loop.

        for (int i = 2; i < 22; i += 2) {
            System.out.println(i);
        }

        // 4.3 Developing Algorithms Using Strings
        // Task: Write a program that reverses a given string. For example, if the input is "hello",
        // the output should be "olleh".

        String input = "hello";
        int len = input.length();
        String[] output = new String[len];
        for (int i = 0; i < len; i++) {
            output[i] = input.substring(len - i - 1, len - i);
        }

        String stringOutput = String.join("", output);
        System.out.println(stringOutput);

        // 4.4 Nested Iteration
        // Task: Write a program that prints a rectangle of asterisks with 5 rows and 4 columns
        // using nested loops.

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // 4.5 Informal Code Analysis
        // Task: Analyze the following code snippet and determine how many times the inner loop
        // executes:
        /*
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
            }
        }
        */

        // 5 times, System.out.println() is called 15 times
    }
}
