public class Unit6 {
    public static void main(String[] args) {
        // 6.1 Arrays
        // Task: Create an integer array named numbers with 5 elements. Assign the values 10, 20,
        // 30, 40, and 50 to the array. Then, print each element using its index.

        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        // 6.2 Traversing Arrays
        // Task: Given an array of integers, write a program that prints all even numbers in the
        // array using a for loop.

        for (int x : numbers) {
            if (x % 2 == 0) {
                System.out.print(x);
            }
        }

        System.out.println();

        // 6.3 Enhanced for Loop for Arrays
        // Task: Using the enhanced for loop, iterate through an array of strings containing names
        // and print each name in uppercase.

        String[] names = {"bob", "joseph", "mary"};

        for (String name : names) {
            System.out.print(name.toUpperCase() + " ");
        }

        System.out.println();

        // 6.4 Developing Algorithms Using Arrays
        // Task: Write a method that takes an array of integers and returns the average of the
        // numbers.

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }
        System.out.println("Average: " + sum / numbers.length);
    }
}
