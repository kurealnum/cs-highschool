import java.util.ArrayList;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 100; i++) {
            int randomNum = -100 + (int) (Math.random() * 200);
            list1.add(randomNum);
            list2.add(randomNum);
        }

        // selection sort
        int list1Iterations = 0;
        for (int i = 0; i < list1.size(); i++) {
            list1Iterations++;
            int minIndex = i;
            for (int j = i + 1; j < list1.size(); j++) {
                list1Iterations++;
                if (list1.get(j) < list1.get(minIndex)) {
                    minIndex = j;
                }
            }

            int temp = list1.get(i);
            list1.set(i, list1.get(minIndex));
            list1.set(minIndex, temp);
        }

        // insertion sort
        insertionSort(list2);
        int list2Iterations = list2.remove(list2.size() - 1);

        // 5 & 6
        ArrayList<Integer> sortedList = insertionSort(list2);
        int sortedListIterations = sortedList.remove(sortedList.size() - 1);

        System.out.println("Insertion sort iterations: " + list1Iterations);
        System.out.println("List 1: " + list1);
        System.out.println("Selection sort iterations: " + list2Iterations);
        System.out.println("List 2: " + list2);
        System.out.println("Insertion sort (on sorted list) iterations: " + sortedListIterations);
        System.out.println("Sorted (sorted) list: " + sortedList);
    }

    // number of iterations is appended to the end of the returned array
    public static ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
        int iterations = 0;
        for (int i = 1; i < arr.size(); i++) {
            iterations++;
            for (int j = 0; j < i; j++) {
                iterations++;
                if (arr.get(i) < arr.get(j)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(i));
                    arr.set(i, temp);
                }
            }
        }

        arr.add(iterations);
        return arr;
    }
}
