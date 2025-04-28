import java.util.ArrayList;

public class Unit7 {
    public static void main(String[] args) {
        // 7.1 ArrayLists
        // Task: Create an ArrayList of integers named numbers. Add the values 10, 20, 30, 40, and
        // 50 to the list. Then, print each element using its index.

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }

        System.out.println();

        // 7.2 ArrayList Methods
        // Task: Given an ArrayList of strings, perform the following operations:

        ArrayList<String> strings = new ArrayList<>();
        strings.add("str1");
        strings.add("str2");
        strings.add("str3");

        // a) Add a new string to the list.
        strings.add("new");

        // b) Retrieve and print the first element.
        System.out.println(strings.get(0));

        // c) Replace the second element with a new string.
        strings.remove(1);
        strings.add(1, "newstring");

        // d) Remove the last element from the list.
        strings.remove(strings.size() - 1);

        // 7.3 Traversing ArrayLists
        // Task: Using a for loop, iterate through an ArrayList of integers and print all even
        // numbers.

        for (int x : numbers) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
            }
        }

        System.out.println();

        // 7.4 Developing Algorithms using ArrayLists
        // Task: Write a method that takes an ArrayList of integers and returns the average of the
        // numbers.

        int sum = 0;
        for (int x : numbers) {
            sum += x;
        }

        System.err.println("Average: " + sum / numbers.size());

        searchArray("nothere", strings);

        // 7.6 Sorting
        // Task: Implement the selection sort algorithm to sort an ArrayList of integers in
        // ascending order.

        ArrayList<Integer> unsorted = new ArrayList<>();

        unsorted.add(10);
        unsorted.add(9);
        unsorted.add(8);
        unsorted.add(7);
        unsorted.add(6);
        unsorted.add(5);
        unsorted.add(4);
        unsorted.add(3);
        unsorted.add(2);
        unsorted.add(1);

        for (int i = 0; i < unsorted.size(); i++) {
            int min_index = i;
            for (int j = i; j < unsorted.size(); j++) {
                int cur = unsorted.get(j);
                if (cur < unsorted.get(min_index)) {
                    min_index = j;
                }
            }
            int tmp = unsorted.get(i);
            unsorted.set(i, unsorted.get(min_index));
            unsorted.set(min_index, tmp);
        }
        System.out.println(unsorted);

        // insertion sort
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(10);
        arr.add(9);
        arr.add(8);
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        for (int i = 1; i < arr.size(); i++) {
            int j = i;
            while (j > 0 && arr.get(j - 1) > arr.get(j)) {
                int tmp = arr.get(j);
                arr.set(j, arr.get(j - 1));
                arr.set(j - 1, tmp);
                j--;
            }
        }

        System.out.println(arr);
    }

    // 7.5 Searching
    // Task: Implement a method that performs a linear search on an ArrayList of strings to find
    // a target string. Return the index of the target if found; otherwise, return -1.
    public static int searchArray(String target, ArrayList<String> arr) {
        for (String s : arr) {
            if (target.equals(s)) {
                return arr.indexOf(s);
            }
        }
        return -1;
    }
}
