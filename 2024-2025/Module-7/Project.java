import java.util.ArrayList;
import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        // 1
        ArrayList<Double> cost = new ArrayList<Double>();
        Scanner myScanner = new Scanner(System.in);

        // 2
        for (int i = 0; i < 15; i++) {
            Double input = myScanner.nextDouble();
            cost.add(input);
        }

        System.out.println("Original list: " + cost);

        myScanner.nextLine();

        // 3
        Double sum = 0.0;
        for (double num : cost) {
            sum += num;
        }

        // 4
        Double average = sum / cost.size();
        System.out.println("Average: " + average);

        // 5
        for (int i = 0; i < cost.size(); i++) {
            int minIdx = i;
            for (int j = i + 1; j < cost.size(); j++) {
                if (cost.get(j) < cost.get(minIdx)) {
                    minIdx = j;
                }
            }

            Double tmp = cost.get(minIdx);
            cost.set(minIdx, cost.get(i));
            cost.set(i, tmp);
        }

        System.out.println("Sorted list: " + cost);

        // 6
        int l = 0;
        int r = cost.size() - 1;
        int m = (l + r) / 2;
        for (int i = 0; i < cost.size() / 2; i++) {
            Double cur = cost.get(m);
            if (cur == average) {
                // 8
                cost.remove(m);
                break;
            } else if (cur < average) {
                l = m + 1;
            } else if (cur > average) {
                r = m - 1;
            }
            m = (l + r) / 2;
        }

        // 7 (I assume this is how it should be inserted?)
        cost.add(cost.size() / 2, average);

        // 9
        System.out.println("New list: " + cost);

        myScanner.close();
    }
}
