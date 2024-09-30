import java.util.Scanner;

public class TwoPointZeroEight {
    public static void main(String[] args) {
        // exercise one
        int maxValue = Integer.MAX_VALUE;
        maxValue += 1;
        System.out.println(maxValue);
        int minValue = Integer.MIN_VALUE;
        minValue -= 1;
        System.out.println(minValue);

        // exercise two
        Integer a = null;
        Integer b = null;
        System.out.println(a);
        System.out.println(b);
        Scanner myScanner = new Scanner(System.in);
        a = myScanner.nextInt();
        b = myScanner.nextInt();
        Double average = (double) (a + b) / 2;
        System.out.println(a);
        System.out.println(b);
        System.out.println(average);

        // exercise 3
        Integer length;
        Double width;
        length = myScanner.nextInt();
        width = myScanner.nextDouble();
        System.out.println("Area of rectangle = " + (length * width));
        myScanner.close();
    }
}
