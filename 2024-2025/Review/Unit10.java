import java.util.Arrays;

public class Unit10 {
    public static void main(String[] args) {
        // Testing
        // 10.1
        countDown(10);

        // 10.2
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int res = binarySearch(arr, 8, 0, arr.length - 1);
        System.out.println(res);

        // 10.3
        int[] unsorted = {10, 9, 3, 4, 2, 6, 5, 1, 8, 7};
        mergeSort(unsorted, 0, arr.length - 1);
        System.out.println(Arrays.toString(unsorted));
    }

    public static void test(int[] arr) {
        arr[0] = 30;
    }

    // 10.1 Recursion
    // Task: Write a recursive method countDown(int n) that prints numbers from n down to 1.
    public static int countDown(int n) {
        System.out.println(n);
        if (n <= 1) {
            return -1;
        }
        return n - 1;
    }

    // 10.2 Recursive Searching
    // Task: Implement a recursive binary search method binarySearch(int[] arr, int target, int low,
    // int high) that returns the index of target in the sorted array arr, or -1 if not found.
    public static int binarySearch(int[] arr, int t, int l, int h) {
        if (h <= l) {
            return -1;
        }
        int m = h - l;
        if (arr[m] > t) {
            h = m - 1;
        } else if (arr[m] < t) {
            l = m + 1;
        } else if (arr[m] == t) {
            return m;
        }
        return binarySearch(arr, t, l, h);
    }

    // 10.3 Recursive Sorting
    // Task: Implement the merge sort algorithm recursively to sort an array of integers.
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            // Split and call again
            int m = l + (r - l) / 2;
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Merge
            merge(arr, l, m, r);
        }
    }

    public static void merge(int arr[], int l, int m, int r) {
        int a1 = m - l + 1;
        int a2 = r - m;

        int[] first = new int[a1];
        int[] last = new int[a2];

        for (int i = 0; i < a1; ++i) first[i] = arr[l + i];
        for (int j = 0; j < a2; ++j) last[j] = arr[m + 1 + j];

        int f = 0, j = 0, i = l;
        while (f < first.length && j < last.length) {
            if (first[f] < last[j]) {
                arr[i] = first[f];
                f++;
            } else {
                arr[i] = last[j];
                j++;
            }
            i++;
        }

        while (f < first.length) {
            arr[i] = first[f];
            f++;
            i++;
        }

        while (j < last.length) {
            arr[i] = last[j];
            j++;
            i++;
        }
    }
}

// 10.4 Conclusion
// Task: Reflect on the advantages and disadvantages of using recursion. Write a short paragraph
// discussing when recursion is preferred over iteration.
/*
 * Recursion is optimal in some cases, and not so optimal in others. It can help code be more explicit, but it can also bit a little more tedious (i.e. forgetting to provide a proper base case). Recursion also tends to be a little bit less readable. To summarize, some problems are solved best with recursion, and some aren't. */
